package Chapter3;

import java.util.Scanner;

/**
 * programs asks for int and tells you whether its divisible by 5 or 6
 *
 * @author Armon Hashemi
 */
public class C3_26 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        boolean isDivisible
                = (number % 5 == 0 && number % 6 == 0);
        System.out.println("Is " + number + " divisible by 5 and 6? " + isDivisible);

        boolean isDivisible1
                = (number % 5 == 0 || number % 6 == 0);
        System.out.println("Is " + number + " divisible by 5 or 6? " + isDivisible1);

        boolean isDivisible2
                = (number % 5 == 0) ^ (number % 6 == 0);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + isDivisible2);
    }

}
