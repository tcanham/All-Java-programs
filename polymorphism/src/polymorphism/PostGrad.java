/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

/**
 *
 * @author user
 */
public class PostGrad extends Student {

    public PostGrad() {
    }
    
 
    @Override
     public String register()   //register d
    {
       System.out.println("4 In Student without p");  
     return "4";  
    }
   
    @Override
   public String register(String x)   //register e
    {
       System.out.println(" 5 In Student with p");
     return "5 (with a String parameter)";  
    } 
    
}
