package Chapter2;

import java.util.Scanner;

/**
 * program calculates area and volume of cylinder
 *
 * @author Armon Hashemi
 */
public class C2_2 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of a cylinder: ");
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("The area is " + area);

        double volume = area * length;
        System.out.println("The volume is " + volume);
    }
}
