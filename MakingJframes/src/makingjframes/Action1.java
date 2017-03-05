/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package makingjframes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
class Action1 implements ActionListener {

    public Action1() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
   
        System.out.println("Action!");  
         int counter=5;       
 while(counter>0)
 {
   String a ="cherry";
   String b ="cherry"; 
   String c ="cherry";
   JOptionPane.showMessageDialog(null,"Spin");
  
    System.out.println(a+" "+b+" "+c); // print out symbols
    //JOptionPane.showMessageDialog(null,a+" "+b+" "+c);
    if(a.equals(b)&&b.equals(c))
    { 
     JOptionPane.showMessageDialog(null,"Congratulations you are a winner");  
     //System.out.println("Congratulations you are a winner"); 
    } 
    
       
    
  counter --;  
 }
        
    }
    
}
