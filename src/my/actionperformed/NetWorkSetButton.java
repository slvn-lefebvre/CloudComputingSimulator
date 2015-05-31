/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actionperformed;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField4;

/**
 *
 * @author zhengshuai
 */
public class NetWorkSetButton {
    public static JTextField latency= new JTextField();
    public static String latencyValue;
    public static double latencyValueDouble;
    public static void NetWorkSet(){
        
        Object[] message = {
            "Latency:", latency
        };
        Object[] options = {"OK","CANCEL"};
        int option = JOptionPane.showConfirmDialog(null, message, "Input the Values", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
 
            if (latency.getText().isEmpty() ) {
                JOptionPane.showOptionDialog(null, "No Value Input", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            } else {
                JOptionPane.showOptionDialog(null, "Set Successful", "Congratulations", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
            }
            latencyValue = latency.getText();
            jTextField4.setText(latencyValue);
        } else {
            JOptionPane.showOptionDialog(null, "Configure Canceled", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        }
        latencyValueDouble = Double.parseDouble(latencyValue);
    }
}
