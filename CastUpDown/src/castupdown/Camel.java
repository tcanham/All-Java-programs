/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package castupdown;

/**
 *
 * @author user
 */
public class Camel extends Mammal{

    public Camel() {
        System.out.println("In Camel constructor");
    }
    
    @Override
   void add() 
   {
      System.out.println("In Camel add");  
   }
  String add(String x) 
   {
      String y = x + " In add string"; 
       return y;
   }  
   
   
}//end of class


