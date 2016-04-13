/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masproject.Agents;

/**
 *
 * @author n3148087
 */
@Deprecated
public abstract class DataProcessor
{

    /**
     * Reference to MetaAgent(deprecated)
     */
    protected final MetaAgent agent;

    /**
     *
     * @param agent
     */
    public DataProcessor(MetaAgent agent)
    {
        this.agent = agent;
    }

    /**
     *
     * @param msg
     */
    public abstract void processMsg(Message msg);

}
