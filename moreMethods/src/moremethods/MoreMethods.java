/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moremethods;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class MoreMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int arr[]={6,2,3,5,4}; 
     int x=summer(arr);
     int arr2[] = sorter(arr);
     System.out.println(x);
     System.out.println(Arrays.toString(arr2));
    }//--END OF MAIN  
    
//----METHOD TO TAKE IN AN ARRAY,TOTAL THE VALUES AND RETURN THE TOTAL AS AN INT----// 
    
   public static int summer(int arrIn[])
   {
     System.out.println("check data is in summer array "+Arrays.toString(arrIn));  
   int sum=0;
    for(int i=0;i<arrIn.length;i++)
      {
        sum = arrIn[i] + sum;
      }
               return sum;  
    }//--end of summer
   
//--METHOD TO TAKE IN AN ARRAY,SORT THE VALUES AND RETURN AN ARRAY OF SORTED VALUES--//  
   
   public static int[] sorter(int arrIn[])
    { 
     System.out.println("check data is in sorter array "+Arrays.toString(arrIn));    
       Arrays.sort(arrIn);
          return arrIn ; 
    }
   
//---------------------------------------------------//   
}//---END OF CLASS

