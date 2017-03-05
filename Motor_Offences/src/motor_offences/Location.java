/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor_offences;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Location {
 private  String location;
 private int urban;
 private int rural;
 private int N_road;   
 private int M_way;
 

    public Location(String location, int urban, int rural, int N_road, int M_way) {
        this.location = location;
        this.urban = urban;
        this.rural = rural;
        this.N_road = N_road;
        this.M_way = M_way;
        
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getUrban() {
        return urban;
    }

    public void setUrban(int urban) {
        this.urban = urban;
    }

    public int getRural() {
        return rural;
    }

    public void setRural(int rural) {
        this.rural = rural;
    }

    public int getN_road() {
        return N_road;
    }

    public void setN_road(int N_road) {
        this.N_road = N_road;
    }

    public int getM_way() {
        return M_way;
    }

    public void setM_way(int M_way) {
        this.M_way = M_way;
    }

   
 
 
 
}
