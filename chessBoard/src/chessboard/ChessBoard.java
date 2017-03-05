/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chessboard;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ChessBoard {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     String picked = null;   
     int Xref=0;
     int Yref=0;
     final int MAX = 8;
     final int MIN =0;
     String[][] chessboard = new String[MAX][MAX];
     String piece = null;
    // printlogo();
     for (int row = MIN;row<8;row++)// for rows
     { 
        for (int col = MIN; col < 8; col++)//for columns
        {
         if(row==MAX-2 || row==MIN+1)
            {
                    piece ="Pawn";
            }else if((row==MAX-1)||(row==MIN))
                switch(col){
                    case 0:
                    case 7:
                    piece ="Castle";
                        break;
                    case 1:    
                    case 6:
                    piece ="Knight";
                        break;
                    case 2:
                    case 5: 
                    piece ="Bishop"; 
                        break;
                    case 4:
                    piece ="queen";
                        break;
                    default:
                    piece ="King";
                      
                     }
            else{
               piece ="Empty";
            }     
           chessboard[row][col]= piece;
                         System.out.print("\t"+piece);      
      }//inner
      System.out.print("\n");
     }//outer
       //System.out.println(Arrays.deepToString(chessboard).replaceAll("],", "],\r\n"));
       
    Scanner keyboard = new Scanner(System.in);
//     System.out.println("please input an X reference between 1 and 8=>");
//     Xref = keyboard.nextInt();
//     System.out.println("please input an Y reference between 1 and 8=>");
//    
//     System.out.println("You entered "+Xref+" and "+Yref);
//     
//     System.out.print("Your piece is a: "+chessboard[Xref-1][Yref-1]);
//     
     
     
    System.out.println("enter piece");
     picked = keyboard.next();
    for (int row = MIN;row<8;row++)// for rows
     { 
        for (int col = MIN; col < 8; col++)//for columns
        { 
         if (chessboard[row][col].equals(picked)){
           System.out.println(picked+chessboard[row][col]);
         }
        } 
     
     
     
     
     
     
     
     
     
     
     
     
     
}//main
     
 //--------METHOD--------------------------------------------------------|    
//   public static void printlogo() {
//     System.out.println("-----------------------------------------------");
//     System.out.println("-------------Toms chessboard-------------------");
//     System.out.println("-----------------------------------------------");
   } 
 //------- END OF METHOD-------------------------------------------------|    
     
}//class