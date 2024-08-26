/*
    Lab 7 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;

public class PolyArea {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int sides;      //  Declare variables
        double length, area;

        //  Ask for user inputs
        System.out.print("Enter the number of sides: ");
        sides = stdin.nextInt();
        System.out.print("Enter the length: ");
        length = stdin.nextDouble();

        //  Compute area and print results
        area = sides * Math.pow(length, 2) / (4 * Math.tan(Math.PI / sides));
        System.out.println("The area of the polygon is " + area);
    }
}
