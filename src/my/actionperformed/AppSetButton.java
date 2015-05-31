/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actionperformed;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField10;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField9;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel2;

/**
 *
 * @author zhengshuai
 */
public class AppSetButton {
    public static String classNameValue;
    public static JComboBox jcb2 = new JComboBox();
    public static String classPathNameValue;
    public static JComboBox jcb = new JComboBox();
    
    public static void AppNameSet(){

        
        jcb2.setModel(listModel2);
        jcb2.setEditable(true);
        
        
        Object[] options = {"OK","CANCEL"};
        
        int option = JOptionPane.showConfirmDialog( null, jcb2, "select or type a value", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
             JOptionPane.showOptionDialog(null, "Set Successful", "Congratulations", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
            classNameValue  = (String)jcb2.getSelectedItem();
            jTextField9.setText(classNameValue);
        } else {
            JOptionPane.showOptionDialog(null, "Configure Canceled", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        }
        
    }
    
    public static void AppPathSet(){
            
        
        jcb.setModel(listModel);
        jcb.setEditable(true);
        
        Object[] options = {"OK","CANCEL"};
        
        int option = JOptionPane.showConfirmDialog( null, jcb, "select or type a value", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
             JOptionPane.showOptionDialog(null, "Set Successful", "Congratulations", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
            classPathNameValue  = (String)jcb.getSelectedItem();
            jTextField10.setText(classPathNameValue);
        } else {
            JOptionPane.showOptionDialog(null, "Configure Canceled", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        }
        
    }
    
}
