package basic_calc_oo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Calculate {
    
    private double num1;
    private double num2;
    private double total;

    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    public Calculate(double num1, double num2, double total) {
        this.num1 = num1;
        this.num2 = num2;
        this.total = total;
    }
    
    

    @Override
    public String toString() {
        return "Calculate{" + "num1=" + num1 + '}';
    }

    public Calculate(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculate() {
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }
   public void setTotal(double total){
    this.total = total;
       
   } 
    
   public double add()
   {
    this.setTotal(this.num1+this.num2);   
    return this.total;   
   } 
    
    
    
    
    
    
    
    
    
    
    
    
}
