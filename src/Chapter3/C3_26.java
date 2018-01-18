package Chapter3;
import java.util.Scanner;
/**
 * Program to determine if how an integer is related to 5 and 6
 *
 * @author Mika Nave
 */
public class C3_26 {
/**
* Main Method 
*
* @param args arguments from command line prompt
*/
    public static void main (String [] args) {
			//detect user input
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.print("Enter an integer: ");
			//begin sorting system
		if ( x % 5 == 0 && x % 6 == 0) {
			System.out.println("is " + x + " divisible by 5 and 6? true");
		}
                else {
			System.out.println("is " + x + " divisible by 5 and 6? false");
		}
		if ( x % 5 == 0 || x % 6 == 0) {
			System.out.println("is " + x + " divisible by 5 or 6? true");
		}
		else {
			System.out.println("is " + x + " divisible by 5 or 6? false");
		}
		if ( x % 5 == 0 ^ x % 6 == 0) {
			System.out.println("is " + x + " divisible by 5 or 6, but not both? true");
		}
		else {
			System.out.println("is " + x + " divisile by 5 or 6, but not both? false");
		}
	}

}
