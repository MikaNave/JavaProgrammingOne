package Chapter3;
import java.util.Scanner;
/**
 * Program to display total cost and gratuity 
 *
 * @author Mika Nave
 */
public class C3_14 {
/**
* Main Method 
*
* @param args arguments from command line prompt
*/ 
    public static void main(String[] args){
        //Detect user input "heads" or "tails"
        int hot = (int)(Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for heads or 1 for tails: ");
        int x = input.nextInt();
        if (x >= 1) {
            System.out.println("Invalid Input");
            System.exit(0);
}
        //determine whether the user wins or loses
        if (x == hot) {
            System.out.println("Winner");
        }
        else {
            System.out.println("Loser");
        }
            
            
            
        }

}
