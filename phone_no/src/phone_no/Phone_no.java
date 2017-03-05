/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phone_no;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Phone_no {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Phone number");
      String ph = input.next();
      String tempPh = ph.substring(0,3);
      System.out.println(tempPh);
      
      switch(tempPh){
          case"085":
              System.out.println("Meteor");
              break;
               case"086":
              System.out.println("O2");
              break;
                case"087":
              System.out.println("Vodaphone");
              break;  
                default:
              System.out.println("Unknown network"); 
               break;
      }//end of switch
      System.out.println("You will be connected shortly");
      }//end of main
              
      
    }//end of class
    

