/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.practical4cq1;

/**
 *
 * @author zhenyu
 */
public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames = new String[100];
    private static int courseCount = 0;
    
    public Course(String courseTitle, double feesPerStudent){
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        courseCount += 1;
        
    }
    
    public Course(){
        courseCount += 1;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public static int getCourseCount() {
        return courseCount;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }
    public double calcFeesCollected() {
        return feesPerStudent * noOfStudents;
    }
    
    public void addStudent(String studName) {
        studentNames[noOfStudents] = studName;
        noOfStudents += 1;
    }

    @Override
    public String toString() {
        return "Course{" + "courseTitle=" + courseTitle + ", feesPerStudent=" + feesPerStudent + ", noOfStudents=" + noOfStudents + ", studentNames=" + studentNames + ", courseCount=" + courseCount + '}';
    }
    
    
    
}
