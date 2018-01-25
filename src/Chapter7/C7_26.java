package Chapter7;

import java.util.Scanner;

/**
 * program asks for inputs for two lists and compares them
 *
 * @author Armon Hashemi
 */
public class C7_26 {

    /**
     * Main method asks for two lists of integers
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        System.out.println("Two lists are" + (equals(list1, list2) ? " " : " not ") + "strictly identical");

    }

    /**
     * Method checks if the lists are equal
     *
     * @param list1 contains user entered integers
     * @param list2 contains user entered integers
     * @return true or false
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;

    }

}
