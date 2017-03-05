/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sup_assnmt;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sup_assnmt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       int day = 0;
//       int month = 0;
//       int year =  0;
//       int max_date = 0;
//       boolean validDate = true;//flag
//       
//      do{ 
//         
//       Scanner date_in = new Scanner(System.in);
//        
//        System.out.println("Please enter the day");
//       day = date_in.nextInt();
//        System.out.println("Please enter the month");
//       month = date_in.nextInt();
//        System.out.println("Please enter the year");
//       year = date_in.nextInt();
//       
//       switch(month){
//           
//           case 2://case for Feb
//               if (year % 4 == 0){
//                   max_date = 29;
//               }else{
//               max_date = 28;
//               }
//               break;
//           case 4:    
//           case 6:    
//           case 9:
//           case 11:  
//               max_date = 30;
//               break;
//           default:
//               max_date = 31;
//               break;
//           }//end of switch
//       
//       //check data is valid
//       if((day>max_date)|(month>12)){
//          System.out.println("Invalid data");
//          validDate = false;
//       }else{
//       validDate = true;
//       }
//       
//      }while (validDate == false);
// --------------------------------------------------------------------------      
        
     String passWord = "granada";  
     String passattempt = " ";
     int counter = 0;
     char tesTer ='a';
     char attmp = 'a';
     int complete = 0;
     int trys = 0;
     boolean passmatch = false;
     
  //---------------  data in 
     
     Scanner passIn = new Scanner(System.in);
     do{  
  //-------------   validate data
     System.out.println("Please enter your password");    
     passattempt = passIn.next();
    
     while(counter < passWord.length())
     {
     tesTer = passWord.charAt(counter);
     attmp = passattempt.charAt(counter);
     
      if(tesTer != attmp)
     {
      System.out.println("Passwords do not match ");
      
     }else 
     {
     System.out.println("Passwords match ");
     passmatch = true;
     counter = 0;
     }//--end of if-else
     break;
     }//--end of  inner while
     counter++;
     trys++; 
    
     }while( passmatch == false & trys<3 );  //--end of do-while
  
     
}//--end of main
    
}//--end of class
