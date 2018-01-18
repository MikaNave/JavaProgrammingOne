package Chapter2;
import java.util.Scanner;
/**
 * Program to calculate and display the various prices of a restaurant
 *
 * @author Mika Nave
 */
public class P2 {
/**
* Main Method 
*
* @param args arguments from command line prompt
*/
    public static void main(String[]args){
             Scanner input=new Scanner(System.in);
             System.out.println("How much is the meal? ");
             System.out.println("How much is the drink? ");
             System.out.println("How much is the dessert? ");
                double food=input.nextDouble();
                double drink=input.nextDouble();
                double dessert=input.nextDouble();
                //
             double Meal= (food + drink + dessert);
             double Tax=(Meal * .1);
             double Tip=((Meal + Tax) * .15) ;
             double Total= (Meal + Tax + Tip);
    System.out.println("The Price of food is $" + Meal);
    System.out.println("The Price of the tax is $" +Tax);
    System.out.println("The Price of the tip is $" +Tip);
    System.out.println("The Price of the total is $" +Total);
    }
}
