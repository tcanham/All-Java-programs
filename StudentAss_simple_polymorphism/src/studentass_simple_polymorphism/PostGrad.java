/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentass_simple_polymorphism;

/**
 *
 * @author user
 */
public class PostGrad extends Student{
private int	primaryDegreeID;
private	boolean isResearch;

    public PostGrad() {
    }

    public PostGrad(String studentName, int age) {
        super(studentName, age);
       
    }

    public int getPrimaryDegreeID() {
        return primaryDegreeID;
    }

    public void setPrimaryDegreeID(int primaryDegreeID) {
        this.primaryDegreeID = primaryDegreeID;
    }

    public boolean isIsResearch() {
        return isResearch;
    }

    public void setIsResearch(boolean isResearch) {
        this.isResearch = isResearch;
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "PostGrad{" + "primaryDegreeID=" + primaryDegreeID + ", isResearch=" + isResearch + '}';
        
    }
    
    

  public boolean isMature()
 {
   boolean  isMature  = false; 
   if(super.getAge() > 25) //THIS VERSION OF THE METHOD HAS A DIFFERENT TEST AGE
   {
    isMature = true;   
   } 
   return isMature;
 }
    
    
}//END
