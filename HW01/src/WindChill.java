/*
    Homework 1 Assignment
    Jason Chen
    112515450
*/
import java.util.Scanner;
public class WindChill {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double twc, ta, v;      //  Declare variables

        //  User input
        System.out.println("Enter the temperature between -58 and 41 (F): ");
        ta = stdin.nextDouble();
        if(ta < -58){        //  Input correction
            ta = -58;
            System.out.println("Temperature too low, set to -58F.");
        }
        if(ta > 41){
            v = 41;
            System.out.println("Temperature too high, set to 41F.");
        }

        System.out.println("Enter the wind speed greater than 2 (mph): ");
        v = stdin.nextDouble();
        if(v < 2){     //  Input correction
            v = 2;
            System.out.println("Wind speed too low, set to 2 mph.");
        }

        //  Calculation and print results
        twc = 35.74 + 0.6215 * ta + 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
        System.out.println("The wind-chill temperature is " + twc + ".");
    }
}
