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
public class Biro extends Pen {

    public Biro() {
        
    }
    
    @Override
     public  void sqlex() 
  {
        try {    
            throw new SQLException();
        } catch (SQLException e) {
            System.out.println("pen override in Biro sql "); 
        }
  }
    
  public  void sqlex(int i) throws SQLException
  {
      System.out.println("Biro sql");  
      throw new SQLException();
  }
}
