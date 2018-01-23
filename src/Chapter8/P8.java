package Chapter8;

import java.util.Scanner;

/**
 * program asks for salesman ID, day , and amount of sale
 *
 * @author Armon Hashemi
 */
public class P8 {

    /**
     * Main method asks for salesman ID, day , and amount of sale
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sale = new double[4][5];
        int x = 0;
        int y = 0;
        System.out.println("Enter the salesman ID as A, B, C, or D: ");
        String man = input.next();
        if (man.equals("A")) {
            x = 0;
        } else if (man.equals("B")) {
            x = 1;
        } else if (man.equals("C")) {
            x = 2;
        } else if (man.equals("D")) {
            x = 3;
        }

        System.out.println("Enter the day as M, T, W, H, or F: ");
        man = input.next();
        if (man.equals("M")) {
            y = 0;
        } else if (man.equals("T")) {
            y = 1;
        } else if (man.equals("W")) {
            y = 2;
        } else if (man.equals("H")) {
            y = 3;
        } else if (man.equals("F")) {
            y = 4;
        }

        System.out.println("Enter the amount of the sale: ");
        double bee = input.nextDouble();
        sale[x][y] = bee;
        for (int p = 0; p < 4; ++p) {
            for (int s = 0; s < 5; ++s) {
                System.out.print(sale[p][s]);
            }
        }

    }

}
