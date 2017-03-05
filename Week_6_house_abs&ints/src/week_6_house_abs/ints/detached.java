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
public abstract class  detached  implements house {

    public detached() {
    }

    public static int getExternalDoors() {
        return externalDoors;
    }

    public static float getAvgHeightPerFloor() {
        return avgHeightPerFloor;
    }

    
    @Override
    public String toString() {
        return "detached{" + '}';
    }
 
    
    
    
    
    
}///END
