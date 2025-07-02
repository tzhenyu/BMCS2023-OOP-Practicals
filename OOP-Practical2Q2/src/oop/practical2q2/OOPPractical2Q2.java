
// Instead of using the sqrt method in the Math class, you have been asked to implement the sqrt method using

// the approximation approach described below:

// ⮚ For numbers greater than one, the square root method must initially set a lower limit to one and an
// upper limit to the number (since the square root of the number always lies between one and the
// number). It must then determine the midpoint between the lower and upper limits and evaluate the
// square of the midpoint. If the square of the midpoint is greater than the number, the square root method
// must move the upper limit to the midpoint and similarly if the square of the midpoint is less than the
// number, it must move the lower limit to the midpoint. After moving the appropriate limit, the square
// root method must evaluate a new midpoint and repeat the process until the desired precision is
// obtained.

// ⮚ For numbers less than one, the algorithm is essentially the same, except that the initial lower limit is
// the number and the initial upper limit is one.

// ⮚ The required precision for double precision floating point numbers is 8 significant digits. The precision
// at any iteration can be determined by dividing the difference between the limits by the lower limit.
// When this is less than 1/108 any number between the limits will be an estimate of the square root of
// the number to the required precision. To minimize the error, the square root method should return the
// midpoint between the final limits that satisfy the precision requirement.

// ⮚ The square root method must return exact values for the special cases of zero and one.

// ⮚ If an application attempts to calculate the square root of a negative number, the square root method
// should display an appropriate message and terminate the program.
package oop.practical2q2;

/**
 *
 * @author zhenyu
 */
public class OOPPractical2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        squareRoot(81);
    }

    public static void squareRoot(double num) {

        double lower = 0, upper = 0, estimate, square, midpoint = 0;

        if (num == 0 || num == 1) {
            System.out.println(num);
            return;
        }

        if (num < 0) {
            System.out.println("Error!");
            return;
        }

        if (num > 1) {
            lower = 1;
            upper = num;
        } else if (num > 0 && num < 1) {
            lower = num;
            upper = 1;
        }

        estimate = (upper - lower) / lower;

        while (estimate > 0.00000001) {
            midpoint = (upper + lower) / 2;
            square = midpoint * midpoint;

            if (square > num) {
                upper = midpoint;
            } else {
                lower = midpoint;
            }
            estimate = (upper - lower) / lower;
        }

        double result = (lower + upper) / 2;
        System.out.println(result);
    }

}

// Q: Why use double instead of float?
// A: Float have 6-7 significant digits, while Double have 15-17 significant
// digits.
// In our case it detects 8 significant digits, which Float cannot satisfy, thus
// having error.
