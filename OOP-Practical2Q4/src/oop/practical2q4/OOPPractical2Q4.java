// Create a class named Average that contains 4 overloaded methods named calculateAverage that will calculate
// and return the average of its parameters. Details of the 4 methods are provided below:

// calculateAverage method with 2 integer parameters
// calculateAverage method with 3 integer parameters
// calculateAverage method with 2 double parameters
// calculateAverage method with 3 double parameters

// Demonstrate the use of the 4 methods in a separate driver program.

package oop.practical2q4;

/**
 *
 * @author zhenyu
 */
public class OOPPractical2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(calculateAverage(5, 2));
        System.out.println(calculateAverage(5, 2, 3));
        System.out.println(calculateAverage(5.2, 2.4));
        System.out.println(calculateAverage(5.5, 2.6, 2.7));
    }

    public static float calculateAverage(int num1, int num2) {
        float average = (num1 + num2) / 2;

        return average;
    }

    public static float calculateAverage(int num1, int num2, int num3) {
        float average = (num1 + num2 + num3) / 3;

        return average;
    }

    public static double calculateAverage(double num1, double num2) {
        double average = (num1 + num2) / 2;

        return average;
    }

    public static double calculateAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;

        return average;
    }
}
