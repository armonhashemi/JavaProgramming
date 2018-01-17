package Chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * program that compares two bids
 *
 * @author Armon Hashemi
 */
public class P4 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first bidder's name: ");
        String name1 = input.next();
        System.out.println("Enter number of hours work required: ");
        double hours1 = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate1 = input.nextDouble();

        System.out.println("Enter second bidder's name: ");
        String name2 = input.next();
        System.out.println("Enter number of hours work required: ");
        double hours2 = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate2 = input.nextDouble();

        double cost1 = payRate1 * hours1;
        double cost2 = payRate2 * hours2;

        DecimalFormat d2 = new DecimalFormat("#.00");

        if (cost1 < cost2) {
            System.out.println(("The winner is ") + name1 + (" the cost is $" + d2.format(cost1)));
        }

        if (cost2 < cost1) {
            System.out.println(("The winner is ") + name2 + (" the cost is $" + d2.format(cost2)));
        }

        if ((cost1 == cost2) && (hours1 < hours2)) {
            System.out.println("The winner is " + name1);
        }
        if ((cost1 == cost2) && (hours1 < hours2)) {
            System.out.println("The cost is $" + d2.format(cost1));
        }
        if ((cost1 == cost2) && (hours1 < hours2)) {
            System.out.println("The number of hours is " + hours1);
        }

        if ((cost1 == cost2) && (hours2 < hours1)) {
            System.out.println("The winner is " + name2);
        }
        if ((cost1 == cost2) && (hours2 < hours1)) {
            System.out.println("The cost is $" + d2.format(cost2));
        }
        if ((cost1 == cost2) && (hours2 < hours1)) {
            System.out.println("The number of hours is " + hours2);
        }

        if ((cost1 == cost2) && (hours2 == hours1)) {
            System.out.println("They have identical bids");

            System.out.println("The number of hours is " + d2.format(hours1));

            System.out.println("The cost per hour is $" + d2.format(payRate1));

            System.out.println("The total cost is $" + d2.format(cost1));

            System.out.println("The number of hours is " + hours1);
        }
    }
}
