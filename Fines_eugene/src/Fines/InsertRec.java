/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fines;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author user
 */
public class InsertRec {
    private String plate;
    private String location;
    private String time;
    
    public static String timeStamp()
    {
               //DateFormat formatOfDate = new SimpleDateFormat("dd:MM:YYYY - hh:mm:ss");
 DateFormat formatOfDate = new SimpleDateFormat("ddMMYYYY");
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date Time : " + formatOfDate.format(cal.getTime()));
         String g = formatOfDate.format(cal.getTime()).toString();
         return g;
    }

    public InsertRec(String plateIn, String locationIn, String timeIn) throws Exception{
        this.plate = plateIn;
        this.location = locationIn;
        this.time = timeIn;
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

// set this to a MS Access DB you have on your machine
String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\db\\RoadFines.accdb";

// now we can get the connection from the DriverManager
Connection con = DriverManager.getConnection( database ,"",""); 
        System.out.println("Conn made");
        System.out.println(this.time);
//try and create a java.sql.Statement so we can run queries
Statement s = con.createStatement();
//s.execute("INSERT INTO incidents(NumberPlate, Location, Time) VALUES('" + this.plate + "', '"+ this.location + "', '" + this.time + "')");
//s.execute("INSERT INTO Incidents(NumberPlate, Location) VALUES('" + this.plate+"', '"+this.location+"')");
s.execute("INSERT INTO Incidents(DateIncident) VALUES('" +this.time+ "')");
    s.close(); 
// close the Statement to let the database know we're done with it
con.close(); 
    }
    
    
    
}
