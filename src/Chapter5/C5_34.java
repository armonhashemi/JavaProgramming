package Chapter5;

import java.util.Random;
import java.util.Scanner;

/**
 * program asks for either rock, paper, or scissor, and plays against computer
 *
 * @author Armon Hashemi
 */
public class C5_34 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String personPlay;
        String computerPlay = "";
        int computerInt;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int score = 0;
        int score2 = 0;
        while (score < 2 && score2 < 2) {
            System.out.println("scissor (0), rock (1), paper (2): ");

            computerInt = generator.nextInt(3) + 1;

            switch (computerInt) {
                case 1:
                    computerPlay = "scissor";
                    break;
                case 2:
                    computerPlay = "rock";
                    break;
                case 3:
                    computerPlay = "paper";
                    break;
                default:
                    break;
            }

            personPlay = scan.next();
            String person = "";

            if (null != personPlay) {
                switch (personPlay) {
                    case "0":
                        person = "scissor";
                        break;
                    case "1":
                        person = "rock";
                        break;
                    case "2":
                        person = "paper";
                        break;
                    default:
                        break;
                }
            }

            System.out.println("The computer is: " + computerPlay + ". You are " + person);

            if (person.equals(computerPlay)) {
                System.out.println("It's a tie!");
            }

            if (person.equals("rock") && computerPlay.equals("scissor")) {
                System.out.println("Rock beats scissors. You win");
                score += 1;
            }
            if (person.equals("rock") && computerPlay.equals("paper")) {
                System.out.println("Paper beats rock. You lose");
                score2 += 1;
            }
            if (person.equals("paper") && computerPlay.equals("scissor")) {

                System.out.println("Scissor beats paper. You lose");
                score2 += 1;
            } else if (computerPlay.equals("rock")) {
                System.out.println("Paper beats rock. You win");
                score += 1;
            } else if ((computerPlay.equals("paper")) && (person.equals("scissor"))) {
                {
                    System.out.println("Scissor beats paper. You win");
                    score += 1;
                }
                if ((computerPlay.equals("rock")) && (person.equals("scissor"))) {
                    System.out.println("Rock beats scissors. You lose");
                    score2 += 1;
                } else {
                    System.out.println("Invalid user input.");

                }

            }
            System.out.println("Score: " + score);
            System.out.println("Computer score: " + score2);
        }

    }

}
