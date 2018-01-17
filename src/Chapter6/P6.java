package Chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * program converts dollars to either euros, yen, or pounds
 *
 * @author Armon Hashemi
 */
public class P6 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros does a dollar buy? ");
        double euro = input.nextDouble();

        System.out.print("How many Pound Sterling does a dollar buy? ");
        double pound = input.nextDouble();

        System.out.print("How many Yen does a dollar buy? ");
        double yen = input.nextDouble();

        String yesOrNo = "";
        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            double numOfDollars = input.nextDouble();

            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            String typeOfMoney = input.next();
            calculations(typeOfMoney, numOfDollars, yen, pound, euro, input);

            do {
                System.out.print("Are there more conversions to perform? ");
                yesOrNo = input.next();
            } while (!yesOrNo.equalsIgnoreCase("no") && !yesOrNo.equalsIgnoreCase("yes"));
        } while (yesOrNo.equalsIgnoreCase("yes"));
    }

    /**
     *
     * @param typeOfMoney
     * @param numOfDollars
     * @param yen
     * @param pound
     * @param euro
     * @param input
     */
    public static void calculations(String typeOfMoney, double numOfDollars, double yen, double pound, double euro, Scanner input) {
        DecimalFormat d2 = new DecimalFormat("0.00");
        double euros1 = 0, pound1 = 0, yen1 = 0, euros2 = 0,
                pound2 = 0, yen2 = 0;

        if (typeOfMoney.equalsIgnoreCase("E") && numOfDollars <= 100) {
            euros1 = (numOfDollars * euro) - ((numOfDollars * euro) * 0.10);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(euros1) + " Euros");

        }

        if (typeOfMoney.equalsIgnoreCase("E") && numOfDollars > 100) {
            euros2 = (numOfDollars * euro) - ((numOfDollars * euro) * 0.05);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(euros2) + " Euros");

        }

        if (typeOfMoney.equalsIgnoreCase("P") && numOfDollars <= 100) {
            pound1 = (numOfDollars * pound) - ((numOfDollars * pound) * 0.10);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(pound1) + " Pound Sterlings");
        }

        if (typeOfMoney.equalsIgnoreCase("P") && numOfDollars > 100) {
            pound2 = (numOfDollars * pound) - ((numOfDollars * pound) * 0.05);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(pound2) + " Pound Sterlings");
        }

        if (typeOfMoney.equalsIgnoreCase("Y") && numOfDollars <= 100) {
            yen1 = (numOfDollars * yen) - ((numOfDollars * yen) * 0.10);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(yen1) + " Yen");
        }

        if (typeOfMoney.equalsIgnoreCase("Y") && numOfDollars > 100) {
            yen2 = (numOfDollars * yen) - ((numOfDollars * yen) * 0.05);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(yen2) + " Yen");
        }

    }

}
