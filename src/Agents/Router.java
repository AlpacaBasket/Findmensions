/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masproject.Agents;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author n3148087
 */
public class Router extends MetaAgent {

    Map<String, SocketAgent> socketMap;

    int routerConnections = 0;

    ServerSocket socket;

    /**
     * Router Constructor
     *
     * @param name
     */
    public Router(String name) {

        super(name);
        socketMap = new ConcurrentHashMap<>();
        try {
            socket = new ServerSocket(3210, 1500);
        } catch (IOException ex) {
            Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * remove a socket agent from the router
     *
     * @param name
     */
    public void remove(String name) {
        socketMap.remove(name);

    }

    /**
     * Transfers messages between sockets on the router
     *
     * @param msg
     */
    public void tranferMsg(Message msg) {
        if (msg.getReceiver().equals("/all")) {
            for (SocketAgent agent : socketMap.values()) {
                if (!agent.getNameList().contains(msg.getSender())) {
                    agent.writeMessage(msg);
                }
            }
        }
        else
        {
        for (SocketAgent agent : socketMap.values()) {
            if (agent.getNameList().contains(msg.getReceiver())) {
                agent.writeMessage(msg);
                break;
            }

        }
        }
        

    }

    //accepts connections to this router and allocates a socket agent to handel them 
    @Override
    public void run() {
        while (true) {

            try {
                System.out.println("ready to connect new agent");
                Socket soc = null;
                soc = socket.accept();
                System.out.println(soc.toString());
                SocketAgent agent = new SocketAgent("Socket" + routerConnections, this, soc);
                routerConnections++;
                socketMap.put(agent.getName(), agent);
                agent.start();

            } catch (IOException ex) {
                Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
