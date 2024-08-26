/*
    Lab 2 Assignment
    Jason Chen
    112515450
*/
import java.util.Scanner;
public class lab02 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double radius = 5.5;        //  Declare and assign 5.5 to radius
        double perimeter, area;     //  Declare the variables.

        //  Perform calculations
        perimeter = 3.14159 * 2 * radius;
        area = 3.14159 * radius * radius;

        //  Display results
        System.out.println("A circle with a radius " + radius + ". Its ");
        System.out.println("Perimeter is " + perimeter + ", and");
        System.out.println("Area is " + area + ".\n\n");


        double v0, v1, t;       //  Declare new variables.
        double acc;     //  Declare acceleration variable

        System.out.println("Enter initial velocity and final velocity in m/s, and time in seconds.");
        v0 = stdin.nextDouble();        //  Store first double as initial velocity
        v1 = stdin.nextDouble();        //  Store second double as final velocity
        t = stdin.nextDouble();     //  Store third double as time

        //  Perform calculation for acceleration
        acc = (v1 - v0) / t;

        //  Display results
        System.out.println("The average acceleration is " + acc + " meters per second squared.");

        stdin.close();
    }
}
