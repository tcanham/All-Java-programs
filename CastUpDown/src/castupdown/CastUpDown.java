/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package castupdown;

/**
 *
 * @author user
 */
public class CastUpDown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//   Animal a = new Animal(); 
//   a.add();
     Animal b = new Camel();    
//   b.add();
//   Mammal c =new Camel();     
//   c.add(1);
    Camel d = (Camel) b;    
    
   System.out.println(d.add("tom"));    
        
        
    }//end of main
    
}//end of class
