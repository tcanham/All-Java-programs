/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic_calc_oo;

/**
 *
 * @author user
 */
public class Basic_calc_oo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Calculate x = new Calculate(0,0);
      
      System.out.println(x.toString());
      
      x.setNum1(5);
      x.setNum2(3);
       System.out.println(x.toString());
     Calculate z = new Calculate(9,10);  
      System.out.println(z.toString());
      
      
      
      
   
    }
    
}
