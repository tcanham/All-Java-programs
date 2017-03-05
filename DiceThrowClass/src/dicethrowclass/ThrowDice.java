/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicethrowclass;

/**
 *
 * @author user
 */
public class ThrowDice {
    
  private int faceValue;
  public int noOfgoes ;
  public static int totalGoes;
  public static final int sides=6;

    public ThrowDice() {
    }
  
    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
    
    @Override
    public String toString() {
        return "ThrowDice{" + "faceValue=" + faceValue + '}';
    }
  
  
   public int roll()
   {
     this.faceValue = (int)(Math.random()*sides+1); 
     noOfgoes++; 
     totalGoes++;
     return faceValue;
   }     
       
    
    
    
    
}//--END-------
