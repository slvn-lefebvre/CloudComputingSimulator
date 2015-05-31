/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actionperformed;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField5;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField6;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField7;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField8;

/**
 *
 * @author zhengshuai
 */
public class VmSetButton {
        public static JTextField vmName = new JTextField();
        public static JTextField diskSize = new JTextField();
        public static JTextField memSize = new JTextField();
        public static JTextField power = new JTextField();
        public static String vmNameValue;
        public static String diskSizeValue;
        public static String memSizeValue;
        public static String powerValue;
        public static long diskSizeValueLong;
        public static long memSizeValueLong;
        public static long powerLong;
    public static void VmSet(){
        
        Object[] message = {
            "VM Name:", vmName,
            "Disk Size:", diskSize,
            "Mem Size", memSize,
            "Power",power
        };
        
        
        
        Object[] options = {"OK","CANCEL"};
        int option = JOptionPane.showConfirmDialog(null, message, "Input the Values", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            
            
            if (vmName.getText().isEmpty() && diskSize.getText().isEmpty() && memSize.getText().isEmpty()&& power.getText().isEmpty()) {
                JOptionPane.showOptionDialog(null, "No Value Input", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            } else {
                JOptionPane.showOptionDialog(null, "Set Successful", "Congratulations", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
            }
            vmNameValue = vmName.getText();
            diskSizeValue = diskSize.getText();
            memSizeValue = memSize.getText();
            powerValue = power.getText();
            
            
            jTextField5.setText(vmNameValue);
            jTextField6.setText(diskSizeValue);
            jTextField7.setText(memSizeValue);
            jTextField8.setText(powerValue);
            
           
        } else {
            JOptionPane.showOptionDialog(null, "Configure Canceled", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        }
        
        diskSizeValueLong = Long.parseLong(diskSizeValue);
        memSizeValueLong = Long.parseLong(memSizeValue);
        powerLong=Long.parseLong(powerValue);
    }
}
