/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_2.ass_2_part_2;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class Week_2Ass_2_part_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in);
        System.out.println("start number");
        int start = input.nextInt();
        System.out.println("end number");
        int end = input.nextInt(); 
        System.out.println("increment number");
        int inc = input.nextInt();
        
         for(int i=start;i<end;i+=inc)
         {
        if(i % 3 == 0){
          System.out.println(i);
        }
         }  //END OF i FOR loop
          for(int x=start;x>end;x-=inc)
         {
        
        if(x % 3 == 0){
          System.out.println(x);
        }
         
         }//END OF x FOR LOOP
 
    }//--END OF MAIN
    
}//--END OF CLASS
