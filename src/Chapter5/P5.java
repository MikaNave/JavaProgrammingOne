package Chapter5;

import java.util.Scanner;

/**
 * Program to count yes/no votes
 *
 * @author Mika Nave
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in;
        int noes = 0, yeses = 0;
        for (in = getString(input); !in.equals("q"); in = getString(input)) {
            if (in.equals("y")) {
                yeses++;
            } else if (in.equals("n")) {
                noes++;
            } else {
                System.out.print("INVALID CODE: ");
            }
        }
        System.out.printf("Total voting:%n"
                + "Number of NO votes: %d%n"
                + "Number of YES votes: %d%n", noes, yeses);
    }

    /**
     * Method to return votes
     *
     * @param in to determine the string contents
     * @return String return if the vote is yes or no
     */
    public static String getString(Scanner in) {
        System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
        return in.next().toLowerCase();
    }
}
