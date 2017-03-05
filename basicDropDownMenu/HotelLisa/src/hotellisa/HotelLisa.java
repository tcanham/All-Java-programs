/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotellisa;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class HotelLisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
  
//-------------Make up bill-----------------------------
  
  Reservation Smith = new Reservation(2,2);
 // Smith.DailyBill();
  Smith.TotalBill();
 
     
//-----------------------------------------------------     
     
      //System.out.println(Smith.toString());
  //Reservation Jones = new Reservation(4,3,"MW");
        //System.out.println(Jones.toString());
       // System.out.println(Jones.DailyBill());
        //System.out.println("Total bill: "+Smith.DailyBill());
        

//  BusGroup oldBiddies = new BusGroup(true,false,2,29,"MW",true);      
//        System.out.println("Total due with extras: "+oldBiddies.DailyBill());     
//        System.out.println(oldBiddies.toString());
    }//end of main
    
//-----------------------methods----------------------------------------------    
 
        
}//end of class
