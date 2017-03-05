/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yatzeeGame;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class YatzeeGame {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//----------set scanner and variables--------------------------------//
        
    int player1[] = new int[5]; 
    int player2[] = new int[5]; 
    int[] p1choice = new int[5];
    int[] p2choice = new int[5];
    String[] temPp1choice = new String[5];
    String[] temPp2choice = new String[5];
    Scanner keyboard = new Scanner(System.in);
   
//==========================PLAYER 1 ======================================//    
    
//----------------------set first two goes---------------------------//
   
System.out.println("//==========================PLAYER 1 ======================================//"+"\n");
    
    for(int p1go =0;p1go<2;p1go++)// sets the first two goes
   {
   player1 = randomiser(player1);
   
//--------------------print out throw------------------------------//
   
  for(int i=0;i<p1choice.length;i++)
    {
      temPp1choice[i] = p1choice[i]+"";
      
    }
   
   boolean contents = Arrays.asList(temPp1choice).contains("0");
  
   if(contents == true)
    {
      System.out.println("PLAYER 1 THROWS:           "+"******"+Arrays.toString(player1)+"******"+"\n"); 
    }
  
   
   
//--------------------keep or throw numbers------------------------------// 
    
for(int p1 =0;p1<5;p1++) 
  {
    if (p1choice[p1]==0) 
       {     
         System.out.println("Do you wish to keep dice number: " +(p1+1)+"\n"+"Type in 'Y' or 'N'");
        String v = keyboard.next(); 
      if(v.toUpperCase().equals("Y"))
        {
          p1choice[p1] = player1[p1];
        }//--end of v.toUppercase if
      }//---end of  player1choice if
   }//----end of outer i for

//---------------------------print out current numbers held -----------------//

  if(p1go<1)
     {
   p1choice =sortNums(p1choice);    
   System.out.println("<--------------------------------------------------------------------------------------------->"+"\n");       
   System.out.println("-------------"+"Your saved dice:    "+Arrays.toString(p1choice)+"-------------"+"\n");
   System.out.println("<--------------------------------------------------------------------------------------------->"+"\n");
      }  
    }//--end or goes loop
    
//----------------final go-------------------------------------// 
  player1 = finalGo(p1choice);
  p1choice =sortNums(p1choice);
//----------------------print out------------------------------//
  System.out.println("<--------------------------------------------------------------------------------------------->"+"\n"); 
  System.out.println(" Your final result:  "+"<========>--"+Arrays.toString(p1choice)+"--<========>"+" !THIS GO!"+"\n");
  System.out.println("<--------------------------------------------------------------------------------------------->"+"\n");
   
//===================PLAYER 2 ===================================//  
   
 System.out.println("//==========================PLAYER 2 ======================================// "+ "\n");  
   
    for(int p2go =0;p2go<2;p2go++)// sets the first two goes
    {
   player2 = randomiser(player2);
   
   
   
    
 //--------------------print out throw------------------------------//
   
   
  for(int i=0;i<p2choice.length;i++)
    {
       temPp2choice[i] = p2choice[i]+"";
    }
  
  boolean contents = Arrays.asList(temPp2choice).contains("0");
  
  if(contents == true)
      {
        System.out.println("PLAYER 2 THROWS:           "+"******"+Arrays.toString(player2)+"******"+"\n"); 
      }
    
 //--------------------keep or throw numbers------------------------------// 
    
  for(int p2 =0;p2<5;p2++) 
   {
    if (p2choice[p2]==0) 
     {     
      System.out.println("Do you wish to keep dice number: " +(p2+1)+"\n"+"Type in 'Y' or 'N'");
      String v = keyboard.next(); 
     if(v.toUpperCase().equals("Y"))
      {
        p2choice[p2] = player2[p2];
      }//--end of u.toUppercase if
     }//---end of  player1choice if
    }//----end of outer i for
  
//-------------------------print out current numbers held -----------------//

  if(p2go<1)
      {
   p2choice =sortNums(p2choice);    
   System.out.println("<--------------------------------------------------------------------------------------------->"+"\n");       
   System.out.println("------------"+"Your saved dice:     "+Arrays.toString(p2choice)+"------------"+"\n");
   System.out.println("<--------------------------------------------------------------------------------------------->"+"\n");
      }  
    }//--end or goes loop
    
//----------------final go-------------------------------------// 
    
 player2 = finalGo(p2choice);  
  p2choice =sortNums(p2choice);   
//----------------------print out------------------------------//
   System.out.println("<--------------------------------------------------------------------------------------------->"+"\n"); 
   System.out.println( "Your final result:  "+"<========>--"+Arrays.toString(p2choice)+"--<========>"+ " !THIS GO!");
   System.out.println("<--------------------------------------------------------------------------------------------->"+"\n");
   
     
//-----------------------------PROCESS THE TWO DICE GOES------------------------------------// 
   
   
 p1choice =sortNums(p1choice);//--sort final dice
 p2choice =sortNums(p2choice);//--     ""
 
 int p1Scores[] =countDice(player1);
 int p2Scores[] =countDice(player2);
 int compare[][]= {p1Scores,p2Scores};// create array to hold both rolls
 
 double p1RollScore = countUp(p1Scores);
 double p2RollScore = countUp(p2Scores);
 
System.out.println("Player 1 holds: 1  2  3  4  5  6 \n"+"               "+Arrays.toString(p1Scores)); 
System.out.println("Player one scores: #"+p1RollScore+" this round!");  
System.out.println("Player 2 holds: 1  2  3  4  5  6 \n"+"               "+Arrays.toString(p2Scores)); 
System.out.println("Player two scores: #"+p2RollScore+" this round!");

winner(p1RollScore,p2RollScore );



    }//---END OF MAIN 
    
    
    public static int[] randomiser (int arrIn[])
    {  
      for(int i=0;i<5;i++)   //--generates numbers for one go
        {
           int y=0;
          y=(int)(Math.random()*6+1);
          arrIn[i] = y; 
        }
        return arrIn;
     }
