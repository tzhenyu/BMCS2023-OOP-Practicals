
// Write a class named UnitConverter that contains the following two methods

// public static double inchToCentimeter(double in)
// public static double centimeterToInch(double cm)

// The formula for the conversion is: centimeters = inches * 2.54

// Write a main method that invokes these methods to display the following tables:

// +--------+-------------+-------------+--------+
// | Inches | Centimeters | Centimeters | Inches |
// +--------+-------------+-------------+--------+
// |    1.0 |        2.54 |         5.0 |   1.97 |
// |    2.0 |        5.08 |        10.0 |   3.94 |
// |    3.0 |        7.62 |        15.0 |   5.91 |
// |    4.0 |       10.16 |        20.0 |   7.87 |
// |    5.0 |       12.70 |        25.0 |   9.84 |
// |    6.0 |       15.24 |        30.0 |  11.81 |
// |    7.0 |       17.78 |        35.0 |  13.78 |
// |    8.0 |       20.32 |        40.0 |  15.75 |
// |    9.0 |       22.86 |        45.0 |  17.72 |
// |   10.0 |       25.40 |        50.0 |   19.6 |
// +--------+-------------+-------------+--------+

package oop.practical2q3;

/**
 *
 * @author zhenyu
 */
public class OOPPractical2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double inches = 1;
        double centimeters = 5;
        double convertedInches, convertedCentimeters;

        System.out.println("Inches  Centimeters  Centimeters Inches");

        for (int i = 0; i < 10; i++) {

            convertedInches = inchToCentimeter(inches);
            convertedCentimeters = centimeterToInch(centimeters);

            System.out.println(
                    inches + "     " + String.format("%.2f", convertedInches) + "         " + centimeters + "          "
                            + String.format("%.2f", convertedCentimeters));

            inches++;
            centimeters += 5;
        }
    }

    public static double inchToCentimeter(double in) {
        return in * 2.54;
    }

    public static double centimeterToInch(double cm) {
        return cm / 2.54;
    }

}
