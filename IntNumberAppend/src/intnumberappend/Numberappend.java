/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intnumberappend;

/**
 *
 * @author Tom Canham
 */
public class Numberappend {
    
public static String countryAppend(String x,String y)    
{
String country = null;    
switch(x) 
{
    case "England":
        country =  "0044 ".concat(y);
    case "Ireland":
        country =  "00353 ".concat(y);  
}
return country;
} 
    
    
    
    
}//end of class



