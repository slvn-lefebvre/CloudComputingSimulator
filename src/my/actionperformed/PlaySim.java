/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actionperformed;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.logTextArea;
import my.simulation.MyImportData;

/**
 *
 * @author zhengshuai
 */
public class PlaySim {
    public static void play(){
         ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        MyImportData.run();
        // Put things back
        System.out.flush();
        System.setOut(old);
      
        logTextArea.append(baos.toString());
        JOptionPane.showMessageDialog(null, baos.toString());
    }
    
}
