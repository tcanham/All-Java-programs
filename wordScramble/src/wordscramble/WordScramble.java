/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class WordScramble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
//------------CREATE ARRAY----------------------------------------//        
     String []words ={"Sheet","Kettle","Star","Picture","Heroes","Oven","Table"}; 
     //System.out.println(Arrays.toString(words));
     
//-----------SELECT A VALUE AS INT AT RANDOM-----------------------------//     
    
    Random rand = new Random();
    int i = words.length-1;
    int word = rand.nextInt(i+1);
    //System.out.println("Random word: "+words[word]);
    
//---------CONVERT VALUE AS INT TO ACTUAL WORD-----------------//   
    String pick = words[word];
    
   //System.out.println("pick = "+pick);
     
//------------SPLIT WORD INTO CHARS--------------------------------//
    
   char[] charArray = {}; //--create array for chars
   for (int x = 0;x < pick.length(); x++)//--loop thru PICK 
   {
    charArray = pick.toCharArray();//--split string PICK into chars and put in array
   }
    // System.out.println(Arrays.toString(charArray));

 //------------- RANDOMISE THE VALUES IN ARRAY-------------------------//    
    Random ran = new Random();

    for(int y = 0; y < charArray.length; ++y) 
     {
       int fromIndex = ran.nextInt(charArray.length);//--create variables to hold  int 'y' values
       int toIndex = ran.nextInt(charArray.length);
       char tmp = charArray[fromIndex]; //--create variable to hold value to change
       charArray[fromIndex] = charArray[toIndex];//--mix up position of value
       charArray[toIndex] = tmp;
     }   
    
//----------START GAME----------------------------------------------------//
  
   Scanner keyboard = new Scanner(System.in);
   String answer = " ";
for( int g = 0;g<3;g++){
   System.out.println("Re-arrange these letters into a word "
   + "(word MUST start with a capital)\n"+Arrays.toString(charArray));

   System.out .println("Type in your answer below:");
    answer = keyboard.next();
 
  
    if (!pick.equals(answer)&&g<3)
   {
     System.out.println("Wrong answer try again");  
   }
    if(answer.equals(pick))
   {
     System.out.println("well done"); 
     break;
   }
}//--end of for loop
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 //---------------END OF MAIN -----------------------------------------------//  
     
    }//end of main

    
    
    
    
    
    
//----------------END OF CLASS------------------------------------------------//    
}//end of class
