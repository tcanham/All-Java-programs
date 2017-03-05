/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week3receipt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class Week3receipt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DateFormat formatOfDate = new SimpleDateFormat("dd:MM:YYYY :-) hh:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date Time : " + formatOfDate.format(cal.getTime()));
          
        
     
        
    
        
       
    }//---------------------------END OF MAIN---------------------------------//
    
    
 // public  static 
    
    
    
    
    
}//----------------------END OF CLASS------------------------------------------//
