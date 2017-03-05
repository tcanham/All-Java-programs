/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fines;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class SearchRec {
    
    private String plate;

    public SearchRec(String plate) throws Exception {
        this.plate = plate;
        System.out.println(this.plate);
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

// set this to a MS Access DB you have on your machine
String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\db\\RoadFines.accdb";

// now we can get the connection from the DriverManager
Connection con = DriverManager.getConnection( database ,"",""); 
        System.out.println("Connection made");
//try and create a java.sql.Statement so we can run queries
Statement s = con.createStatement();


//1. ALL
//s.execute("SELECT * FROM DOGS");
//2. WILD CARD
//s.execute("SELECT ID, DOGBREED, DOGNAME FROM DOGS WHERE DOGBREED LIKE 'Alsa%'");
//3. WILD CARD USING AND
//s.execute("SELECT ID, DOGBREED, DOGNAME FROM DOGS WHERE DOGBREED LIKE 'Alsa%' AND DOGBREED LIKE '%ion'");
//3. WILD CARD USING OR
System.out.println("Before SQL statement");
s.execute("SELECT * FROM Incidents WHERE NumberPlate = '"+this.plate+"'");
System.out.println("After SQL statement");
ResultSet rs = s.getResultSet();

// get any ResultSet that came from our query
//ArrayList x = new ArrayList();
if (rs != null) // if rs == null, then there is no ResultSet to view
while ( rs.next() ) // this will step through our data row-by-row
{
//x.add(rs);
/* the next line will get the first column in our current row's ResultSet 
as a String ( getString( columnNumber) ) and output it to the screen */

System.out.println("Car Info: Plate: " + rs.getString(2)  + " Location: " + rs.getString(3));
}


s.close(); 
// close the Statement to let the database know we're done with it
con.close(); 
    }
    
    
    
}
