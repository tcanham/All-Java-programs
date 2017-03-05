/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ImportsA;
import ImportsB.*;
/**
 *
 * @author user
 */
public class AClass {
static int val = 4;
public static int val2 = 20;
 public static void main(String[] args) {
        System.out.println("In AClass "+val);  
        System.out.println(Bclass.val2);  
    }//end of main
}//end of class
