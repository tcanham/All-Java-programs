/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week3methods;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Week3Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // myAddress(5);
        
//        for(int i = 0; i<4 ;i++)
//        {
//           myAddress(); 
     
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter number ");
    double a = keyboard.nextDouble();
    System.out.println("Enter number ");
    double b = keyboard.nextDouble();
    System.out.println("enter sign ");
    String opType = keyboard.next();
    System.out.println("optype entered: "+opType);
    
    switch(opType){
        case "+":
         System.out.println("Answer "+toAdd(a,b)); 
            break;
        case "-":
           System.out.println("Answer "+toSub(a,b)); 
            break;
        case "/":
            System.out.println("Answer "+toDiv(a,b));
            break;
        case "*":
            System.out.println("Answer "+toMulti(a,b));
            break;
        default:
             System.out.println("NoNoNo!!");
         }
    
       
         
        
          
        
        
        
        
        
        
//        }
      
    }//-----------------------END OF MAIN!!!!!!!!!!!!------------//
//    public static void myAddress()
//    {
//    System.out.println("Tom Canham ");
//    System.out.println("Ballygrania 126 ");
//    System.out.println("Sligo ");
//    }
   
//    public static void myAddress(int x)
//    {
//    for(int i = 0; i<x ;i++){  
//    System.out.println("Tom Canham ");
//    System.out.println("Ballygrania 126 ");
//    System.out.println("Sligo ");
//      }
//    } 
    
    public static double toAdd  (double a,double b)
    {
       double sum = 0;
       sum = a+b;
       return (sum);
      
    }   
    
     public static double toSub  (double a,double b)
    {
       double sum = 0;
       sum = a-b;
       return (sum);
      
    }   
    
       public static double toDiv  (double a,double b)
    {
       double sum = 0;
       sum = a/b;
       return (sum);
      
    }   
    
     public static double toMulti  (double a,double b)
    {
       double sum = 0;
       sum = a*b;
       return (sum);
      
    }      
    
    

 //-------------------------------------------------------------------------------//   
}//end of class
