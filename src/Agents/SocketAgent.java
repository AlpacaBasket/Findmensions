/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masproject.Agents;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author n3148087
 */

public class SocketAgent extends MetaAgent
{

    private class QueueThread implements Runnable
    {

        SocketAgent agent;
        Thread thread;

        public QueueThread(SocketAgent agent)
        {
            this.agent = agent;
            thread = new Thread(this);
            thread.start();
        }

        @Override
        public void run()
        {
            while (true)
            {
                try
                {
                    Message msg = agent.getQueue().take();
                    agent.writeMessage(msg);
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(SocketAgent.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }
    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;
    private Router router;
    private int port = 3210;
    private List<String> clientNames;
    private QueueThread qeuethread;

    /**
     * 
     * @return Names of the clients on it's own socket
     */
    public List<String> getNameList()
    {
        return clientNames;
    }

    /**
     * Creates a socketAgent using a portal as the host
     * @param name
     * @param connection
     * @param portal
     */
    public SocketAgent(String name, String connection, Portal portal)
    {
        super(name);
        this.portal = portal;
        //this gets accessed by more than on thread not  sure if this is the 
        //"correct" way to do this however
        clientNames = Collections.synchronizedList(new ArrayList());
        if (connection == null)
        {
            connection = "localhost";
        }
        try
        {

            socket = new Socket(connection, port);
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            ((ObjectOutputStream) outputStream).writeObject(new Message(this.getName(), "/join", ""));

        } catch (IOException ex)
        {
            Logger.getLogger(SocketAgent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Creates a socketAgent using a router as the host
     * @param name
     * @param router
     * @param soc
     */
    public SocketAgent(String name, Router router, Socket soc)
    {
        super(name);
        this.router = router;
        try
        {
            clientNames = Collections.synchronizedList(new ArrayList());
            socket = soc;
            outputStream = new ObjectOutputStream(soc.getOutputStream());

            ((ObjectOutputStream) outputStream).writeObject(new Message(this.getName(), "/join", ""));

        } catch (IOException ex)
        {
            Logger.getLogger(SocketAgent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *Writes a message to the sockets output stream
     * @param msg
     */
    public void writeMessage(Message msg)
    {
        try
        {
            ((ObjectOutputStream) outputStream).writeObject(msg);
        } catch (IOException ex)
        {
            Logger.getLogger(SocketAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run()
    {
        while (true)
        {

            try
            {
                if (inputStream == null)
                {
                    inputStream = new ObjectInputStream(socket.getInputStream());

                }

                Message msg = (Message) ((ObjectInputStream) inputStream).readObject();
                System.out.println(msg);
                parseMsg(msg);

            } catch (EOFException ex)
            {
                try
                {
                    socket.close();
                    inputStream.close();
                    outputStream.close();
                    router.remove(this.getName());
                } catch (IOException ex1)
                {
                    Logger.getLogger(SocketAgent.class.getName()).log(Level.SEVERE, null, ex1);
                }

            } catch (ClassNotFoundException | IOException ex)
            {

                Logger.getLogger(SocketAgent.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public void start()
    {
        super.start();
        this.qeuethread = new QueueThread(this);

    }

    /**
     * parses the message contents
     * @param msg
     * @throws IOException
     */
    public void parseMsg(Message msg) throws IOException
    {
        
        if(msg.getReceiver().equals("/all"))
        {
        if(this.clientNames.contains(msg.getSender())&&router!=null)
        {
         router.tranferMsg(msg);
         return;
        }
        
        }

        if (!msg.getReceiver().equals("") && !msg.getReceiver().equals(this.getName()))
        {
            if (portal != null)
            {
                this.sendMessage(msg);

            } else if (router != null)
            {
                router.tranferMsg(msg);
            }

        } 
         else
        {
            //socket just connected send all known connected clients
            if (msg.getMsg().contains("/join"))
            {

                String names = "/clients ";
                if (portal != null)
                {
                    for (String name : portal.getInternalRoutingTable().keySet())
                    {
                        names += "," + name;

                    }

                }
                if (router != null)
                {
                    for (SocketAgent agent : router.socketMap.values())
                    {
                        if (agent != this)
                        {

                            for (String name : agent.clientNames)
                            {
                                names += "," + name;
                            }
                        }
                    }

                }
                Message msgs = new Message(this.getName(), names, msg.getSender());
                ((ObjectOutputStream) outputStream).writeObject(msgs);

            }
            //recived client infomation store it 
            if (msg.getMsg().contains("/clients"))
            {
                //split the message between the command and data
                String[] splitmsg = msg.getMsg().split(" ");
                if (splitmsg.length > 1)
                {
                    //write the new client list
                    splitmsg = splitmsg[1].split(",");
                    clientNames.clear();
                    clientNames.addAll(Arrays.asList(splitmsg));
                }

            }
        }
    }
}
