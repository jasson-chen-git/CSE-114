/*
    Lab 18
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class testLinearEquation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        LinearEquation Eq = new LinearEquation(a, b, c, d, e, f);

        // Print solutions to linear equation
        Eq.printResults();
    }
}
