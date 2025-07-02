// Write a method that returns the index of the smallest element in an array of integers. 
// If there is more than one such element, return the smallest index. 
// The method should receive an array of integers as the parameter. 
// Test your method by creating an array of integer numbers named list, 
// which contains the following integers:

// 1, 2, 4, 5, 10, 100, 2 and -22
package oop.praactical3q2;

/**
 *
 * @author zhenyu
 */
public class OOPPraactical3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 10, 100, 2, -22 };
        System.out.println(smallestArray(array));
    }

    public static int smallestArray(int[] array) {
        int smallestValue;
        int smallestElement = 0;
        smallestValue = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestElement = i;
            }
        }

        return smallestElement;
    }

}
