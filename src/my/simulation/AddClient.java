/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import fr.isep.simizer.nodes.ClientNode;

/**
 *
 * @author zhengshuai
 */
public class AddClient {
    public static int requestNum;
    public static int timestamp;
    public static ClientNode client;

    // When creating a ClientNode, we have to specify two parameters. The first
    // is the timestamp in the Simulation when the client should start sending
    // its requests.  Since we want it to start right away, we'll pass zero for
    // this value.  The next parameter is more important.  It's the number of
    // requests that the client should send before finishing.  In this example,
    // we have it set to 1.  Feel free to adjust the value and re-run the
    // Simulation to see the results.
    public static void addClient(){
        timestamp = 0;
        requestNum = 5;
        client = new ClientNode(timestamp, requestNum);
        
   
        
       
    }
    
}
