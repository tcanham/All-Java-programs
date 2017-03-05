/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connecttodatabasewamp;

/**
 *
 * @author Tom canham
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectToDatabaseWamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          String url = "jdbc:mysql://localhost:3306/";
          String dbName = "testconnect";
          String driver = "com.mysql.jdbc.Driver";
          String userName = "root"; 
          String password = "";
          try {
              try {
                  try {
                      Class.forName(driver).newInstance();
                  } catch (          InstantiationException | IllegalAccessException ex) {
                      Logger.getLogger(ConnectToDatabaseWamp.class.getName()).log(Level.SEVERE, null, ex);
                  }
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(ConnectToDatabaseWamp.class.getName()).log(Level.SEVERE, null, ex);
              }
          Connection conn = DriverManager.getConnection(url+dbName,userName,password);
          Statement st = conn.createStatement();
          ResultSet res = st.executeQuery("SELECT * FROM  input");
         
          while (res.next()) {
          int id = res.getInt("id");
          String firstname = res.getString("Firstname");
          String surname = res.getString("Surname");
          System.out.println(id + "\t" + firstname+"\t"+surname );
         conn.close();
          }
          }
          catch (SQLException e) {
            }
        
         
        
    
        
    } //end of main
    
}//end of class
