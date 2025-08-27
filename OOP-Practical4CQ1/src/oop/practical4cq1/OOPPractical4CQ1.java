/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.practical4cq1;

/**
 *
 * @author zhenyu
 */
public class OOPPractical4CQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course c1 = new Course("Introduction to Computers", 250);
        
        c1.addStudent("Ali Said");
        c1.addStudent("Wong Ken");
        c1.addStudent("Peter Lim");
        
        Course c2 = new Course();
        c2.setCourseTitle("Object Oriented Programming");
        c2.setFeesPerStudent(300);
        c2.addStudent("Ali Said");
        c2.addStudent("Wong Ken");
        c2.addStudent("Peter Lim");
        
        
        
        
        System.out.println(c2);
        System.out.println(c2.calcFeesCollected());
        System.out.println("Students: ");
        for (int i=0; i < c2.getNoOfStudents(); i++) {
            System.out.println(c2.getStudentNames()[i]);
        }
        
        System.out.println("total courses: " + Course.getCourseCount());
    }
    
}
