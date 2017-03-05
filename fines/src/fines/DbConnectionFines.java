/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fines;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class DbConnectionFines {

    public DbConnectionFines() {
    }
    
public static Connection conn()throws Exception 
{
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\db\\Offences.accdb";
 Connection con = DriverManager.getConnection( database ,"","");
 
return con;    
}      
    
}
