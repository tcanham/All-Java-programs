/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fines;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Retrievedata {
private final String plate;     
//private String location;
//private String speed;
   
 public Retrievedata(String plate)throws Exception
  {
        this.plate = plate;
       
        Connection con = DbConnectionFines.conn();
        Statement s = con.createStatement();
        s.execute("SELECT * FROM Incidents where Registration = '"+this.plate+"'");  
        ResultSet rs = s.getResultSet();
        if(rs!=null)
        {
        while(rs.next())
        {
            System.out.println("Incident details: plate " + rs.getString("Registration")  + " location: " + rs.getString("Location") + " Speed: " + rs.getString("Speed")+"MPH");
        }
        }
        s.close();
        con.close();    
    } //end of constructor

    
    
    
    
    
}//end of class
