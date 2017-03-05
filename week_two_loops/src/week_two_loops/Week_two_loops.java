/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_two_loops;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Week_two_loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      int x = 10;
//     while(x<100){
//          x +=10;
//      System.out.println(x);
//
//      }
//    int a = 100;
//    while(a>0){
//       a--;
//       
//    }
   
//    int b = 100;
//
//    while(b>23){
//        b--;
//        int c = b%7;
//        if(c==0){
//          System.out.println(b);  
//        }   
//    }
       
   //-------------------------------------------------------------------------    
      
//       int d =0; 
//       while(d< 34){
//           d++;
//           int e = d%3;
//           if(e==0&&d>=10) 
//               System.out.println(d);
//           }
// String menuOption_1 = "";
// 
// while(!menuOption_1.equals("x")){
//     System.out.println("\t===Menu===");
//     System.out.println("Enter text to start");
//     System.out.println("Enter x to exit");
//     Scanner input = new Scanner(System.in);
//     menuOption_1 = input.next();
//     
//    int textlgh = menuOption_1.length();
//    System.out.println("You entered "+ menuOption_1 +" it is "+ textlgh +" letters long");
//     }
        
       String menuOption = " ";
       char menu = ' ';
        
        do{
          Scanner input = new Scanner(System.in);
           System.out.println("Enter a,b or x(to exit) below:");
         
          menuOption = input.next().toLowerCase();
          menu = menuOption.charAt(0);
          
          switch(menu){
              case 'a':
                 System.out.println("Option a");
                 System.out.println("Enter text to start");
                 menuOption = input.next();
                 int textlgh = menuOption.length();
                System.out.println("You entered "+ menuOption +" it is "+ textlgh +" letters long");
                  break;
              case 'b':
                   System.out.println("Option b");
                   System.out.println("Enter first number");
                   int sum_1 = input.nextInt();
                   System.out.println("Enter second number");
                   int sum_2 = input.nextInt();
                   int sumTot = sum_1 + sum_2;
                   System.out.println(sumTot);
                  break;
              case 'x': 
                  System.out.println("Goodbye");
                  break;
              default:
                   System.out.println("please pick correct option");        
                 break;
          }//end of switch
         }while(menu!= 'x');
        
        
    
    }//end of main
    
}//end of class
