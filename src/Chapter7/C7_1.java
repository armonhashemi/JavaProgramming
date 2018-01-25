package Chapter7;

import java.util.Scanner;

/**
 * program asks for number of students and scores and tells their grades
 *
 * @author Armon Hashemi
 */
public class C7_1 {

    /**
     * Main Method asks for number of students then asks for that many test
     * grades
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int[] scores = new int[input.nextInt()];
        char[] grades = new char[scores.length];

        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();

        }
        FindGrades(scores, grades);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);

        }

    }

    /**
     * Method creates for loop to highest grade
     *
     * @param array contains the number of students and scores
     * @return the maximum number
     */
    public static int highest(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    /**
     * Method creates for loop to find score and grades
     *
     * @param scores contains list of scores
     * @param grades contains list of grades
     */
    public static void FindGrades(int[] scores, char[] grades) {

        int best = highest(scores);

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= best - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= best - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= best - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= best - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }
}
