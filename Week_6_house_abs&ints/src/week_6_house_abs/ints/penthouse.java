/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_6_house_abs.ints;

/**
 *
 * @author user
 */
public class penthouse extends apartment {
    
private boolean garage;
    
//constuctors    

    public penthouse() {
    }
    
     public penthouse(boolean garage) {
        this.garage = garage;
    }

//------------------------------------------------
//getters and setters
    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }
     
//-----------------------------------------------
    
public double valuation(int floorIn, boolean balIn, boolean garageIn)    
{
    
this.setFloorLevel(floorIn);
this.setBalcony(balIn);
this.garage = garageIn;
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
if(garageIn)
{
  value = value + 20000;  
}
properties.add(value);
return value; 

} 

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "penthouse{" + "garage=" + garage + '}';
    }


 
    
    
}//end
