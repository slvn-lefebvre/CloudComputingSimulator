/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simulation;

import fr.isep.simizer.storage.ResourceFactory;
import fr.isep.simizer.storage.StorageElement;
import static my.actionperformed.VmSetButton.diskSizeValueLong;

/**
 *
 * @author zhengshuai
 */
public class SetResource {
    public static StorageElement disk;
    public static void setResource(){
        // This time, however, we're going to use a different constructor for the
    // server so that we can customize the hard drive in the server.  We want
    // to set up a hard drive with our Resources.  To do this, let's start by
    // creating a ResourceFactory, which is responsible for supplying Resource
    // templates to the disk.
    ResourceFactory resources = new ResourceFactory(StorageElement.KILOBYTE);

    // We created a resource factory with 10 resources that each have a size of
    // 1 KB.  These Resources are referenced starting from zero.
    
    // Next, let's create a storage element with these resources.
    disk = new StorageElement(StorageElement.MEGABYTE, 7);
    //isk = diskSizeValueLong;
    
    for (int i = 0; i < 10; i++) {
      disk.write(resources.getResource(i));
    }
    }
    
}
