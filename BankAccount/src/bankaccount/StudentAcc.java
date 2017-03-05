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
public class StudentAcc extends CustomerAcc {

    public StudentAcc(String name, double accBalance) {
        super(name, accBalance);
        checkLoan();
    }
  
   boolean loanOk;

    public boolean isLoanOk() {
        return loanOk;
    }

    public void setLoanOk(boolean loanOk) {
        this.loanOk = loanOk;
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "StudentAcc{" + "loanOk=" + loanOk + '}';
    }

   
   public boolean checkLoan() 
   {
   if(this.getAccBalance()>=500)
   {
    this.loanOk = true;   
   }
   return this.loanOk;
   }
   
    
    
    
    
}//end
