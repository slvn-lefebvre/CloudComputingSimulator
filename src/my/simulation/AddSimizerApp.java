/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import fr.isep.simizer.app.Application;
import fr.isep.simizer.nodes.Node;
import fr.isep.simizer.nodes.VM;
import fr.isep.simizer.requests.Request;
import fr.isep.simizer.storage.StorageElement;
import static my.actionperformed.VmSetButton.memSizeValueLong;
import static my.simulation.AddVM.server;

/**
 *
 * @author zhengshuai
 */
public class AddSimizerApp {
    public static void addSimizerApp(){
    // The last step before running the Simulation is to create the Application
    // to handle the Requests.  Do do so, we'll create a subclass of the
    // Application class.  Normally, you would probably create a separate file
    // with the subclass, but I'm going to use an anonymous class to keep all
    // the code in one file.  Plus, this example isn't too long.

    // When creating the Application, we need to give it an ID.  We use zero
    // here since that is where the Requests will be sent.  In addition, we need
    // to define the amount of memory needed to run the application on a VM.
    
       
        
    Application handler = new Application(0, memSizeValueLong) {

      @Override
      public void init(VM.TaskScheduler scheduler) {
        // We don't really have anything we need to do in the constructor.
        // However, to demonstrate its use, we'll print some information about
        // the application that is starting.
        System.out.println("Starting Application #" + getId());
        System.out.println("Running on Node " + scheduler.getVM().getId()
                + " (" + scheduler.getVM().getClass().getName() + ")");
      }

      @Override
      public void handle(VM.TaskScheduler scheduler, Node origin, Request request) {
        // This is where we implement the logic to handle each request.
        
        // To begin, let's start by switching on whether the Request's action
        // is "short" or "long."  Within the swithc, we'll want to define the
        // amount of processing time needed to complete the Request, so let's
        // also create a variable to track that.
        int instructions;
        switch (request.getAction()) {
          case "short":
          default:
            instructions = 5_000_000;
            break;

          case "long":
            instructions = 100_000_000;
            break;
        }

        scheduler.execute(instructions, StorageElement.MEGABYTE, null);
        scheduler.sendResponse(request, origin);
      }
    };
    
    server.deploy(handler);
       
        
     

    }
                
    
}
