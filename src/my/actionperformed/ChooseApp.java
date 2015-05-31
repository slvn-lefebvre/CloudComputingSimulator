/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actionperformed;

import java.io.File;
import javax.swing.JFileChooser;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.Open1;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.fileChooser;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel2;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.returnVal;

/**
 *
 * @author zhengshuai
 */
public class ChooseApp {
    public static void AppChoose(){
        
   

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                //This is where a real application would open the file.
                listModel2.addElement(file.getName());
                listModel.addElement(file.getPath());
            }
            
    }
    
    
}
