/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.functions;

import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.addButton;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.addString;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.deleteButton;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.deleteString;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jList1;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.pathName;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.removeButton;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.removeString;

/**
 *
 * @author zhengshuai
 */
public class AddPath {
    public static AddListener addListener;
    public static void addPath(){
            addListener = new AddListener(addButton);
            addButton.setActionCommand(addString);
            addButton.addActionListener(addListener);
            addButton.setEnabled(false);
            
            deleteButton.setActionCommand(deleteString);
            deleteButton.addActionListener(new my.functions.DeleteListener());
            
           removeButton.setActionCommand(removeString);
            removeButton.addActionListener(new my.functions.RemoveListener());
            
        
          pathName.addActionListener(addListener);
          pathName.getDocument().addDocumentListener(addListener);
          String name = listModel.getElementAt(jList1.getSelectedIndex()).toString();
    }
    
}
