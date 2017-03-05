/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fruitmachine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
class Spin  extends JFrame implements ActionListener {

    public Spin() {
    }
    int counter=0;
    @Override
   public void actionPerformed(ActionEvent ae) 
   {
     
 //------------------get symbols--------------------------------------//
   String a =symbols.symbol();
   String b =symbols.symbol(); 
   String c =symbols.symbol();
//--------------------------------------------------------------------//  
   
   
    System.out.println(a+" "+b+" "+c);       // print out symbols
    
     
    if(a.equals(b)&&b.equals(c))
    { 
     JOptionPane.showMessageDialog(null,"Congratulations you are a winner");        
    }//end of if
   }// end of actperf

//--------------------------------------------------------------------//   

  
    
}//end of class
