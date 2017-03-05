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
public class Student {
    
private int studentID;  	
private String studentName; 
private int courseID; 
private String courseName; 
private int age;
private static int IDinc;

    public Student() {
    }

    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
        this.studentID = IDinc++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", studentName=" + studentName + ", courseID=" + courseID + ", courseName=" + courseName + ", age=" + age + '}';
    }
    
    
  
 public boolean isMature()
 {
   boolean  isMature  = false;
   if(age > 23)  //IN THIS METHOD TEST IS 23
   {
    isMature = true;   
   } 
   return isMature;
 }
}//end
