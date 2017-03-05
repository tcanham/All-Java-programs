/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parsing;

/**
 *
 * @author user
 */
public class ParsingBiscuits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String var1 = " 1.09",var2 = "1.00";
        double var3 = Double.parseDouble(var1);
        double var4 = Double.parseDouble(var2);
       //System.out.println(var4+var3);
        double avgPrice = 0;
        double tempPrice = 0;
       String [][]Biscuits = {{"Digestive","1.00","1"},{"HobNobs","1.50","3"},{"Rich Tea",".80","2"}};
       
       for(int i = 0;i<Biscuits.length;i++)
         {
          for (int z= 0;z < Biscuits[i].length;z++)
          {
            if(z==1)
            {
               tempPrice= Double.parseDouble(Biscuits[i][z]);
               avgPrice = avgPrice + tempPrice;
             //System.out.println(Biscuits[i][z]);
            }
          }
         }
          avgPrice = avgPrice/Biscuits.length;      
          System.out.println(avgPrice);
       
       
       
       
       
       
       
       //--------------------end main and class---------------------//
    }
    
}
