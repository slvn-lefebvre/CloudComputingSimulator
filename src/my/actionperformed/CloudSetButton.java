/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.actionperformed;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField1;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField2;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jTextField3;

/**
 *
 * @author zhengshuai
 */
public class CloudSetButton {
    public static JTextField cloudName = new JTextField();
    public static JTextField latitude = new JTextField();
    public static JTextField longitude = new JTextField();
    public static String cloudNameValue;
    public static String LatitudeValue;
    public static String LongitudeValue;
    public static double LatitudeValueDouble;
    public static double LongitudeValueDouble;
    public static void CloudSet(){
       
        Object[] message = {
            "Name:", cloudName,
            "Latitude:", latitude,
            "Longitude", longitude
        };

        Object[] options = {"OK","CANCEL"};
        int option = JOptionPane.showConfirmDialog(null, message, "Input the Values", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
           
            if (cloudName.getText().isEmpty() && latitude.getText().isEmpty() && longitude.getText().isEmpty()) {
                JOptionPane.showOptionDialog(null, "No Value Input", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            } else {
                JOptionPane.showOptionDialog(null, "Set Successful", "Congratulations", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);
            }
            cloudNameValue = cloudName.getText();
            LatitudeValue = latitude.getText();
            LongitudeValue = longitude.getText();
          
            
            
            jTextField1.setText(cloudNameValue);
            jTextField2.setText(LatitudeValue);
            jTextField3.setText(LongitudeValue);
        } else {
            JOptionPane.showOptionDialog(null, "Configure Canceled", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        }
        LatitudeValueDouble = Double.parseDouble(LatitudeValue);
        LongitudeValueDouble = Double.parseDouble(LongitudeValue);
    }
    
}
