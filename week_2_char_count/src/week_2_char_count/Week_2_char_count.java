/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_2_char_count;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Week_2_char_count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter a word or sentence: ");
       String sentence = input.nextLine();
       String word = "bob"; 
       
      String lowcaseSent = sentence.toLowerCase();
       char templowcaseword = ' ';
       int vow = 0;
       int con = 0;
       
     for(int x =0; x < lowcaseSent.length() ; x++) {
          
           
        for(int i = 0;i < word.length(); i++)
        {
         
          int tempword =word.charAt(i);
         
         
         switch(tempword){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                 vow++;
                 break; 
             default:
                 con++;
                 break;
               
       }// end of switch
    }// end of for loop
               
               System.out.println("the word contains: "+vow+" vowels");
               System.out.println("the word contains: "+con+" consonants"); 
      }//--end of outer loop
    }//end of main
    
}//end of class
