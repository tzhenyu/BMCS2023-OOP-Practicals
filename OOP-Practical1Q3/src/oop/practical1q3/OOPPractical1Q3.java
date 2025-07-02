//# Question 3
//
//Write a Java program that validates a credit card number. The last digit of a credit card number is the check digit, which protects against transcription errors such as an error in a single digit or switching two digits.
//
//The program should prompt the user to enter an 8-digit number, and will print out whether the number is valid or not. If it is not valid, it should print the value of the check digit that would make it valid.
//
//Use the following method for verifying the credit card:
//
//Starting from the rightmost digit, form the sum of every other digit. For example, if the credit card number is 4358 9795, then you form the sum
//
//$$
//5 + 7 + 8 + 3 = 2 3
//$$
//
//Double each of the digits that were not included in the preceding step. Add all digits of the resulting numbers. For example, with the number given above, doubling the digits, starting with the next-tolast one, yields
//
//Adding all digits in these values yields $1 + 8 + 1 + 8 + 1 + 0 + 8 = 2 7 .$
//
//Add the sums of the two preceding steps. If the last digit of the result is 0, the number is valid. In our case, $2 3 + 2 7 = 5 0$ , so the number is valid.

package oop.practical1q3;

import java.util.Scanner;

/**
 *
 * @author zhenyu
 */
public class OOPPractical1Q3 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a 8-digit number: ");
        int creditNumber = 43589795;
        int temp = creditNumber;
        int sum1 = 0, sum2 = 0;

        // sum 2 digit
        for (int i = 1; i < 8; i += 2) {
            sum1 += temp % 10;
            temp /= 100;

        }

        System.out.println(sum1);

        // sum all digit
        temp = creditNumber;
        for (int i = 1; i < 8; i += 2) {
            int digit = (temp % 10) * 2;
            sum2 += digit % 10;
            digit /= 10;
            sum2 += digit % 10;
            temp /= 100;

            System.out.println();

        }
    }

}
