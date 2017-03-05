/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_one_ass_one;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Week_one_ass_one {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner info_in = new Scanner(System.in);
               System.out.println("Title");
       String title = info_in.next() ;
               System.out.println("First name");
       String f_name = info_in.next();
              System.out.println("Surname");
       String s_name = info_in.next() ;
                System.out.println("Address 1");
       String addr_1 = info_in.nextLine() ;
                System.out.println(addr_1);
              System.out.println("Address 2");
        String addr_2 = info_in.nextLine() ;
             System.out.println(addr_2);
                     
                System.out.println("County");
       String county = info_in.next() ;
              
       double currenTbalance = 10000;
       
       String province = " ";
       String full_address = title.concat(" ")
               .concat(f_name).concat(" ").concat(s_name).concat("\n")
               .concat(addr_1).concat("\n").concat(addr_2).concat("\n")
               .concat(county);
       System.out.println(full_address);
        int temp_addr = full_address.indexOf("Co.");
        
       int full= full_address.length();
     
      String temp_prov = full_address.substring(temp_addr, full);
      
     switch(temp_prov){
        case "Co.Galway":
        case "Co.Mayo":
        case "Co.Roscommon":
        case "Co.Leitrim":
        case "Co.Sligo":
             System.out.println("Connaught");
           };
    
      
      
    }//end of main
    
}//end of class
