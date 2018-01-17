package Chapter2;

import java.util.Scanner;

/**
 * program calculates Celsius to Fahrenheit
 *
 * @author Armon Hashemi
 */
public class C2_1 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asks for input value 
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        // calculates celsius to fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("Celcius " + celsius + " is " + fahrenheit + " in Fahrenheit");
    }
}
