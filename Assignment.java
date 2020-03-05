package assignment;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

public class Assignment extends LinkedList{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
       File file = new File("regional.txt"); 
        Scanner br = new Scanner(file);
        String st; 
        while (br.hasNext()){ 
          System.out.println(br.nextLine()); 
        }
    }
    public Assignment (String filename){
        
    }
    public Assignment() throws IOException {
           File file = new File("regional.txt"); 
          Scanner br = new Scanner(file);
        String st; 
        while ( br.hasNext()){ 
          System.out.println(br.nextLine()); 
        }
    }

    
    
    
}
