/*
    Lab 4 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double lbs, kilos, inches, meters, bmi;     //  Declare variables

        //  Ask for user inputs
        System.out.println("Enter weight in pounds: ");
        lbs = stdin.nextDouble();
        System.out.println("Enter height in inches: ");
        inches = stdin.nextDouble();

        //  Conversions and BMI calculation
        kilos = 0.45359237 * lbs;
        meters = 0.0254 * inches;
        bmi = kilos / Math.pow(meters, 2);

        //  Print results
        System.out.println("BMI is " + bmi + ".");

        stdin.close();
    }
}
