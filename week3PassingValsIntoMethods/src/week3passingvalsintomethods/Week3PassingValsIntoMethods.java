/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week3passingvalsintomethods;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Week3PassingValsIntoMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
      Scanner keyboard = new Scanner(System.in);//--scanner for input
//-----------FOR VOWEL/CON COUNTERS------------------------------//  
      
      int vowel[] = new int[2];
      System.out.println("Enter a word: ");
      String word = keyboard.nextLine().toLowerCase();  
      vowel = VowelCounter(word);
      String concount = ConCounter(word);   
     System.out.println(concount);
     System.out.println("there are "+vowel[1]+" consonants");  
     System.out.println("there are "+vowel[0]+" vowels");  
     
//-----------------FOR POWER FINDER---------------------------------//   
     
//     System.out.println("Enter a num: ");
//      int numIn = keyboard.nextInt(); 
//     System.out.println("Enter a power: ");
//     int powerOf = keyboard.nextInt();
//     int ansback = Power(numIn,powerOf);
//     System.out.println(ansback);
      
//------------------FOR REPLACER------------------------------------//
       
      int arr[] = {1,3,1,4,1,5};
      int find = 0;
      int replace = 0;
      
 //---------------------END OF MAIN-------------------------------------//       
    }//--end of main
    
    public static String ConCounter(String wordIn){
     String moreCon = "There are more consonants than vowels"; 
     String sameCon = "There are the same amount of consonants than vowels"; 
     int vowcount[]= new int[2];
     int vow = 0;
     int con = 0;
      for(int i = 0;i < wordIn.length(); i++)
        {
          int tempword =wordIn.charAt(i);
          switch(tempword){
              case ' ':
                  break;
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
        }//--end of for
      vowcount[0]=vow;           
      vowcount[1]=con;
      //return vowcount;
      
      if (con > vow)
       return moreCon;
      if(con ==vow)
        return sameCon; 
        return null;
      
    }//------------------------------------end of concounter method
    
    
     public static int[] VowelCounter(String wordIn){
     int vowcount[]= new int[2];   
     int vow = 0;
     int con = 0;
      for(int i = 0;i < wordIn.length(); i++)
        {
          int tempword =wordIn.charAt(i);
          switch(tempword){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                 vow++;
                 break;
             case ' ':
                 continue;   
             default:
                 con++;
                 break;
                 
            }// end of switch
        }//--end of for
      vowcount[0]=vow;           
      vowcount[1]=con;
      
      return vowcount;
     }//----------------------------------end of vowelcounter method 
     
     public static int Power(int numIn,int powerOf) {
      
      int answer = numIn;
      for (int i =1;i<powerOf;i++)
      {
       answer = answer*powerOf;   
      }
        return answer;   
     }
    //--------------------------------------------END OF POWER METHOD 
     public static int[]Replacer (int arrIn[],int findIn,int replaceIn) {
       
      int arr[] = {1,3,1,4,1,5};
      int find = 0;
      int replace = 0;
         
         
         
       return null;   
     }//---------------------------------   ----END OF REPLACER METHOD 
     
     
     
   
//---------------------END OF CLASS--------------------------------------//    
}//--end of class
