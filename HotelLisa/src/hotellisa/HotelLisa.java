/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotellisa;

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
  
  //Reservation Smith = new Reservation(2,2);
   //Smith.DailyBill();
   //Smith.TotalBill();
 
        
        
           
//-----------------------------------------------------     
     
     
        

  BusGroup oldBiddies = new BusGroup(true,false,2,29,"MW",true);      
        System.out.println("Total due with extras: "+oldBiddies.DailyBill());     
        System.out.println(oldBiddies.toString());
    }//end of main
    
//-----------------------methods----------------------------------------------    
 
        
}//end of class
