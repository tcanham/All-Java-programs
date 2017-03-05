/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intnumberappend;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author java
 */
public class NumberIn {

    public NumberIn() {
    }

   public static String NumberIn() 
   {
    Scanner keyboard = new Scanner(System.in);   
        //System.out.println("Please enter the number"); 
      //String numberIn = keyboard.next();
      String numberIn = JOptionPane.showInputDialog("Please enter number");
      
      return numberIn;
   }
    
   public static String countryIn() 
   {
    Scanner keyboard = new Scanner(System.in);   
        //System.out.println("Please enter a country"); 
      //String country = keyboard.next();
       String country = JOptionPane.showInputDialog("Please enter the country, (use captal letter ie England)");
      
      return country;
   } 
    
    
    
    
    
    
    
    
    
}//end of class
