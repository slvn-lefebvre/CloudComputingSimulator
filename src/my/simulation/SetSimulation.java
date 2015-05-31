/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import static my.simulation.AddClient.client;
import static my.simulation.AddNetwork.internet;
import static my.simulation.AddSimulation.simulation;
import static my.simulation.AddVM.server;

/**
 *
 * @author zhengshuai
 */
public class SetSimulation {
    
    public static void setSim(){
        // First, tell the client where it should send its Requests.
        client.setServiceAddress(server);
        // For the others, we use the Simulation instance that we created at the
        // beginning of this method.  Add the Nodes to the Simulation.
        //simulation.addNode(client);
        //simulation.addNode(server);
        
        // Next, add the Network to the Simulation.
        //simulation.addNetwork(internet);
        
        // Finally, associate the Nodes we added with the Network we added.
        //simulation.toNetworkAddNode(internet, client);
        //simulation.toNetworkAddNode(internet, server);
        
        //this replace the five lines code 
        
        simulation.toNetworkAddNodes(internet, server, client);
    }
}
