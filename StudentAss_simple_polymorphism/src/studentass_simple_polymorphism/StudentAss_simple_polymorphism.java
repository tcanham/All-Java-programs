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
public class StudentAss_simple_polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Student a = new Student("tom",52);
    Student b = new Student("bob",22);
    PostGrad c = new PostGrad("billy",90);
    System.out.println(a); 
    System.out.println(b); 
    System.out.println(c);
//    System.out.println(a.isMature());
//    System.out.println(b.isMature());
//    System.out.println(c.isMature());
    } //END OF MAIN
    
}// END OF CLASS
