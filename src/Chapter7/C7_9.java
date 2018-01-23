package Chapter7;

import java.util.Scanner;

/**
 * program asks for 10 numbers and output shows the minimum
 *
 * @author Armon Hashemi
 */
public class C7_9 {

    /**
     * Main method ask for ten numbers and prints out the minimum
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + minimum(numbers));
    }

    /**
     * Method finds the minimum number out the ten
     *
     * @param array
     * @return
     */
    public static double minimum(double[] array) {
        double minimum = array[0];
        for (double i : array) {
            if (i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }
}
