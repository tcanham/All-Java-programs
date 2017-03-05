/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week6shapes;

/**
 *
 * @author user
 */
public class Rectangle extends Square {

//---------------------------------------------------
    
private double side2;  

//--------------------------------------------------


    public Rectangle(double side2, double side1) {
        super(side1);
        this.side2 = side2;
    }
    
       
    
 //-----------------------------------------------------   

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
 //----------------------------------------------- 
    
public double recArea()    
{
double area = super.getSide1() * this.side2;    
return area;    
} 

public double CrecArea()    
{
double area = super.area() * this.side2;    
return area;    
}     
    
}//end




