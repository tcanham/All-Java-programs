/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SixNations;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class Country implements Comparator<Country>, Comparable<Country>{
    
  
    
//----------------Variables---------------------------------    
 
private String country;
private  int played;
private  int won;
private  int drawn;
private  int lost;
private  int pointsScored;
private  int pointsConceded;
private  int points;
private  int pointsDiff;

//----------------Constructors-------------------------------

    public  Country() {
    }

    public Country(String country, int played, int won, int drawn, int lost, int pointsScored, int pointsConceded, int points, int pointsDiff) {
        this.country = country;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.pointsScored = pointsScored;
        this.pointsConceded = pointsConceded;
        this.points = points;
        this.pointsDiff = pointsDiff;
    }

  

   
    
    
//----------------------Get & Set---------------------------------------
    
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDrawn() {
        return drawn;
    }

    public void setDrawn(int drawn) {
        this.drawn = drawn;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public void setPointsScored(int pointsScored) {
        this.pointsScored = pointsScored;
    }

    public int getPointsConceded() {
        return pointsConceded;
    }

    public void setPointsConceded(int pointsConceded) {
        this.pointsConceded = pointsConceded;
    }

    public int getPointsDiff() {
        return pointsDiff;
    }

    public void setPointsDiff(int pointsDiff) {
        this.pointsDiff = pointsDiff;
    }

   
    
 //----------------------Methods----------------------------------------
    
  
 @Override
    public int compareTo(Country t) {
     return (this.country).compareTo(t.country);
    }
     @Override
    public int compare(Country s1, Country s2) {
    return s1.getPoints()-s2.getPoints();
    } 
    
    
//-------------------To string override----------------------------------
    @Override
    public String toString() {
        return "Country{" + "country=" + country + ", played=" + played + ", won=" + won + ", drawn=" + drawn + ", lost=" + lost + ", pointsScored=" + pointsScored + ", pointsConceded=" + pointsConceded + ", points=" + points + ", pointsDiff=" + pointsDiff + '}';
    }

   
    
   
    
}//end of class
