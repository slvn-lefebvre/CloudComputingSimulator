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
import static my.simulation.AddVM.server;

/**
 *
 * @author zhengshuai
 */
public class HandleRequest {
    public static void handlRequest(){
        // Last, but not least, we need to write the part of the simulation that
    // handles the Requests.  This will be the most interestiing part since we
    // get to discuss reading Resources.  Once again, we'll write this as an
    // inline application.  In practice, however, it's probably best to put the
    // implementation in its own file.
    server.deploy(new Application(0, StorageElement.MEGABYTE) {

      @Override
      public void init(VM.TaskScheduler scheduler) {}

      @Override
      public void handle(VM.TaskScheduler scheduler, Node origin, Request request) {
        // First, let's read the Resources from the disk.  Internally, the VM
        // makes use of a cache to simulate a real sysetm.  The first time we
        // read a file, it'll take a little while.  Subsequent reads will be
        // faster as long as the file is still in the cache.

        Integer startID = new Integer(request.getParameter("start"));
        Integer endID = new Integer(request.getParameter("end"));

        scheduler.read(startID);
        scheduler.read(endID);

        // Now that we have the resources, let's do a calculation.  To keep
        // things interesting, let's alter the complexity of the calculation
        // depending on the difference between the Resource IDs.  The formula
        // here is completely arbitrary -- any sort of behavior here would be
        // acceptable.

        // To demonstrate the ability to use various algorithms, we'll use an
        // O(n^2) algorithm here.


        int difference = endID - startID;
        scheduler.execute(1_000_000 * difference * difference, StorageElement.KILOBYTE, null);

        // Finally, let's send the result back to the client.
        scheduler.sendResponse(request, origin);
      }
    });

    }
    
}
