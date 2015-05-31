/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import fr.isep.simizer.Simulation;

/**
 *
 * @author zhengshuai
 */
public class AddSimulation {
    
    public static Simulation simulation;
    public static void AddSim(){
        simulation = new Simulation(10000);
    }
    
}
