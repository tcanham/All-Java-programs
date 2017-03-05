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
public class Square extends Week6Shapes {
    
  private double side1;    
  private double area;
    public Square(double side1) {
        this.side1 = side1;
    }  
    
//---------------------------------------------------------    
    

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //--------------------------------------------------------------
    @Override
    public String toString() {
        return "Square{" + "side1=" + side1 + ", area=" + area + '}';
    }
    
    
    
 //-------------------------------------------------------------   

public double area()    
{
  area = side1 * side1;   
  return area;  
}


}//end
