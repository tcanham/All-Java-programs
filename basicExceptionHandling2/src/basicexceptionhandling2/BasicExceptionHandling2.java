/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicexceptionhandling2;

import java.sql.SQLException;

/**
 *
 * @author user
 */
public class BasicExceptionHandling2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    Pen a = new Pen(); 
    a.sqlex();//method in pen
    Biro b = new Biro(); 
    b.sqlex(); // method inherited from Pen
    Pen c = new Biro();
    
   try{
     b.sqlex(1); //method in Biro
      }
    catch(SQLException e )
    {
         
    }
  
  
  
  
  
        
    }//end of main
    
}//end of class
