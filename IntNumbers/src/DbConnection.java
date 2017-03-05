/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Tom Canham
 * 
 * -------------This class makes the connection to the database--------------
 */
public class DbConnection {
    
 public DbConnection() {
    }    
    
 public static Connection conn()throws Exception 
{
   
          String url = "jdbc:mysql://localhost:3306/";
          String dbName = "intnumbers";
          String driver = "com.mysql.jdbc.Driver";
          String userName = "root";
          String password = "";
          Class.forName(driver).newInstance();
          Connection conn = DriverManager.getConnection(url+dbName,userName,password);
          return conn; 
          
} //end of conn   
    
    
    
}//end of class
