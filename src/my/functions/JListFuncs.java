/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.functions;

import javax.swing.ListSelectionModel;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jList1;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jList2;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel2;

/**
 *
 * @author zhengshuai
 */
public class JListFuncs {
    public static void pathList(){
         jList1.setModel(listModel);
            listModel.addElement("Path list of Application, Please Use Delete Button to delete this line");
            jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            jList1.setSelectedIndex(0);
            jList1.setVisibleRowCount(5);
    }
    
    public static void nameList(){
         jList2.setModel(listModel2);
            listModel2.addElement("Name list of Application, Please Use Remove Button to remove this line");
            jList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            jList2.setSelectedIndex(0);
            jList2.setVisibleRowCount(5);
    }
}
