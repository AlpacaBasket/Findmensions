/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import java.io.Serializable;

/**
 *
 * @author n3148087
 */
public class Message implements Serializable
{

    private String sender;
    private String receiver;
    private String msg;

    /**
     *
     * @return the sender
     */
    public String getSender()
    {
        return sender;
    }

    /**
     * Empty default constructor
     */
    public Message()
    {
    }

    /**
     * Creates the message given the below parameters
     *
     * @param sender
     * @param setMsg
     * @param receiver
     */
    public Message(String sender, String setMsg, String receiver)
    {
        msg = setMsg;
        this.sender = sender;
        this.receiver = receiver;
    }

    /**
     * Sets the sender for the message
     *
     * @param sender
     */
    public void setSender(String sender)
    {
        this.sender = sender;
    }

    /**
     * Gets the receiver of a message
     *
     * @return
     */
    public String getReceiver()
    {
        return receiver;
    }

    /**
     * Sets the receiver of the message
     *
     * @param receiver
     */
    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    /**
     * Get the message
     *
     * @return
     */
    public String getMsg()
    {
        return msg;
    }

    /**
     * Sets the content of the message
     *
     * @param msg
     */
    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return "Message{" + "sender=" + sender + ", receiver=" + receiver + ", msg=" + msg + '}';
    }

}
