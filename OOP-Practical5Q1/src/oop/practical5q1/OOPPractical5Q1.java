//Question 1
//Write a method that finds the number of occurrences of a specified character in a string using the following
//header:
//public static int countLetter(String str, char ch)
//Write a test program that prompts the user to enter a word and a letter of the alphabet. The program should
//then count and display the number of occurrences of the letter in the word. A sample dialog for the program
//is shown below:
//Enter a word: happy
//Enter the letter you want to count: p
//happy contains 2p
package oop.practical5q1;

import java.util.Scanner;

/**
 *
 * @author zhenyu
 */
public class OOPPractical5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.print("Enter the letter you want to count: ");
        char letter = scanner.next().charAt(0);
        
        int count = countLetter(word, letter);
        
        System.out.println(word + " contains " + count + " letter(s)");
        
    }
    
    public static int countLetter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count += 1;
            }
        
        }
        return count;
    }
    
}
