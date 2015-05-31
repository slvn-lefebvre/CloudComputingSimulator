/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import fr.isep.simizer.laws.GaussianLaw;
import fr.isep.simizer.network.Network;
import static my.actionperformed.NetWorkSetButton.defaultLatencyValueDouble;
import static my.actionperformed.NetWorkSetButton.latencyValueDouble;

/**
 *
 * @author zhengshuai
 */
public class AddNetwork {
    public static Network internet;
    public static double pingUser;
    public static double pingDefaut;
    public static void addNetwork(){
    // Now, we need to establish a way for the client and the server to
    // communicate.  To do that, we'll use a Network.  A network allows messages
    // to be sent between the various nodes in a simulation.

    // Here, we create the "internet" Network.  When creating the Network, we
    // specify a Law that defines how much delay should be added to requests
    // when they pass through the Network.  In this case, we are using a
    // Gaussian (normal) distribution with a mean of 60 ms and a standard
    // deviation of 10 ms.  You will find that Law instances are used throughout
    // the simulation to add customizable randomness.
        pingDefaut=defaultLatencyValueDouble;
    //Defaut ping of the Network, we defined 10;
        pingUser=latencyValueDouble;
    //the user define the latency with set Button of Network
        internet = new Network(new GaussianLaw(pingUser, pingDefaut));
    }
    
}
