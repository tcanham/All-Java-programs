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
public class Week6Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
   Square x = new Square(4);      
   double areasq = x.area();
   System.out.println(x.area());     
   System.out.println(x.toString());
           
           
    Cube t = new Cube(7);      
    double areacube = t.area();
    double areacb = x.area();
    System.out.println(t.area());
    System.out.println(t.toString());
   
   Rectangle c = new Rectangle(6,6); 
   double arearec = c.area();
   System.out.println(c.recArea());
   System.out.println(c.toString());
   
  
    
   
   
   
   
   
}//-----end of main
    
}//--end of class
