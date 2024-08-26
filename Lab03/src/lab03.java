/*
    Lab 3 Assignment
    Jason Chen
    112515450
*/
import java.util.Scanner;
public class lab03 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        //  Part 1
        double celsius, fahrenheit;     //  Declare variables

        //  Ask user for Celsius input
        System.out.println("Enter the temperature in Celsius: ");
        celsius = stdin.nextDouble();

        //  Celsius to Fahrenheit conversion and display
        fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        System.out.println(celsius + "C is " + fahrenheit + "F.\n");


        //  Part 2
        double mass, temp0, temp1, energy;     //  Declare variables

        //  Ask user for inputs
        System.out.println("Enter the amount of water in kilograms: ");
        mass = stdin.nextDouble();
        System.out.println("Enter the initial temperature (C): ");
        temp0 = stdin.nextDouble();
        System.out.println("Enter the final temperature (C): ");
        temp1 = stdin.nextDouble();

        //  Calculation and display
        energy = mass * (temp1 - temp0) * 4184.0;
        System.out.println("The energy required is " + energy + " joules.");
    }
}
