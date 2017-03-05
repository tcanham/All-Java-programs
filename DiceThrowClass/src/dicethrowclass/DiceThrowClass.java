/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicethrowclass;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class DiceThrowClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
//        ThrowDice x = new ThrowDice();
//        
//         int value = 0;
//    
//      while(value!=5) 
//        {
//       value = x.roll();
//          System.out.println(value);
//        } 
//      
//       System.out.println("Took: "+x.noOfgoes); 
       
         
     ThrowDice []threeDice  = new ThrowDice[3];
     int result = 0;
     
     
     
     
    
    for(int i=0;i<threeDice.length;i++)
    {
      threeDice[i]= new ThrowDice();  
    }
   
    for(int i=0;i<threeDice.length;i++)
    {
      do {
      result = threeDice[i].roll(); 
      System.out.println((i+1)+"is"+ result);
    } while(result!=5); 
    System.out.println("It took "+threeDice[i].noOfgoes+" to get a 5");
    }  
     System.out.println("Total throws "+ThrowDice.totalGoes);
       
       
            
    }//end of main
    
}//end of class
