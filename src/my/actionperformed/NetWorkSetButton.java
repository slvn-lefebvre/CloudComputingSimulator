/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actionperformed;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField11;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField4;

/**
 *
 * @author zhengshuai
 */
public class NetWorkSetButton {
    public static JTextField latency= new JTextField();
    public static JTextField defaultLatency= new JTextField();
    public static String latencyValue;
    public static String defaultLatencyValue;
    public static double latencyValueDouble;
    public static double defaultLatencyValueDouble;
    public static void NetWorkSet(){
        
        Object[] message = {
            "Latency:", latency,
            "Default Latency", defaultLatency
        };
        Object[] options = {"OK","CANCEL"};
        int option = JOptionPane.showConfirmDialog(null, message, "Input the Values", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
 
            if (latency.getText().isEmpty() && defaultLatency.getText().isEmpty() ) {
                JOptionPane.showOptionDialog(null, "No Value Input", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            } else {
                JOptionPane.showOptionDialog(null, "Set Successful", "Congratulations", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
            }
            latencyValue = latency.getText();
            defaultLatencyValue = defaultLatency.getText();
            jTextField4.setText(latencyValue);
            jTextField11.setText(defaultLatencyValue);
            
        } else {
            JOptionPane.showOptionDialog(null, "Configure Canceled", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        }
        latencyValueDouble = Double.parseDouble(latencyValue);
        defaultLatencyValueDouble = Double.parseDouble(defaultLatencyValue);
    }
}
