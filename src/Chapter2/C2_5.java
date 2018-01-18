package Chapter2;
import java.util.Scanner;
/**
 * Program to display total cost and gratuity 
 *
 * @author Mika Nave
 */
public class C2_5 {
/**
* Main Method 
*
* @param args arguments from command line prompt
*/ 
    public static void main(String [] args) {
        //setting scanner
        Scanner input=new Scanner(System.in);
        //asking for user input
        System.out.print("Enter the subtotal and gratuity:");
        //setting variables for user input
        double Subtotal=input.nextDouble();
        double gratuity=input.nextDouble();
        double Gratuity= (gratuity * .01);
        double subtotal= (Subtotal * Gratuity);
        double total= (Subtotal + subtotal);
        //displaying results
        System.out.println("The Gratuity is $" + subtotal + " and the total is $" +total);   
    }

}
