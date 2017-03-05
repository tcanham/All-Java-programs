/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fines;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class InsertRec {
private String plate;     
private String location;
private String speed;

    public InsertRec(String plate, String speed) throws Exception
    {
        this.plate = plate;
        this.speed = speed;
             
         Connection con = DbConnectionFines.conn();
         Statement s = con.createStatement();
         s.execute("INSERT INTO Incidents(registration,speed) VALUES('"+this.plate+"','"+this.speed+"')");      
         s.close();
         con.close();
    }//end of 2 constructor

  public InsertRec(String plate, String location, String speed)throws Exception
  {
        this.plate = plate;
        this.location = location;
        this.speed = speed;
        
        Connection con = DbConnectionFines.conn();
        Statement s = con.createStatement();
        s.execute("INSERT INTO Incidents(registration,location,speed) VALUES('"+this.plate+"','" +this.location+"','"+this.speed+"')");      
        s.close();
        con.close();    
    } //end of 3 constructor


    
}
