/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Person a = new Person(); // GETS METHOD 1()

//System.out.println("Person a = new Person() gets register method  "+a.register()+"\n");     
 //------------------------------

Student b =new Student();  // GETS METHOD 2() AND 3(P)

//System.out.println(b.register()+" and "+b.register("tom")+"\n");

        
//--------------------------------- 

PostGrad c = new PostGrad(); // GETS METHOD 4() AND 5(P)
  
//System.out.println(c.register()+" and "+c.register("tom")+"\n");


//----------------------------------

Person d = new Student(); // GETS METHEOD 2 FROM STUDENT NOT 1 FROM PERSON
  
//System.out.println(d.register()+"\n");

//-----------------------------

Person e = new PostGrad(); //GETS METHOD 4 FROM POSTGRAD NOT 1 FROM PERSON

//System.out.println(e.register()+"\n");

//---------------------------

Student f = new PostGrad(); //GETS METHOD 4 FROM POSTGRAD NOT 2 FROM STUDENT AND 5 FROM POASGRAD NOT 3 FROM STUDENT

//System.out.println(f.register()+" and "+f.register("bob")+"\n");

//------------------------

//Student g = new Person(); WONT WORK GOING UP NOT INHERITANCE
//  
//Student f = new PostGrad();  WONT WORK GOING UP NOT INHERITANCE


//-------------------------------




//Person allPeople[] =  new Person[6];
//
//allPeople[0] = a; 
//allPeople[1] = b; 
//allPeople[2] = c; 
//allPeople[3] = d; 
//allPeople[4] = e; 
//allPeople[5] = f; 


//if(allPeople[1] instanceof PostGrad)
//{
//    System.out.println("Is a person");   
//}else
//{
// System.out.println("not a person");   
//}
//for allPeople
Person allPeople[] =  new Person[21];
for(int i=0;i<21;i++)
{
 if(i<7)
 {
   allPeople[i] = new Person(); 
 }else if(i<14)
 {
    allPeople[i] = new Student();   
 }else{
     
 } allPeople[i] = new PostGrad();
}




ArrayList <Person> PGrads = new ArrayList();   
        for (Person typeOfPerson : allPeople) {   //for each loop
            if (typeOfPerson instanceof PostGrad) {
                
            }
            {
                PGrads.add(typeOfPerson);
            }
        }
System.out.println(PGrads.get(2).register());
        












    }///-----------------------------------------------
    
}
