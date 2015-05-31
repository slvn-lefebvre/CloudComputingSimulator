/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import fr.isep.simizer.laws.ConstantLaw;
import fr.isep.simizer.laws.UniformLaw;
import fr.isep.simizer.nodes.ClientNode;
import fr.isep.simizer.requests.Request;
import fr.isep.simizer.requests.RequestFactory;

/**
 *
 * @author zhengshuai
 */
public class SetFactory {
    public static void setFactory(){
    // For the Requests, let's pretend that we're creating an application that
    // performs some sort of comparison between two locations.  Since that is
    // the case, we'll want each Request to reference two of the Resources.
    // We'll do this with a double for-loop.
        
    RequestFactory factory = new RequestFactory();
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        String query = "start=" + i + "&end=" + j;
        factory.addTemplate(i * 10 + j, new Request(0, "calc", query, true));
      }
    }

    // The last step for this part of the configuration is to configure the
    // ClientNode instances to use all of these Requests that we just created.
    // First, we need to give the RequestFactory to the ClientNodes.
    ClientNode.configureRequestFactory(factory);

    // Next, we need to set up the Laws for the ClientNodes so that they
    // use all of these available requests.
    ClientNode.configureLaws(new UniformLaw(100), new ConstantLaw(10), null);
    }
    
}
