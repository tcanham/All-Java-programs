/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week7parsing;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Week7Parsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       String[] nIn =  {"100", "20", "-25", "40"};
       double[] pN = new double[4];
       double total = 0;
       double total2d = 0;
       double avg = 0.0;
      
       for(int i=0;i<nIn.length;i++)
       {
       pN[i] = Integer.parseInt(nIn[i]);
       }
       
        for(double x : pN)
        {
         total += x;
         avg = total/pN.length;
        }
        
//         System.out.println("The total is "+total);
//         System.out.println("The avg is "+avg);
        
         
         Arrays.sort(pN);
//       System.out.println(Arrays.toString(pN));
//         System.out.println("The min is "+pN[0]);
//        System.out.println("The max is "+pN[pN.length -1]);
//       
        String[][] nIn2d= {{"10.0", "20", "-25", "40"},{"20", "-25"},{"2.5"}};
        double[][] pN2D ={{0.0,0.0,0.0,0.0},{0.0,0.0},{0.0}};
        
        for(int i=0;i<nIn2d.length;i++)
        {
          for(int x=0;x<nIn2d[i].length;x++)
          {
            pN2D[i][x] = Double.parseDouble(nIn2d[i][x]); 
           
          }//end of innner for
          
        }//end of outer for
        //System.out.println(Arrays.deepToString(pN2D));
        
     double temp[] = arrsort(pN);
        System.out.println(Arrays.toString(temp));
        
        
     double temp2[][] = arrsort(pN2D);   
        System.out.println(Arrays.deepToString(temp2)); 
        
    }//end of main
    
   public static double[] arrsort(double arrIn[]) 
     {
   Arrays.sort(arrIn);
    return  arrIn ;   
     }
   public static double[][] arrsort(double arrIn[][]) 
   {
   for(int i=0;i<arrIn.length;i++) 
     {
    Arrays.sort(arrIn[i]); 
     }
      return arrIn ;
   }
   
//-------------------------------------------------------------------------------------------------   
   
//      1.	Take the following array, parsing all the values to relevant datatypes (you may need to do this twice), calculate the
//a.	Total
//b.	Average, using decimal places
//c.	Maximum value 
//d.	Minimum Value
//
//{"100", "20", "-25", "40"}
//2.	Repeat the same mathematical procedures, but this time, only do it for each array
//
//
//
//
//a.	Calculate the values for EACH array
//b.	Calculate the values for the ENTIRE array
//3.	Now, when adding the totals, use the EXACT datatype needed.
//
//{{"10.0", "20", "-25", "40"},{"20", "-25"},{"2.5"}}
//4.	SUPPLEMENTARY: Once you have implemented these using a normal FOR loop, try to implement using a FOR … EACH loop. 
   
    
    
}//end of class
