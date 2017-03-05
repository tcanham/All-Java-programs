/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tom Canham
 * 
 * ----------------This class retrieves the data from the database----------------------
 */
public class ProcessNumber {
 private final String country;
 private final String number;
 private final String zeRos = "00";
 private String numberOut;
 private String finalNumber;  
 private String gotCode;
 
    /**
     *
     * @param country
     * @param number
     * @throws Exception
     */
    public ProcessNumber(String country, String number)throws Exception
    {
        this.country = country;
        this.number = number;
        
      try (Connection con = DbConnection.conn(); Statement s = con.createStatement()) {
         
         s.execute("SELECT code FROM intcodes where country = '"+this.country+"'");
         ResultSet rs = s.getResultSet();
         
         if(rs!=null)
         { 
             while(rs.next())
             {
               gotCode = rs.getString("code");
               numberOut = gotCode+number.substring(1);               
               finalNumber = zeRos+numberOut;
               JOptionPane.showMessageDialog(null, "Your number is "+finalNumber); 
               System.exit(0);
             }//end of while   
           }//end of if
         }//end of try   
      }//end of constructor  
    
    
}//end of class
