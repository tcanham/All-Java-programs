/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccount;

/**
 *
 * @author user
 */
public class CustomerAcc {
 private int accNo;
 private String name;
 private double AccBalance;
 private static int currSavers = 1001;
 private static double banktotal;
 
 
    public CustomerAcc(String name, double accBalance) { //--CONSTRUCTORS
        this.name = name;
        this.AccBalance = accBalance;
        this.accNo = currSavers++;
        banktotal= banktotal + accBalance;
    }

   
 //------------------------------------------------------------------    
    
     public static double getBanktotal() {
        return banktotal;
    }
     
     public int getaccNo() {//--GETTERS
        return accNo;
    }
     
     
     public void setAccNo(int accNo) {//--SETTERS
        this.accNo = accNo;
 
     }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public double getAccBalance() {
        return AccBalance;
    }

    public void setaccBalance(double accBalance) {
        this.AccBalance = accBalance;
    }

   

    @Override//-- TOSTRING OVERRIDE
    public String toString() {
        return "CustomerAcc{" + "accNo=" + accNo + ", name=" + name + ", accBalance=" + AccBalance + '}';
    }
    //--------------------------------------------------
    
   
    
    
    public double deposit(double amtIn)//--METHOD FOR DEPOSITS
    {
     this.AccBalance = this.AccBalance + amtIn;
     banktotal= banktotal + amtIn;
     return this.AccBalance;
     
    }
    
     public double deposit(double amtIn,String name)//--METHOD FOR DEPOSITS
    {
      this.deposit(amtIn);
      
     return amtIn;
    }
 //-----------------------------------------------------
    
    public double withdrawal(double amtIn)//--METHOD FOR WITHDRAWALS
    {
     if(this.AccBalance>amtIn)
     {
     this.AccBalance = this.AccBalance - amtIn;
     banktotal= banktotal - amtIn;
     }else
     {
      System.out.println("Insufficient funds");
     }
     
     return this.AccBalance;
    }
    
 //-------------------------------------------------------
    
   public double interest()//--METHOD FOR CALCULATE INTEREST
    {
     double interest;   
     interest= (this.AccBalance * .035);
     
     return interest;
    }  
   
}//end
