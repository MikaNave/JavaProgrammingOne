package Chapter3;
import java.util.Scanner;
/**
 * Program to determine the better deal of 2 packages
 *
 * @author Mika Nave
 */
public class C3_33 {
/**
* Main Method 
*
* @param args arguments from command line prompt
*/
    public static void main(String [] args) {
            //set user input scanner
            Scanner input = new Scanner(System.in);
            System.out.println("Enter weight and price for package 1: ");
            //declare variables
            double oneWeight = input.nextDouble();
            double onePrice = input.nextDouble();
            System.out.println("Enter weight and price for package 2: ");
            //declare variables
            double twoWeight = input.nextDouble();
            double twoPrice = input.nextDouble();
            //Sort price to weight ratio
            if (oneWeight / onePrice > twoWeight / twoPrice){
                System.out.println("Packge 1 has a better price.");
            }
            else if (twoWeight / twoPrice > oneWeight / onePrice){
		System.out.println("Package 2 has a better price.");
            }
            else if (twoWeight / twoPrice == oneWeight / onePrice){
		System.out.println("Both packages have the same price.");
			
            }
        }

}
