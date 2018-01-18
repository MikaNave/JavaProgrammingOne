package Chapter6;

import java.util.Scanner;

/**
 * Program to determine worth of American dollar in other countries
 *
 * @author Mika Nave
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Euros does a dollar buy?");
        double eu = input.nextDouble();
        System.out.println("How many Pound Sterling does a dollar buy?");
        double ps = input.nextDouble();
        System.out.println("How many Yen does a dollar buy?");
        double ye = input.nextDouble();

        String cont = "yes";
        do {
            System.out.println("Please enter the number of dollars you want to convert: ");
            double con = input.nextDouble();
            System.out.println("Enter \"E\" to buy Euros, \"P\" to buy Pounds, or \"Y\" to buy Yen: ");
            String von = input.next().toUpperCase();
            if (von.equals("E")) {
                System.out.printf("For %.2f dollars, you will be able to buy %.2f%n", con, con * eu * (con > 100 ? .95 : .9));
            } else if (von.equals("P")) {
                System.out.printf("For %.2f dollars, you will be able to buy %.2f%n", con, con * ps * (con > 100 ? .95 : .9));
            } else if (von.equals("Y")) {
                System.out.printf("For %.2f dollars, you will be able to buy %.2f%n", con, con * ye * (con > 100 ? .95 : .9));
            } else {
                System.out.println("Invalid Input!");
                continue;
            }
            while (true) {
                System.out.println("Are there more conversions to perform?");
                cont = input.next().toLowerCase();
                if (cont.equals("yes") || cont.equals("no")) {
                    break;
                }
            }
        } while (cont.equals("yes"));
    }
}
