/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.addButton;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jList2;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel2;

/**
 *
 * @author zhengshuai
 */
public class RemoveListener implements ActionListener {
    
     @Override
        public void actionPerformed(ActionEvent e) {
            //This method can be called only if
            //there's a valid selection
            //so go ahead and remove whatever's selected.
            int index = jList2.getSelectedIndex();
            //listModel.remove(index);
            listModel2.removeElementAt(index);
           

            int size = listModel2.getSize();

            if (size == 0) { //Nobody's left, disable firing.
                addButton.setEnabled(false);

            } else { //Select an index.
                if (index == listModel2.getSize()) {
                    //removed item in last position
                    index--;
                }
                

                jList2.setSelectedIndex(index);
                jList2.ensureIndexIsVisible(index);
            }
        }
}
