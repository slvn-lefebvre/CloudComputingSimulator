/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.functions;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jList1;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.pathName;

/**
 *
 * @author zhengshuai
 */
public class AddListener  implements ActionListener, DocumentListener{
    private boolean alreadyEnabled = false;
        private final JButton button;

        public AddListener(JButton button) {
            this.button = button;
        }

        //Required by ActionListener.
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = pathName.getText();

            //User didn't type in a unique name...
            if (name.equals("") || alreadyInList(name)) {
                Toolkit.getDefaultToolkit().beep();
                pathName.requestFocusInWindow();
                pathName.selectAll();
                return;
            }

            int index = jList1.getSelectedIndex(); //get selected index
            if (index == -1) { //no selection, so insert at beginning
                index = 0;
            } else {           //add after the selected item
                index++;
            }

            listModel.insertElementAt(pathName.getText(), index);
            //If we just wanted to add to the end, we'd do this:
            

            //Reset the text field.
            pathName.requestFocusInWindow();
            pathName.setText("");

            //Select the new item and make it visible.
            jList1.setSelectedIndex(index);
            jList1.ensureIndexIsVisible(index);
        }

        //This method tests for string equality. You could certainly
        //get more sophisticated about the algorithm.  For example,
        //you might want to ignore white space and capitalization.
        protected boolean alreadyInList(String name) {
           // return listModel.contains(name);
            return false;
        }

        //Required by DocumentListener.
        @Override
        public void insertUpdate(DocumentEvent e) {
            enableButton();
        }

        //Required by DocumentListener.
        @Override
        public void removeUpdate(DocumentEvent e) {
            handleEmptyTextField(e);
        }

        //Required by DocumentListener.
        @Override
        public void changedUpdate(DocumentEvent e) {
            if (!handleEmptyTextField(e)) {
                enableButton();
            }
        }

        private void enableButton() {
            if (!alreadyEnabled) {
                button.setEnabled(true);
            }
        }

        private boolean handleEmptyTextField(DocumentEvent e) {
            if (e.getDocument().getLength() <= 0) {
                button.setEnabled(false);
                alreadyEnabled = false;
                return true;
            }
            return false;
        }
    
}
