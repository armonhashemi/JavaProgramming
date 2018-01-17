package Chapter3;

import java.util.Scanner;

/**
 * program asks heads(0) or tails(0) and tells you if you guessed right
 *
 * @author Armon Hashemi
 */
public class C3_14 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int coin = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.print("Guess heads(0) or talis(1): ");
        int guess = input.nextInt();
        if (guess == coin) {
            System.out.println("the guess is correct");
        } else {
            System.out.println("the guess is incorrect");
        }
    }

}
