/*
    Lab 7 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;

public class FuelEffic {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double distance, mpg, ppg, cost;    //  Declare variables

        //  Ask for user inputs
        System.out.print("Enter the driving distance: ");
        distance = stdin.nextDouble();
        System.out.print("Enter Miles per Gallon: ");
        mpg = stdin.nextDouble();
        System.out.print("Enter Price per Gallon: ");
        ppg = stdin.nextDouble();

        //  Calculate cost of driving and display
        cost = distance / mpg * ppg;
        System.out.println("The cost of driving is: $" + cost);

        stdin.close();
    }
}