//------------------------------------------------------------------//  
  
  public static int[] saveNums( int arrIn[])
  {
  int arrOut[]= new int[5];
  Scanner keyboard = new Scanner(System.in);
  for(int i =0;i<arrIn.length;i++) 
      {
      if (arrOut[i]==0) 
        {     
          System.out.println("Do you wish to keep dice number: " +(i+1)+" Y/N");
          String v = keyboard.next(); 
      
        if(v.toUpperCase().equals("Y"))
          {
            arrOut[i] = arrIn[i];
          }//--end of u.toUppercase if
        }//---
      }//----end of outer i for
  
      return arrOut;
   }
  
//---------------------------------------------------------------------//
 
  public static int[] finalGo (int arrIn[])
  {
     for(int i=0;i<5;i++)
     {
       if(arrIn[i]==0)  
        {
          arrIn[i] = (int)(Math.random()*6+1); 
        }
      }
      return arrIn; 
  }
  
  
//----------------------------------------------------------------------//
 
public static int[] sortNums(int arrIn[])
{
 int arrOut[]= new int[5];
 Arrays.sort(arrIn);
 arrOut = arrIn;
 return arrOut;   
}
  
//-----------------------------------------------------------------------// 

public static int[] countDice(int arrIn[])
{
int diceCount[] = new int [6];


for (int i = 1; i <= diceCount.length;i++)
   {
    for (int j = 0;j<arrIn.length;j++)
       {
        if (arrIn[j] ==i )
            {
            diceCount[i-1]++;
           }
       }
   }
    return diceCount;
}

//------------------------------------------------------------------------//
public static double countUp(int arrIn[])
{

 Double arrOut = 0.0;   
for (int i = 0; i<arrIn.length;i++)
   {  
    if (arrIn[i]>0)
         {     
          double Score   = Math.pow(10, arrIn[i])*arrIn[i]*(i+1);
          arrOut = arrOut + Score;
        }
      }  
    return arrOut;
}

//----------------------------------------------------------------------//

public static void winner(double Inx,double Iny )
{
  if(Inx>Iny)
    {
    System.out.println("Player one wins");
    } else
  {
     System.out.println("Player two wins"); 
  }    
}



//------------------------------------------------------------------//
  
}//--END OF CLASS
