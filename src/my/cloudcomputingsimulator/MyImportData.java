/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.cloudcomputingsimulator;

import fr.isep.simizer.Simulation;
import fr.isep.simizer.laws.ConstantLaw;
import fr.isep.simizer.laws.GaussianLaw;
import fr.isep.simizer.network.Network;
import fr.isep.simizer.nodes.ClientNode;
import fr.isep.simizer.nodes.VM;
import fr.isep.simizer.requests.Request;
import fr.isep.simizer.requests.RequestFactory;

/**
 *
 * @author zhengshuai
 */
public class MyImportData {
    

public static void run() {
  
    Simulation simulation = new Simulation(10000);

    ClientNode client = new ClientNode(0, 1);

    
    RequestFactory factory = new RequestFactory();
    factory.addTemplate(1, new Request(1, "read", "resources=1_2", true));
    ClientNode.configureRequestFactory(factory);

 

    ClientNode.configureLaws(
            new ConstantLaw(1),
            new ConstantLaw(0),
            null);

  
    VM server = new VM();
    Network internet = new Network(new GaussianLaw(60, 10));

    client.setServiceAddress(server);

    simulation.addNode(client);
    simulation.addNode(server);
    simulation.addNetwork(internet);
    simulation.toNetworkAddNode(internet, client);
    simulation.toNetworkAddNode(internet, server);
    simulation.runSim();
  }
     
}