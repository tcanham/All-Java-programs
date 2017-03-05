/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays1;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Sixnations {
    
ArrayList <Sixnations> matchResults = new ArrayList(0);   
    
//-----------------------------------    
private String country;
private int played;
private int won;
private int drawn;
private int lost;
private int points;
//-----------------------------------
private int pointsScored;
private int pointsConceded;
private int pointsDiff;

    public Sixnations() {
    }

    public Sixnations(String country, int played, int won, int drawn, int lost, int pointsScored, int pointsConceded) {
        this.country = country;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.pointsScored = pointsScored;
        this.pointsConceded = pointsConceded;
        
//matchResults.add(this.)
    }

    
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
 




}//end of class
