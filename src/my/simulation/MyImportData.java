/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import static my.simulation.AddSimulation.simulation;

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
    AddSimizerApp.addSimizerApp();
    
    //handle Request
    HandleRequest.handlRequest();
    
    //ClientGenerator
   // ClientGenerator.clientGenerator();
    //run simulation
    simulation.runSim();
  }
     
}