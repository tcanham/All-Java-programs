/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SixNations;


import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class SixnationsMain {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        
 ArrayList<Country> matchResults = new ArrayList();
 
 
    Country s = new Country("Scotland",2,0,0,2,6,42,0,-42);//needs to go bottom
    matchResults.add(s);     
    Country i = new Country("Ireland",2,2,0,0,54,9,4,45);//should be top
    matchResults.add(i); 
    Country f = new Country("France",2,2,0,0,56,34,4,22);
    matchResults.add(f); 
    Country b = new Country("England",2,1,0,1,44,26,2,28);
    matchResults.add(b);
    Country w= new Country("Wales",2,1,0,1,26,41,2,-15);
    matchResults.add(w); 
    Country it = new Country("Italy",2,0,0,2,25,53,0,-28);
    matchResults.add(it); 
    
    
  
     Collections.sort(matchResults,new Country());
      for (Country leagueTable : matchResults) 
       {
         System.out.println(leagueTable);
       }
     
      
      
    }//end of main
    
}//end of class
