/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplefileio;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class SimpleFileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ArrayList <String> names = new ArrayList();
        FileReader fr =null;
         String []x = new String[10];
        
        try {
            String fileName = "c:\\fileIO\\CORK_EXPENSES.txt";
            File f = new File(fileName);
            fr = new FileReader(f);
            BufferedReader br =new BufferedReader(fr);
            
           
            br.readLine(); //skips the first line of the text file
            //br.readLine();
            while(x != null)
            {
             x = br.readLine().split(","); 
              
                for (int i = 1; i<x.length;i++)
                { 
                  System.out.println(x[i]);
                }
               
            } 
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleFileIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(SimpleFileIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
    }//end of main
    
}//end of class
