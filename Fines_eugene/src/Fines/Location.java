/**
 *
 * @author Eugene O' Regan
 * 
 * This class is to allow for the creation of Location 
 * objects. These will be loaded on the pressing of the "Load" 
 * button. This is done as we only need to interact with these 
 * static values maybe 1-2 times in the code itself. They are stored
 * in the ArrayList locations as datatype Location. This allows the 
 * programmer to call up the relevant values without having the need
 * to interact with the database on a constant basis. 
 */

package Fines;


public class Location {
    
   private String location;
   private int speedLimit;

    public Location(String location, int speedLimit) {
        /**
         * Howya
         */
        System.out.println("In Location constructor");
        this.location = location;
        this.speedLimit = speedLimit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
   
   
    
}
