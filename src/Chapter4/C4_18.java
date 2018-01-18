package Chapter4;
import java.util.Scanner;
/**
 * Program to determine a students class and grade
 *
 * @author Mika Nave
 */
public class C4_18 {
/**
* Main Method 
*
* @param args arguments from command line prompt
*/
        public static void main(String[] args) {
        System.out.print("Enter two chracters: ");
        Scanner input = new Scanner(System.in);
        String text = input.next().toUpperCase();
        String FullMajor = "";

        if((text.charAt(0) != 'M' && text.charAt(0) != 'C' && text.charAt(0) != 'I') || (text.charAt(1) != '1' && text.charAt(1) != '2' && text.charAt(1) != '3' && text.charAt(1) != '4'))
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        switch (text.charAt(0)) {
            case 'M':
                FullMajor = ("Mathematics ");
                break;
            case 'C':
                FullMajor = ("Computer Science");
                break;
            case 'I':
                FullMajor = ("Information Technology");
                break;
        }
       
        switch (text.charAt(1)) {
            case '1':
                FullMajor = FullMajor + "Freshman";
                break;
            case '2':
                FullMajor = FullMajor + "Sophomore";
                break;
            case '3':
                FullMajor = FullMajor + "Junior";
                break;
            case '4':
                FullMajor = FullMajor + "Senior";
                break;
        }
        System.out.println(FullMajor);
    }

}
