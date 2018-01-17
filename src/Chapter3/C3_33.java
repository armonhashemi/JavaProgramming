package Chapter3;

import java.util.Scanner;

/**
 * program asks for weight and price of 2 packages then compares
 *
 * @author Armon Hashemi
 */
public class C3_33 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price of package 1: ");

        double weight = input.nextDouble();
        double price = input.nextDouble();

        System.out.print("Enter weight and price of package 2: ");

        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        double package1 = price / weight;
        double package2 = price1 / weight1;

        if (package1 > package2) {
            System.out.print("Package 2 has a better price ");
        }
        if (package2 > package1) {
            System.out.print("Package 1 has a better price ");
        }
        if (package2 == package1) {
            System.out.print("Two packages have the same price ");
        }

    }
}
