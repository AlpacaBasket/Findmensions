/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author n3148087
 */
public class UserAgent extends MetaAgent
{

    private DataProcessor proc;

    /**
     *
     * @return the processor
     */
    public DataProcessor getProc()
    {
        return proc;
    }

    /**
     * Sets the processor
     *
     * @param proc
     */
    public void setProc(DataProcessor proc)
    {
        this.proc = proc;
    }

    /**
     * Constructor for the UserAgent
     *
     * @param name
     */
    public UserAgent(String name)
    {
        super(name);
    }

    /**
     * Constructor for the UserAgent
     *
     * @param name
     * @param proc
     * @param portal
     */
    public UserAgent(String name, DataProcessor proc, Portal portal)
    {
        super(name, portal);
        this.proc = proc;
    }

    /**
     * Processes the message
     *
     * @param msg
     */
    public void processMsg(Message msg)
    {
    }

    /**
     * Constructor for the UserAgent
     *
     * @param name
     * @param portal
     */
    public UserAgent(String name, Portal portal)
    {
        super(name, portal);
    }

    /**
     * Passes message from queue to data processor
     */
    @Override
    public void run()
    {

        while (true)
        {
            if (proc != null)
            {

                try
                {
                    proc.processMsg(getQueue().take());
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(UserAgent.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else
            {

                try
                {
                    Message msg = getQueue().take();
                    processMsg(msg);
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(UserAgent.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

}
