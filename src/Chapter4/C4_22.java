package Chapter4;

import java.util.Scanner;

/**
 * program asks for 2 strings and looks if its a substring of the other
 *
 * @author Armon Hashemi
 */
public class C4_22 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        System.out.println("Enter string s2: ");
        String s1 = input.next();
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
