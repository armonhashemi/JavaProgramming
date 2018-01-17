package Chapter5;

import java.util.Scanner;

/**
 * program asks for a string, then gives the output reversed
 *
 * @author Armon Hashemi
 */
public class C5_46 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.next();
        System.out.println("The reversed string is " + new StringBuffer(string).reverse().toString());
    }
}
