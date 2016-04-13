/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author n3148087
 */
public abstract class MetaAgent implements Runnable
{

    private String name;

    /**
     * Creation of Variables
     */
    protected final Thread thread;
    private final LinkedBlockingQueue<Message> queue;

    /**
     *
     */
    protected Portal portal;

    //For keeping a reference of all MetaAgent on this Virtual Machine
    static ArrayList<String> agentNames = new ArrayList<>();

    /**
     * Constructor for a MetaAgent
     *
     * @param name
     */
    public MetaAgent(String name)
    {
        thread = new Thread(this);
        queue = new LinkedBlockingQueue<>();
        this.name = name;
        thread.setName(this.getName());

    }

    /**
     * Creates an Agent by taking the portal it wants to be added to as a
     * parameter
     *
     * @param name
     * @param portal
     */
    public MetaAgent(String name, Portal portal)
    {
        thread = new Thread(this);
        queue = new LinkedBlockingQueue<>();
        this.name = name;
        this.portal = portal;
        portal.addToRoutingTable(name, this);

    }

    /**
     * Starts the thread for a MetaAgent
     */
    public void start()
    {
        thread.start();
    }

    @Override
    public abstract void run();

    /**
     * Get the name of the MetaAgent
     *
     * @return the name of the MetaAgent
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the new name of MetaAgent
     *
     * @param newName
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     *
     * @return MetaAgent Thread
     */
    public Thread getThread()
    {
        return thread;
    }

    /**
     *
     * @return Message queue for the MetaAgent
     */
    public LinkedBlockingQueue<Message> getQueue()
    {
        return queue;
    }

    /**
     * Sends the message
     *
     * @param msg
     */
    public void sendMessage(Message msg)
    {
        portal.receiveMessage(msg);
    }

    /**
     * Sends the message given the receiver and the message to be sent
     *
     * @param receiver
     * @param msg
     */
    public void sendMessage(String receiver, String msg)
    {
        Message msgs = new Message(this.name, msg, receiver);

        portal.receiveMessage(msgs);
    }

    /**
     * Adds the message to the queue
     *
     * @param msg
     */
    public void receiveMessage(Message msg)
    {
        queue.add(msg);
    }
}
