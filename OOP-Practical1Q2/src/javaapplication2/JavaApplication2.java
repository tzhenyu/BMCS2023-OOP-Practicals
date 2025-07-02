//# Question 2
//
//Write a Java program that prompts the user to enter his / her age.  The program should then calculate 
//and display the user’s age in terms of days and seconds, as shown below:
//
//Configuration: <Default> Enter your age (years): 20 
//Age in years: 20 years. 
//Age in days: 7300'days. 
//Age in seconds: 630720000 seconds 
//Process completed.
//
//Note: Practice good programming style:
//
//Follow the standard Java naming convention 
//Define and use constants for permanent data and values that never changes


package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author tzhenyu
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    static final int DAYS = 365;
    static final int HOURS = 24;
    static final int MINUTES = 60;
    static final int SECONDS = DAYS * HOURS * MINUTES * 60;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age (years): ");
        int age = scanner.nextInt();
        
        System.out.println("Age in years: " + age + " years.");
        
        System.out.println("Age in days: " + (age * DAYS) + " days.");
        
        System.out.println("Age in seconds: " + (age * SECONDS) + " seconds.");
        
    }
    
}
