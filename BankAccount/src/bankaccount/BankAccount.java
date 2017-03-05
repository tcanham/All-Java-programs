/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccount;

import java.util.ArrayList;

/**
 *
 * @author Tom canham
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    CustomerAcc a = new CustomerAcc("Tom",1000);
    CustomerAcc b = new CustomerAcc("Lisa",500);  
    StudentAcc c = new StudentAcc("Billy",100);
     
    ArrayList <CustomerAcc> accounts = new ArrayList();
   double accNo = 1007; 
   accounts.add(a);
   accounts.add(b);
   accounts.add(c);
   System.out.println(accounts);
   
   for(int i=0;i<accounts.size();i++)
   {
    if(accounts.get(i).getaccNo()==accNo)
    {
        System.out.println(accounts.get(i).getName()+" "+accounts.get(i).getAccBalance());  
    }else
    {
      if(accounts.get(i).getaccNo()!=accNo & i <1)
    {
     System.out.println("No account found!!");     
    }
   }   
 }     
   
   
   
   
   
    
    }//END OF MAIN
    
}//END OF CLASS
