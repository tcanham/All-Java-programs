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
public class C extends B {

    public C() {
    }

    public C(int startPoint, int endPoint) {
        super(startPoint, endPoint);
    }

    public C(int startPoint, int endPoint, int checkPoint) {
        super(startPoint, endPoint, checkPoint);
    }

     @Override
 public void oddNums(int start,int end,int check)
{
 int counter=0;
 int checkCount=0;
 for(int i =start;i<end;i++)   
 { 
    
   if(i % 2 ==1)    
   {
    if(i>check)
       {          
         checkCount++;
       }      
     
   System.out.println(i); 
   counter++;
  }
 
 }
    System.out.println("Number of odd numbers: "+counter);
    System.out.println("Number of odd numbers above: "+check+ " is "+checkCount);
    //System.out.println("In C in oddNums");  
    
  for(int i =start;i<end;i++)   
 { 
    
   if(i % 2 ==1&i>check) 
   {   
       System.out.println(i+" is an odd number above the check point ");
   } 
 }     
    
} 
  
 
    
    
    
}//end of class
