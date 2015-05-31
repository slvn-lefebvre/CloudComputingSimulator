/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.addButton;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jList1;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.listModel;

/**
 *
 * @author zhengshuai
 */
public class DeleteListener  implements ActionListener {
    

    
    @Override
        public void actionPerformed(ActionEvent e) {
            //This method can be called only if
            //there's a valid selection
            //so go ahead and remove whatever's selected.
            int index = jList1.getSelectedIndex();
            //listModel.remove(index);
            listModel.removeElementAt(index);
           

            int size = listModel.getSize();

            if (size == 0) { //Nobody's left, disable firing.
                addButton.setEnabled(false);

            } else { //Select an index.
                if (index == listModel.getSize()) {
                    //removed item in last position
                    index--;
                }
                

                jList1.setSelectedIndex(index);
                jList1.ensureIndexIsVisible(index);
            }
        }
    
}
