/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicexceptionhandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class BasicExceptionhandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// //------------------QUESTION 1------------------------------
// int c= 0;
// boolean isvalid = true;
// 
////-------------------------------------------------------------- 
// 
//do{ 
// Scanner x = new Scanner(System.in);  
// try{
//  isvalid = true;  
//  System.out.println("Input first value ==> ");
//  int a = x.nextInt();
//  System.out.println("Input second value ==> ");
//  int b = x.nextInt();
//  c = a/b;
// }
// catch(InputMismatchException a )
// {
//      System.out.println("You entered an invalid figure");
//       System.out.println("Exception message "+ a.getMessage());
//     isvalid = false;    
// }
//  catch(ArithmeticException a )
// {
//     System.out.println("Arithmatic exception");
//     System.out.println("Cannot "+ a.getMessage());
//     isvalid = false;   
// }       
// catch(RuntimeException a )
// {
//     System.out.println("Runtime exception"); 
//     System.out.println("Message "+ a.getMessage());
// }
// 
// finally
//{
//  //System.out.println("Finally is always entered");      
//        }
// 
//}while(isvalid==false);
//
//
//
////-----------------------------------------------------------------
//  
// System.out.println("The answer is " +c); 
// 
//// --------------------QUESTION 1 END -----------------------------
// 
// 
 
 //-------------QUESTION 2--------------------------------------------
 
  byte [] byteIn = new byte[5];
  int index = 0;
  byte value = 0;
  int counter =0;
  //boolean isValid = true;
 

 do{ 
  
  Scanner keyboard = new Scanner(System.in);
  try{
  System.out.println("Please enter an index");
  index = keyboard.nextInt();
  if(byteIn[index]==0){
  try{    
  System.out.println("Please enter a value");
  value= keyboard.nextByte();      
  byteIn[index] = value;
  counter++;
  }
   catch(InputMismatchException e )
{
      System.out.println("You entered an invalid figure");
      //System.out.println("Exception message "+ e.getMessage());
          
 }
 }else{System.out.println("You have already used this index");}
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("array out of bounds ");    
  }
 }while(counter<byteIn.length);    
  
 boolean flag = true;
 do{
  Scanner keyboard = new Scanner(System.in);
  System.out.println(Arrays.toString(byteIn));      
  System.out.println("Please enter an index for the sum");
  int index2 = keyboard.nextInt();
  System.out.println("Please enter an value for the sum");
  int value2 = keyboard.nextInt();
  try{
    flag = true;  
  double ans = div(byteIn[index2],value2); 
      System.out.println(ans);
  }
  catch(ArithmeticException e )
  {
      System.out.println("Value con not be zero");
      flag = false;
  }
 }while(flag==false);
    } //end of main  
 
    public static double div(int x,int y)
    {
        
    return x/y;
        
    }
    
    
}//end of class
