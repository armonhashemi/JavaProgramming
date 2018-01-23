package Chapter6;

import java.util.Scanner;

/**
 * program asks for a valid password, tells you whether it is valid or not
 *
 * @author Armon Hashemi
 */
public class C6_18 {

    /**
     * asks for valid password
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter valid password: ");
        String pass = input.next();
        password(pass);
    }

    /**
     * Method checks if password is valid
     *
     * @param pass
     */
    public static void password(String pass) {

        int two = 0;
        for (int numbers = 0; numbers < pass.length(); ++numbers) {
            if (Character.isDigit(pass.charAt(numbers))) {
                two += 1;
            }
        }
        if ((pass.length() >= 8) && ((pass.matches("[a-zA-Z0-9]*"))) && (two > 2)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }
}
