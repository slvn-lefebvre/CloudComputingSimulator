/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.functions;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.TransferHandler;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jLabel14;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jLabel15;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jLabel16;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jLabel17;

import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jLabel3;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jLabel7;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jLabel8;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jLabel9;
import static my.cloudcomputingsimulator.CloudComputingSimulatorUI.jPanel4;

/**
 *
 * @author zhengshuai
 */
public class DragAndDrop {
   
    
   
    public static void dragAndDropFunc(){
         //add the listenner and mouseEvent for component for mousePressed
        MouseListener listener = new MouseAdapter(){
            
            public void mousePressed(MouseEvent e)
        {
            JComponent c = (JComponent) e.getSource();
            TransferHandler handler = c.getTransferHandler();
            handler.exportAsDrag(c, e, TransferHandler.COPY);
        }
           
        };
        
        //
       // MouseListener listener_rel = new MouseAdapter(){
            
        //    public void mouseReleased(MouseEvent e)
       // {
        //    addVM.addVirtualMachine();
        //}
           
       // };

            
        
        
        
        //Drag and Drop functions
        TransferHandler handler = new TransferHandler("icon") {

        
        public boolean canImport(TransferHandler.TransferSupport support) {
            return super.canImport(support) && support.getComponent().getParent() != jPanel4;
        }

    };
        try { 
            jLabel3.addMouseListener(listener);
            jLabel7.addMouseListener(listener);
            jLabel8.addMouseListener(listener);
            jLabel9.addMouseListener(listener);
            jLabel14.addMouseListener(listener);
            jLabel15.addMouseListener(listener);
            jLabel16.addMouseListener(listener);
            jLabel17.addMouseListener(listener);
            //jLabel14.addMouseListener(listener_cloud);
            //jLabel15.addMouseListener(listener_rel);
            //jLabel16.addMouseListener(listener_rel);
            //jLabel17.addMouseListener(listener_rel);
            

            } catch(Exception e) {};
            
       
          
            


    // use the handler on all labels (handlers can be shared, btw)
    // for each label on imageSelectPanel
    //imageSelectLabel.setTransferHandler(handler)
            jLabel3.setTransferHandler(handler);
            jLabel7.setTransferHandler(handler);
            jLabel8.setTransferHandler(handler);
            jLabel9.setTransferHandler(handler);
            
    // for each label on the target panel (aka storyPanel) 
    //storyLabel.setTransferHandler(handler)
            jLabel14.setTransferHandler(handler);
            jLabel15.setTransferHandler(handler);
            jLabel16.setTransferHandler(handler);
            jLabel17.setTransferHandler(handler);
            
            
    }
}
