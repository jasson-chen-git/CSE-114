/*
    Lab 4 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class TwoPointDistance {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double x1, y1, x2, y2, distance;        //  Declare variables

        //  Ask for user inputs
        System.out.println("Enter x1 and y1: ");
        x1 = stdin.nextDouble();
        y1 = stdin.nextDouble();
        System.out.println("Enter x2 and y2: ");
        x2 = stdin.nextDouble();
        y2 = stdin.nextDouble();

        //  Calculate distance
        distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        //  Print results
        System.out.println("The distance from (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);

        stdin.close();
    }
}
