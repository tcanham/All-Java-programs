/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tester;

/**
 *
 * @author user
 */
public class Btm extends Mdl {
String btm = "B";
    public Btm() {
        //System.out.println("In Bottom constructor");  
    }
   
  
    @Override
 public void add() 
 {
     System.out.println("In add in Bottom");  
 }      
 void add(String x) 
 {
     System.out.println("In add String in Bottom");  
 }              
}
