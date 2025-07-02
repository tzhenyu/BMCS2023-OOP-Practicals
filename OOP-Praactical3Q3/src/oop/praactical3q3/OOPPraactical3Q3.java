// A banking program requires a breakdown of banknotes of various denominations 
// to be entered during transferring of fund from one teller to another. 
// A sample of the input screen is shown below after a teller has
// entered the quantity of each denomination:

// +------------------+----------+
// | Denomination(RM) | Quantity |
// +------------------+----------+
// |              100 |       26 |
// |               50 |       87 |
// |               20 |       96 |
// |               10 |        0 |
// |                5 |       33 |
// |                1 |      145 |
// +------------------+----------+

// The program should then display the value of each denomination 
// and the total as shown in the sample output below. 
// Note that the output should only contain the 
// denomination/quantity tuples with non-zero quantities.
// +------------------+----------+-----------------+
// | Denomination(RM) | Quantity | Value (RM)      |
// +------------------+----------+-----------------+
// | 100              |       26 |            2600 |
// | 50               |       87 |            4350 |
// | 20               |       96 |            1920 |
// | 5                |       33 |             165 |
// | 1                |      145 |             145 |
// | Total = RM 9180  |          |                 |
// +------------------+----------+-----------------+
package oop.praactical3q3;

import java.util.Scanner;

/**
 *
 * @author zhenyu
 */
public class OOPPraactical3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Denomination (RM)  Quantity");

        Scanner scanner = new Scanner(System.in);
        int[] denominationArray = { 100, 50, 20, 10, 5, 1 };
        int[] quantityArray = new int[denominationArray.length];
        int[] valueArray = new int[denominationArray.length];
        int total = 0;

        for (int i = 0; i < denominationArray.length; i++) {
            System.out.printf("%17d", denominationArray[i]);
            System.out.print("     ");
            int quantity = scanner.nextInt();

            quantityArray[i] = quantity;
            valueArray[i] = denominationArray[i] * quantityArray[i];
            total = total + valueArray[i];
        }

        System.out.println();
        System.out.println("Denomination (RM)  Quantity  Value (RM)");

        for (int i = 0; i < denominationArray.length; i++) {
            if (quantityArray[i] == 0) {
                i++;
            }
            System.out.println(
                    String.format("%17d", denominationArray[i]) +
                            String.format("%10d", quantityArray[i]) +
                            String.format("%12d", valueArray[i]));

        }
        System.out.println("Total: RM " + total);

    }

}
