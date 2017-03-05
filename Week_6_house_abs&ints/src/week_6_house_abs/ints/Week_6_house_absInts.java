/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_6_house_abs.ints;

/**
 *
 * @author user
 */
public class Week_6_house_absInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
      apartment a = new apartment();
      a.valuation(11, true);
      
     System.out.println(a.valuation(12,true));
     System.out.println(a.getFloorLevel());
     System.out.println(a.toString());
        
     penthouse b = new penthouse();   
     System.out.println(b.valuation(12,true,true));
     System.out.println(b.getFloorLevel());
     System.out.println(b.toString());   
        
        
        
        
        
        
        
        
    }//END OF MAIN
    
}//END OF CLASS
