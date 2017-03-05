/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package makingjframes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import static java.awt.SystemColor.text;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class MakingJframes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFrame inputForm = new JFrame("one");
      JPanel panel=new JPanel();
      inputForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      inputForm.setSize(400,400);
      inputForm.setLayout(new FlowLayout());
      JButton jb=new JButton();
      jb.setText("Submit");
      panel.add(jb);
      JTextField InputData=new JTextField(10);
      panel.add(InputData);
      inputForm.getContentPane().add(panel);
      InputData.setText("Button Clicked ");
     
      //one.pack();
      inputForm.setVisible(true);
      
    
     
    }//end or main
    
}//end of class
