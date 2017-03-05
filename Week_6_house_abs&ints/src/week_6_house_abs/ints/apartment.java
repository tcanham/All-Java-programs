/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_6_house_abs.ints;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class apartment implements house {
//variables    
private int floorLevel;    
private boolean balcony;    
public static final double avgCost = 300000;
public static ArrayList properties = new ArrayList();
//---------------------------------------

//constuctors
    public apartment() {
    }

    //-------------------------------------- 
    
    //getters and setters
    
    public int getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(int floorLevel) {
        this.floorLevel = floorLevel;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }
  
  //--------------------------------------  
       
//methods (from interface house)      
@Override
public int heatOfHouse(int fuel){
 System.out.println("In heatOfHouse In apartment"); 
 return fuel;  
};

@Override
public void setNoOfFloors(int height){;   
System.out.println("In setNoOfFloors In apartment");

}

public double valuation()    
{
int floors = this.getFloorLevel();
boolean bal = this.isBalcony();
double value;
double depr = 0;

if(floors >10)
{
 floors = floors - 10;
 depr =  avgCost*(floors*.05);
}

value = avgCost - depr;
if(bal)
{
  value = value + (floors*0.1); 
}
return value;    
} 


public double valuation(int floorIn,boolean balIn)    
{
this.floorLevel = floorIn;
this.balcony = balIn;
//int floorsIn = this.getFloorLevel();
//boolean bal = this.isBalcony();
double value;
double depr = 0;

if(floorIn >10)
{
 floorIn = floorIn - 10;
 depr =  avgCost*(floorIn*.05);
}

value = avgCost - depr;
if(balIn)
{
  value = value + (value*.10); 
}
return value;    
} 




//tostring
    @Override
    public String toString() {
        return "apartment{" + "floorLevel=" + floorLevel + ", balcony=" + balcony + ", avgCost=" + avgCost + '}';
    }
    
    
    
}//END
