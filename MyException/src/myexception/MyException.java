/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myexception;

/**
 *
 * @author Tom Canham
 */
public class MyException extends RuntimeException{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("First"); 
       
        try{
        
         try{
           throw new MyException();   
         }
         catch(MyException e){
            System.out.println("MyException caught");  
          throw new Exception();   
         }
        }
        catch( Exception a){
            System.out.println("Exception caught");  
        }
        
    }//end of main
    
}//end of class
