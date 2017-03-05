/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_2_nested_loops;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Week_2_nested_loops {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
//        int i =0;
//        int x =0;
//        for (i= 0;i < 5;i++){
//           
//            for (x =0;x<2;x++){
//                
//            System.out.println(i+"   "+x);
//            }  //--end of inner loop
//            
//           
//        }//--end of outer loop
//   -----------------------------------------------------------
       
        boolean ispallen = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter text");
               
        String word = input.next();
        int x = word.length();
        int mid = x/2;
        int end = x-1;
        
     for(int i=0; i<mid; i++)
         {
         char a = word.charAt(i);
         char b = word.charAt(end);
        
          
         end--;
         
         if(a!=b)
         {
          ispallen=false;
        
          break;
         }else
            { 
            ispallen= true;
         }//end of if-else
      
        
         }//-- end of for
       if(ispallen==false){
           System.out.println(word+" is not a pallendrome");
           
       }else{
            System.out.println(word+" is a pallendrome");
       } 
        
           

        
        
        
}  //--end of main
    }//--end of class
      

