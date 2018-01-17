package Chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * program asks for employee info and calculates pay
 *
 * @author Armon Hashemi
 */
public class C4_23 {

    /**
     * Main
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        System.out.println("Enter number of hours worked in a week: ");
        System.out.println("Enter hourly pay rate: ");
        System.out.println("Enter federal tax withholding rate: ");
        System.out.println("Enter state tax withholding rate: ");
        String name = input.next();
        Double hours = input.nextDouble();
        Double payRate = input.nextDouble();
        Double federal = input.nextDouble();
        Double percent1 = federal * 100;
        Double state = input.nextDouble();
        Double percent2 = state * 100;
        Double grossPay = payRate * hours;
        DecimalFormat d2 = new DecimalFormat("#.00");

        Double federalTax = grossPay * federal;
        Double stateTax = grossPay * state;
        Double deduct = federalTax + stateTax;
        Double netPay = grossPay - deduct;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + d2.format(payRate));
        System.out.println("Gross Pay: $" + d2.format(grossPay));
        System.out.println("Deductions: ");
        System.out.println("  Federal Withholding (" + percent1 + "%): $" + d2.format(federalTax));
        System.out.println("  State Withholding (" + percent2 + "%): $" + d2.format(stateTax));
        System.out.println("  Total Deduction: $" + d2.format(deduct));
        System.out.println("Net Pay: $" + d2.format(netPay));
    }
}
