package Chapter4;

import java.util.Scanner;

/**
 * program asks for for 2 characters to display major and grade
 *
 * @author Armon Hashemi
 */
public class C4_18 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String s1 = input.next();

        if (null != s1) //  boolean isValid = true;
        //  char firstCharacter = s1.charAt(0);
        // char secondCharacter = s1.charAt(1);
        //String s2 = input.next();
        {
            switch (s1) {
                case "M1":
                    System.out.print("Mathematics Freshman ");
                    break;
                case "m1":
                    System.out.print("Mathematics Freshman ");
                    break;
                case "C1":
                    System.out.print("Computer Science Freshman");
                    break;
                case "c1":
                    System.out.print("Computer Science Freshman");
                    break;
                case "I1":
                    System.out.print("Information Technology Freshman");
                    break;
                case "i1":
                    System.out.print("Information Technology Freshman");
                    break;
                case "M2":
                    System.out.print("Mathematics Sophomore ");
                    break;
                case "m2":
                    System.out.print("Mathematics Sophomore ");
                    break;
                case "C2":
                    System.out.print("Computer Science Sophomore");
                    break;
                case "c2":
                    System.out.print("Computer Science Sophomore");
                    break;
                case "I2":
                    System.out.print("Information Technology Sophomore");
                    break;
                case "i2":
                    System.out.print("Information Technology Sophomore");
                    break;
                case "M3":
                    System.out.print("Mathematics Junior ");
                    break;
                case "m3":
                    System.out.print("Mathematics Junior ");
                    break;
                case "C3":
                    System.out.print("Computer Science Junior");
                    break;
                case "c3":
                    System.out.print("Computer Science Junior");
                    break;
                case "I3":
                    System.out.print("Information Technology Junior");
                    break;
                case "i3":
                    System.out.print("Information Technology Junior");
                    break;
                case "M4":
                    System.out.print("Mathematics Senior ");
                    break;
                case "m4":
                    System.out.print("Mathematics Senior ");
                    break;
                case "C4":
                    System.out.print("Computer Science Senior");
                    break;
                case "c4":
                    System.out.print("Computer Science Senior");
                    break;
                case "I4":
                    System.out.print("Information Technology Senior");
                    break;
                case "i4":
                    System.out.print("Information Technology Senior");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }

}
