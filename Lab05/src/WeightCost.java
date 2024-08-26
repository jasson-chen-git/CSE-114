/*
    Lab 5 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class WeightCost {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double weight;      //  Declare variables

        //  Ask for user input
        System.out.println("Weight of the package: ");
        weight = stdin.nextDouble();

        //  Check parameters and display results
        if(weight > 20){
            System.out.println("The package cannot be shipped.");
        }
        else if(weight > 10){
            System.out.println("The cost to ship this package is $10.50.");
        }
        else if(weight > 3){
            System.out.println("The cost to ship this package is $8.50.");
        }
        else if(weight > 1){
            System.out.println("The cost to ship this package is $5.50.");
        }
        else if(weight > 0){
            System.out.println("The cost to ship this package is $3.50.");
        }
        else{
            System.out.println("Invalid input.");
        }

        stdin.close();
    }
}
