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
public class dormer extends detached {

 //constuctors
    
    public dormer() {
    }
    
//--------------------------------------
    
       
//methods (from interface house)   
@Override
public int heatOfHouse(int fuel){
   System.out.println("In heatOfHouse In dormer"); 
 
 return fuel;  
};

@Override
public void setNoOfFloors(int height){;   
    System.out.println("In setNoOfFloors In dormer");

}

//---------------------------------------

//tostring

    @Override
    public String toString() {
        return "dormer{" + '}';
      
    }
//-----------------------------------------

}//END
