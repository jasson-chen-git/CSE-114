/*
    Lab 7 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;

public class InCircle {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double x, y;        //  Declare variables

        //  Ask for user inputs
        System.out.print("Enter a point with two coordinates: ");
        x = stdin.nextDouble();
        y = stdin.nextDouble();

        //  Determine if coordinates are inside circle and print results
        if(Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10){
            System.out.println("The point (" + x + ", " + y + ") is in the circle.");
        }
        else{
            System.out.println("The point (" + x + ", " + y + ") is NOT in the circle.");
        }

        stdin.close();
    }
}
