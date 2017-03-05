/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg03_12_13_taxcalculator;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double grossIncome = 0, taxRate = 0, 
           taxAmt = 0, netAmt = 0;
    
   Scanner inPut = new Scanner(System.in);
   System.out.println("Enter Income");
   grossIncome = inPut.nextDouble();
   System.out.println("Enter Tax rate");
   taxRate = inPut.nextDouble();
    
   taxAmt = grossIncome * taxRate;
   netAmt = grossIncome - taxAmt;
   System.out.println("Your net income is: " + netAmt + " Gross: " + grossIncome);
    
    
    }// end of main
    
}//end of class
