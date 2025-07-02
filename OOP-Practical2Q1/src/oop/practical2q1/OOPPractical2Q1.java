
//  Write a program that prints the following table using the sqrt method in the Math class.

// +--------+------------+
// | Number | SquareRoot |
// +--------+------------+
// |      0 |     0.0000 |
// |      2 |     1.4142 |
// |     18 |     4.2426 |
// |     20 |     4.4721 |
// +--------+------------+

package oop.practical2q1;

/**
 *
 * @author zhenyu
 */
public class OOPPractical2Q1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        System.out.println("Number     SquareRoot");
        for (int i = 0; i <= 20; i += 2) {

            double squaredRoot = Math.sqrt(i);
            if (i < 10) {
                System.out.println(i + "          " + String.format("%.4f", squaredRoot));

            } else {
                System.out.println(i + "         " + String.format("%.4f", squaredRoot));

            }

        }
    }
}

// method overloading is when 2 or more methods having the same name but
// different parameter lists.
