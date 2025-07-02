//# Question 1
//
//Write a Java program that obtains the following input from the user:
//
//⮚ Name 
//⮚ Current year of study 
//Target GPA for this semester
//
//Then display a welcome message with the details that was input earlier.  A sample dialog is shown below:
//
//Enter name: Phua Chu Kang   
//Enter your year of study: 2   
//What is your target GPA for this semester? 3.75   
//Welcome Phua Chu Kang!   
//Work hard to achieve your target GPA of 3.75 this semester of your Year 2.

package oop.practical1;
import java.util.Scanner;

/**
 *
 * @author tzhenyu
 */
public class OOPPractical1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your year of study: ");
        int yearOfStudy = scanner.nextInt();
        
        System.out.print("What is your target GPA in this semester? ");
        float semesterGPA = scanner.nextFloat();
        
        System.out.println("Welcome " + name + "!");
        System.out.println("Work hard to achieve your target GPA of " + semesterGPA + " this semester of your Year " + yearOfStudy + ".");
        
    }
    
}
