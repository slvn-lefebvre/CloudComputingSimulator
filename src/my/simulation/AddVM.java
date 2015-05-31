/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import fr.isep.simizer.nodes.VM;

import static my.actionperformed.VmSetButton.memSizeValueLong;
import static my.actionperformed.VmSetButton.powerLong;
import static my.simulation.SetResource.disk;

/**
 *
 * @author zhengshuai
 */
public class AddVM {
    public static VM server;
    public static void addVM(){
     // Now that we have the client, let's create a simple server.  The VM class
    // is a general machine that we can use as a server.  To get started, let's
    // create an instance of the class.
                                           

         server = new VM(null, disk, memSizeValueLong, powerLong);
         // if the user didn't set the parameters, than the server will use the default values
        
    }
}
