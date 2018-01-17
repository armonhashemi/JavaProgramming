package Chapter2;

import java.util.Scanner;

/**
 * program gratuity and displays gratuity and total
 *
 * @author Armon Hashemi
 */
public class C2_5 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * gratuityRate * 0.01;
        double total = gratuity + subtotal;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);

    }
}
