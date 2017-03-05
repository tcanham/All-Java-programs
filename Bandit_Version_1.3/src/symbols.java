/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Random;

/**
 *
 * @author Tom Canham
 */
public class symbols {
//---------------symbols------------------------    
private static final String [] symbols = {" Apple","Cherry"," !Star!"," Apple","Cherry"," Apple"," !Star!"," Apple","Cherry"};    

    public static String[] getSymbols() {
        return symbols;
    }



//----------------------------------------------
    public symbols() {
    }

public static String symbol()
{   
String symbol = (symbols[new Random().nextInt(symbols.length)]);
return symbol;    
}   
}//end of class
