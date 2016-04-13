/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masproject.Agents;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author n3148087
 */
public class Portal extends MetaAgent {

    private final Map<String, MetaAgent> InternalRoutingTable;
    private final Map<List<String>, MetaAgent> ExternalRoutingTable;
    private SocketAgent socketAgent;

    /**
     * Portal Constructor
     *
     * @param name
     */
    public Portal(String name) {
        super(name);

        InternalRoutingTable = new ConcurrentHashMap<>();
        ExternalRoutingTable = new ConcurrentHashMap<>();
        //because it exploded if more than one thread ever needs to work on it
    }

    /**
     * add the agent to the routing table
     *
     * @param name
     * @param agent
     */
    public void addToRoutingTable(String name, MetaAgent agent) {
        if (!InternalRoutingTable.containsKey(name)) {
            InternalRoutingTable.put(name, agent);
            propigate();
        } else {

        }
    }

    /**
     * return the internal routing table
     *
     * @return
     */
    public Map<String, MetaAgent> getInternalRoutingTable() {

        return InternalRoutingTable;

    }

    /**
     * set this portals socket agent
     *
     * @param agent
     */
    public void setSocketAgent(SocketAgent agent) {
        socketAgent = agent;
    }

    /**
     * Adds a portal to this portals external routing table if entry already
     * exists delete entry and add new entry
     *
     * @param portal
     */
    public void addPortal(Portal portal) {
        List<String> list = new ArrayList();

        if (ExternalRoutingTable.containsValue(portal)) {

            for (Map.Entry entry : ExternalRoutingTable.entrySet()) {

                if (entry.getValue() == portal) {
                    ExternalRoutingTable.remove(entry.getKey());
                }

            }

        }
        list.add(portal.getName());
        for (String entry : portal.InternalRoutingTable.keySet()) {
            list.add(entry);

        }
        this.ExternalRoutingTable.put(list, portal);

    }

    /**
     *
     * @param name
     * @return the name of an Agent
     */
    public MetaAgent getLocalAgent(String name) {
        return InternalRoutingTable.get(name);
    }

    /**
     *
     * Adds a portal to all known portals external routing tables
     */
    public void propigate() {

        try {
            for (Map.Entry entry : ExternalRoutingTable.entrySet()) {
                ((Portal) entry.getValue()).addPortal(this);
            }
            if (socketAgent != null) {
                String clients = "/clients ";
                for (String name : this.InternalRoutingTable.keySet()) {
                    clients += "," + name;

                }
                Message msg = new Message(this.getName(), clients, "");
                socketAgent.getQueue().put(msg);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Portal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Retrieves message from queue and then tries to send it to the agent in
     * the messages to field internal routing table takes president and then the
     * external routing table
     */
    @Override
    public void run() {
        while (true) {

            try {
                Message msg = getQueue().take();
                if (!msg.getReceiver().equals(this.getName())) {
                    if ("/all".equals(msg.getReceiver())) {
                       

                            for (MetaAgent agent : InternalRoutingTable.values()) {
                                agent.receiveMessage(msg);
                            }
                             if (InternalRoutingTable.containsKey(msg.getSender())) {
                            if (socketAgent != null) {
                                socketAgent.writeMessage(msg);
                            }
                        }

                    }
                   else if (InternalRoutingTable.containsKey(msg.getReceiver())) {
                        InternalRoutingTable.get(msg.getReceiver()).receiveMessage(msg);
                    } else {
                        boolean found = false;
                        for (Map.Entry<List<String>, MetaAgent> entry : ExternalRoutingTable.entrySet()) {
                            if (entry.getKey().contains(msg.getReceiver())) {
                                entry.getValue().receiveMessage(msg);
                                found = true;
                                break;
                            }
                        }
                        if (found == false && socketAgent != null) {
                            socketAgent.writeMessage(msg);
                        }

                    }

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Portal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
public void remove(String name)
    {
   
    InternalRoutingTable.remove(name);
    
    }


}
