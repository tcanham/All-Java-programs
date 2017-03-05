/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week2arrays1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Week2arrays1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
//    int numbers[] = {1,2,3,4,5,6,7,8,9};
//     for(int i=0;i<numbers.length;i++)
//     {
//     System.out.println(numbers[i]);
//     }
//     
//        for(int i=0;i<numbers.length;i+=2)
//    {
//     System.out.println(numbers[i]);
//    }
       
//      String daysOfWeek[] = {"Monday","Tuesday","Wednesday",
//      "Thursday","Friday","Saturday","Sunday"}; 
//      int day = 0;
//    
//      while(day<=7) {
//            System.out.println("Please enter a day number");
//            day = keyboard.nextInt();
//      
//      for (int x =0; x < 7; x++)
//     
//         {
//           if (day==(x+1)) 
//           {
//           System.out.println("Day is: "+daysOfWeek[day-1]);
//           }
//        
//           }//end of for
//         
//         }//end of while
//     if(day>7)  
//         {
//           System.out.println("Number not less than 7");
//         }  
//      
//      
//      
//      
//      
//      
//     String daysOfWeek[] = {"Monday","Tuesday","Wednesday",
//      "Thursday","Friday","Saturday","Sunday"}; 
      
 //----------------------------------------------------------------------     
      
//   String daysOfWeek[] = {"Monday","Tuesday","Wednesday",
//      "Thursday","Friday","Saturday","Sunday"}; 
//   boolean isValid = true;
//  do{    
//  String in = JOptionPane.showInputDialog("day");
//  int value = Integer.parseInt(in);
//  if (value <= 0| value > 7)
//  {
//  isValid = false;
//  JOptionPane.showMessageDialog(null,"incorrect number");
//  }else
//  {   
//  JOptionPane.showMessageDialog(null, daysOfWeek[value-1]);
//  isValid = true;
//  } 
//  }while(!isValid);
       
 //     Arrays.sort(lotto);
//      System.out.println(Arrays.toString(lotto));      
//           
       
 //--------------------------------------------------------------------------      
       
//    int currpick = 0;
//    final int MAX = 42;
//    final int SELECTION = 6;
//    int[]  qpick = new int[SELECTION]; 
//     
//    for (int i = 0;i<qpick.length;i++)
//    {
//      currpick = (int)(Math.random()*MAX+1);
//      Arrays.sort(qpick);
//      
//      
//      if(Arrays.binarySearch(qpick,currpick)!= -1 )  
//          
//      {
//          qpick[i] = currpick;
//      }
//          
//    }  
//       
       
       
   int pick = 0;
   int[]  lotto = new int[6]; 
   
   for (int i = 0;i<lotto.length;i++)
   {
       pick = (int)(Math.random()*42+1);
        for(int x= 0;x<i;x++)
      {
          if(lotto[x]==pick)
          {
           i--;
           break;     
          }  
     }
       
          
       
    }  

    System.out.println(Arrays.toString(lotto));    
       
       
       
       
       
       
       
       
       
       
       
  
      
      
      
      
      
      
      
      
      
      
   }//end of main
      
   
}//end of class
       
       
       
       
    

