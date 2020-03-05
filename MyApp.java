
package assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class MyApp {
    File file1;
   String[] myfiles;
    public MyApp(){
        file1 = new File("C:\\Users\\Hp\\Documents\\NetBeansProjects\\Assignment\\src\\assignment");
		String[] fileList = file1.list();
		for(String name:fileList){
			System.out.println(name);
                        myfiles[i]=name;
                }
    }
    ArrayList allfiles=new ArrayList();
       for (int i=0 ; i <myfiles.length-1 ; i++){
        try {
            MyQueue dataextract=new MyQueue(myfiles[i]);
            allfiles.add(dataextract);
        } catch (IOException ex) {
            Logger.getLogger(MyApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    
    
}
