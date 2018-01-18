package Chapter3;

import java.util.Scanner;

/**
 * Program to display the relationship between two numbers
 *
 * @author Mika Nave
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //step 1 and 2
        System.out.print("Enter 2 numbers: ");
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        // step 3 +
        if (number1 == number2) {
            System.out.println("The first number is equal to the Second");
        }
        if (number1 < number2) {
            System.out.println("The first number is less than the Second");
        }
        if (number1 > number2) {
            System.out.println("The First number is greater than the Second");
        }
        if (number1 <= number2) {
            System.out.println("The First number is less than or equal to the Second");
        }
        if (number1 >= number2) {
            System.out.println("The First number is less than or equal to the Second");
        }
        if (number1 != number2) {
            System.out.println("The First number is not equal to the Second");
        }
        if (number2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (number1 / number2 < 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("improper fraction");
        }
        if (number1 >= 90) {
            System.out.println("A");
        } else if (number1 >= 80) {
            System.out.println("B");
        } else if (number1 >= 70) {
            System.out.println("C");
        } else if (number1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (number2 >= 1) {
            System.out.println("In range");
        } else if (number2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }
}
