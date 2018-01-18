package Chapter2;

import java.util.Scanner;

/**
 * Program to convert and display Celsius to Fahrenheit
 *
 * @author Mika Nave
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //setting scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius");
        //setting variables
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5 * celsius + 32);
        //printing result
        System.out.print(+celsius + "celsiiius into fahrenheit is " + fahrenheit);
    }

}
