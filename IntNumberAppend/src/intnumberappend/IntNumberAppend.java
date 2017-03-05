/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intnumberappend;

import static intnumberappend.NumberIn.NumberIn;
import static intnumberappend.NumberIn.countryIn;
import static intnumberappend.Numberappend.countryAppend;
import javax.swing.JOptionPane;
/**
 *
 * @author java
 */
public class IntNumberAppend{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String numberIn = NumberIn();  
    String country = countryIn();
    String temp = numberStrip(numberIn);
    String numberOut = countryAppend(country,temp);       
    
    
     
    
//    System.out.println(temp);
//    System.out.println(country);
//System.out.println(numberOut);
    
     JOptionPane.showMessageDialog(null, "Your number is "+numberOut);
    System.exit(0);
    
    }//end of main
      public static String numberStrip (String x)    
{
 String numberIn = x.substring(1);
 
  return numberIn;   
}  

         
}//end of class
