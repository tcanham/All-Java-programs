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
public class Cube extends Square {

    public Cube(double side1) {
        super(side1);
    }

    
    @Override
    public double area()
    {
     double cubeArea = super.area()*this.getSide1();
     return cubeArea;
    }
    
    @Override
     public String toString() {
        System.out.print(super.toString());
        return "Cube{" + '}';
    }
    
    
    
}
