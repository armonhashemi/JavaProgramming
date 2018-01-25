package Chapter7;

import java.util.Scanner;

/**
 * program asks for the amount of numbers that will be read then ask for those
 * numbers and shows the average and contents
 *
 * @author Armon Hashemi
 */
public class P7 {

    /**
     * Main method asks for the amount of numbers and to enter elements and
     * shows average
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read: ");
        int[] num = new int[input.nextInt()];

        System.out.print("Enter " + num.length + " elements: ");
        Scanner Scanner = new Scanner(System.in);

        methodA(num, Scanner);

        System.out.println("The average is " + methodB(num));
        methodC(num);

    }

    /**
     * method has a for loop that changes ints to doubles
     *
     * @param num contains the integers asked for
     * @param input contains user input
     */
    public static void methodA(int[] num, Scanner input) {

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) input.nextDouble();
        }
    }

    /**
     * method calculates average
     *
     * @param num contains the integers asked for
     * @return the average of the ten numbers
     */
    public static double methodB(int[] num) {

        double sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        double averageNums;
        averageNums = sum / num.length;
        return averageNums;
    }

    /**
     * method prints the contents of the array
     *
     * @param num contains the integers asked for
     */
    public static void methodC(int[] num) {
        System.out.print("The contents of the array: \n" + java.util.Arrays.toString(num));
    }
}
