//Write a program to process quiz scores. The user should first input the total scores to be processed. 
//Next, the program should read the specified number of scores from the user and determine
//how many scores are above or equal to the average and how many scores are below the average.

// Enter number of quiz scores to process: 5
// Score 1: 10
// Score 2: 8
// Score 3: 9
// Score 4: 2
// Score 5: 4
// Results
// =======
// Average is 6.6
// Number of scores above or equal to the average is 3
// Number of scores below the average is 2

package oop.praactical3q1;

import java.util.Scanner;

/**
 *
 * @author zhenyu
 */
public class OOPPraactical3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of quiz scores to process: ");
        int quizScore = scanner.nextInt();

        System.out.println();

        int[] quizArray = new int[quizScore];
        for (int i = 0; i < quizScore; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            quizArray[i] = scanner.nextInt();
        }

        float sum = 0;
        float average;
        int aboveAverage = 0;
        int belowAverage = 0;

        for (int value : quizArray) {
            sum = sum + value;
        }
        average = sum / quizArray.length;

        for (int value : quizArray) {
            if (value > average) {
                aboveAverage++;
            } else {
                belowAverage++;
            }
        }
        System.out.println();
        System.out.println("Results");
        System.out.println("=======");
        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average is " + aboveAverage);
        System.out.println("Number of scores below the average is " + belowAverage);

    }

}
