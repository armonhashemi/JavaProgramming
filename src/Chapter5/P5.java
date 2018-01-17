package Chapter5;

import java.util.*;

/**
 * program asks to vote yes or no, then to quit when ready and calculates votes
 *
 * @author Armon Hashemi
 */
public class P5 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yes = 0;

        int no = 0;

        System.out.print("Enter \"Y\" to vote yes or Enter \"N\" to vote no: ");

        String vote = input.next();

        while (!"q".equals(vote) || (!"Q".equals(vote))) {

            if (vote.equals("Q") || vote.equals("q")) {
                break;
            }

            if (vote.equals("Y") || vote.equals("y")) {

                yes += 1;

            } else if (vote.equals("N") || vote.equals("n")) {

                no += 1;

            } else {
                System.out.println("invalid input");
            }

            System.out.print("Enter \"Y\" to vote yes or Enter \"N\" to vote no or Enter \"Q\" quit: ");

            vote = input.next();

        }

        System.out.println("YES votes has: " + yes + " votes");

        System.out.println("NO votes has: " + no + " votes");

    }

}
