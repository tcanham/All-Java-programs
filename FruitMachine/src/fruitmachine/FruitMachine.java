/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fruitmachine;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath.Axis;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tom Canham
 */
public class FruitMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     JFrame frame = new JFrame("Frame test");
     frame.setLocation(255, 40);
     frame.setVisible(true);
     frame.setSize(500,400); 
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
     JPanel panel = new JPanel();
     frame.add(panel);
//---------------------------------------add set session button---------------     
     JButton button = new JButton("Insert coin");
     panel.add(button);
     button.addActionListener (new CoinIn()); 
//---------------------------------------add spin button---------------------      
     JButton button2 = new JButton("Spin");
     panel.add(button2);
     button2.addActionListener (new Spin());   
    

     
     

    }//end of main
  
    
}//end of class
