/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphismagain;

/**
 *
 * @author user
 */
public class A {
private int startPoint;
private int endPoint;
private int checkPoint;

    public A() {
    }



    public A(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public A(int startPoint, int endPoint, int checkPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.checkPoint = checkPoint;
    }

    public int getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

    public int getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(int checkPoint) {
        this.checkPoint = checkPoint;
    }





public void oddNums(int start,int end)
{
    
 for(int i =start;i<end;i++)   
 {
   if(i % 2 ==1)  
     System.out.println(i);    
 } 
    System.out.println("In A in oddNums");   
}   
    
    
    
}//end of class
