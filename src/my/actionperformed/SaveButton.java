/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actionperformed;

import java.io.File;
import javax.swing.JFileChooser;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.fileChooser;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.returnSaveVal;

/**
 *
 * @author zhengshuai
 */
public class SaveButton {
    public static void save(){
        if (returnSaveVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                //This is where a real application would save the file.
              
            } 
    }
    
}
