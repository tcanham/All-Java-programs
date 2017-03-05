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
public abstract class B extends A {

    public B() {
    }

    public B(int startPoint, int endPoint) {
        super(startPoint, endPoint);
    }

    public B(int startPoint, int endPoint, int checkPoint) {
        super(startPoint, endPoint, checkPoint);
    }

      public void oddNums(int start,int end,int check)
{
    
 for(int i =start;i<end;i++)   
 {
   if(i % 2 ==1)  
     System.out.println(i);    
 } 
    System.out.println("In B in oddNums");   
}     
    
    
}//end of class
