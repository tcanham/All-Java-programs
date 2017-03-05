/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_6_polys_iinterfaces_abstracts;

/**
 *
 * @author user
 */
public class Week_6_Polys_Iinterfaces_Abstracts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  // X x = new X();  abstract cannot be instanciated
   X a = new Y(); // ok abstract(L) to concrete(R)
       a.a2();     //gets a2 from Y
       
   Y b = new U();  //ok both concrete   
      b.a4();     // gets a4 from Y
        
  X c = new U();  // ok abstract(L) to concrete(R)
       c.a3();    // gets a3 from X
        
    }//end of main
    
}//end of class
