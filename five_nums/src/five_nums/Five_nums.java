/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package five_nums;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class Five_nums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =0;
        int total = 0;
        int num = 0;
        int avg = 0;
        int small =Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        
        Scanner input = new Scanner(System.in);
        System.out.println("number");
        
       for( i = 0;i<5;i++)
       {
       num = input.nextInt();
       total = total+num;
        if (num < small) 
         {
         small = num;
         }//--END OF SMALL if
      if(num>big)
         {
        big = num;   
         }//--END OF BIG if
       }//--END OF FOR loop
      
       avg = total/(i);
       System.out.println("Total "+total); 
       System.out.println("avg "+avg); 
       System.out.println("small "+small); 
       System.out.println("big "+big);   
    }//--END OF MAIN
    
}//--END OF CLASS
