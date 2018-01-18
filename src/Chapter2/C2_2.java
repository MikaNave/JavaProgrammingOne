package Chapter2;

import java.util.Scanner;

/**
 * Program to find and display the area and volume of a cylinder
 *
 * @author Mika Nave
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //setting scanner
        Scanner input = new Scanner(System.in);
        //asking for user input
        System.out.print("Enter the length of a cylinder:");
        //setting variables for cylinder
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        //outputting results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }

}
