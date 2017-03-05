/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fruitmachine;

import java.util.Random;

/**
 *
 * @author Tom Canham
 */
public class symbols {
//---------------symbols------------------------    
private static final String [] symbols = {"Apple","Cherry","Stars"};    


//----------------------------------------------
    public symbols() {
    }

public static String symbol()
{   
String symbol = (symbols[new Random().nextInt(symbols.length)]);
return symbol;    
}   
}//end of class
