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
public class Student extends Person {

    public Student() {
    }
    
    @Override
    public String register()   //register b
    {
        System.out.println(" 2 In Student without p");
     return "2";  
    }
    
    public String register(String x)   //register c
    {
     System.out.println(" 3 In Student with p");   
     return "3" ;  
    }
    
}
