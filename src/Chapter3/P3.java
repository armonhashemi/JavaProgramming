package Chapter3;

import java.util.Scanner;

/**
 * program asks for 2 integers and compares them
 *
 * @author Armon Hashemi
 */
public class P3 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        double number = input.nextDouble();

        System.out.println("Enter the second integer: ");
        double number1 = input.nextDouble();

        if (number < number1) {
            System.out.println("The first number is less than the second ");
        }
        if (number > number1) {
            System.out.println("The first number is greater than the second ");
        }
        if (number == number1) {
            System.out.println("The first number is equal to the second ");
        }
        if (number <= number1) {
            System.out.println("The first number is less than or equal to the second ");
        }
        if (number != number1) {
            System.out.println("The first number is not equal to the second ");
        }
        if (number1 == 0) {
            System.out.println("Cannot divide by zero");
        }
        if ((number / number1) < 1) {
            System.out.println("proper fraction");
        }
        if ((number / number1) > 1) {
            System.out.println("improper fraction");
        }
        if (number >= 90) {
            System.out.println("A");
        }
        if (number >= 80 && number < 90) {
            System.out.println("B");
        }
        if (number >= 70 && number < 80) {
            System.out.println("C");
        }
        if (number >= 60 && number < 70) {
            System.out.println("D");
        }
        if (number < 60 && number < 60) {
            System.out.println("F");
        }
        if (number1 > 1 && number1 < 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }
}
