/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.practical5q2;
import java.util.Scanner;

/**
 *
 * @author zhenyu
 */
public class OOPPractical5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        System.out.print("Enter a string: ");
        String sentence = scanner.nextLine();
        String newSentence = sentence.toUpperCase();
        
        
  
            for (int i = 0; i < vowels.length; i++) {
                newSentence = newSentence.replace(vowels[i], 'X');
            }
   
        System.out.println(newSentence);
        
    }
    
}
