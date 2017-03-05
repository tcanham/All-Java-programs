/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicexceptionhandling2;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Pen {

    public Pen() {
    try{
    //throw new IndexOutOfBoundsException(); 
  }
  catch(IndexOutOfBoundsException e )
   {  
   }          
    }
    
  public  void sqlex() 
  {
       try {    
            throw new SQLException();
        } catch (SQLException e) {
            System.out.println("pen sql "); 
        }     
  }
   
}
