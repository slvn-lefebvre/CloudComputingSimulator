/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import fr.isep.simizer.Simulation;
import fr.isep.simizer.laws.ConstantLaw;
import fr.isep.simizer.laws.GaussianLaw;
import fr.isep.simizer.network.Network;
import fr.isep.simizer.nodes.ClientNode;
import fr.isep.simizer.nodes.VM;
import fr.isep.simizer.requests.Request;
import fr.isep.simizer.requests.RequestFactory;
import static my.simulation.AddClient.client;
import static my.simulation.AddNetwork.internet;
import static my.simulation.AddSimulation.simulation;
import static my.simulation.AddVM.server;

/**
 *
 * @author zhengshuai
 */
public class MyImportData {
    
     //public static Simulation simulation = new Simulation(10000);

public static void run() {
  
    //create a instance of Simulation class
    AddSimulation.AddSim();
    
    //set storage
    SetResource.setResource();
    
    //create  a client use the ClientNode and define the request that the 
    //client will sent to the server
    AddClient.addClient();
    
    //create a VM server
    AddVM.addVM();
    
    //create a network to communicate with the client and server
    AddNetwork.addNetwork();
    
    //add all items(client,server,internet)  to simulation
    SetSimulation.setSim();
    
    //set request factory
    SetFactory.setFactory();
    
    //create a application
    //AddSimizerApp.addSimizerApp();
    
    //handle Request
    HandleRequest.handlRequest();
    //run simulation
    
    simulation.runSim();
  }
     
}