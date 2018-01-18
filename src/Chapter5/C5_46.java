package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string
 *
 * @author Mika Nave
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a String: ");
        String s = input.nextLine();
        System.out.println(" The Reversed string is: ");
        String stringBuffer = s;
        String reverse = reverse().toString();

    }

    /**
     * Method to reverse string
     *
     * @param reverse to reverse string
     * @return object to display
     */
    private static Object reverse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
