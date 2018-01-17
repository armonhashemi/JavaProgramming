package Chapter2;

import java.util.Scanner;

/**
 * program asks for prices of meal and calculates prices and displays them
 *
 * @author Armon Hashemi
 */
public class P2 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the meal: ");
        double meal = input.nextDouble();

        System.out.print("Enter the price of the drink: ");
        double drink = input.nextDouble();

        System.out.print("Enter the price of the dessert: ");
        double dessert = input.nextDouble();

        double total = meal + drink + dessert;
        double tax = total * 0.10;
        double tax_t = (total * 0.10) + total;
        double tip = tax_t * 0.15;
        double totalcost = (tax_t * 0.15) + tax_t;

        System.out.println("The price of the whole meal is $" + total);

        System.out.println("The price of the tax is $" + tax);

        System.out.println("The price of the tip is $" + tip);

        System.out.println("The price of the whole meal plus tax is $" + tax_t);

        System.out.println("The price of the whole meal plus tax and tip is $" + totalcost);

    }
}
