package Chapter6;

import java.util.Scanner;

/**
 * Program to create and validate a password
 *
 * @author Mika Nave
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (valid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    /**
     * Method to determine password validity
     *
     * @param Password the variable to check for an acceptable password
     * @return boolean if the password is usable
     */
    public static boolean valid(String Password) {
        boolean Valid = true;
        if (Password.length() < 8) {
            Valid = false;
            System.out.println("A Password must have atleast eight characters");
        } else {
            int numberOfDigit = 0;
            for (int i = 0; i < Password.length(); i++) {
                if (Character.isDigit(Password.charAt(i))) {
                    ++numberOfDigit;
                }
                if (Character.isLetterOrDigit(Password.charAt(i))) {
                    Valid = true;
                } else {
                    Valid = false;
                    System.out.println("A password must only consist letters and digits");
                    break;
                }
            }
            if (numberOfDigit < 2) {
                Valid = false;
                System.out.println("A password must contain atleast 2 digits");
            }
        }
        return Valid;
    }

}
