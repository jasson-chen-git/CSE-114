/*
    Homework 1 Assignment
    Jason Chen
    112515450
*/
import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double side1, side2, side3;     //  Declare variables
        String triangle = "Scalene";

        //  User inputs
        System.out.println("Enter the three sides of a triangle: ");
        side1 = stdin.nextDouble();
        side2 = stdin.nextDouble();
        side3 = stdin.nextDouble();

        //  Determination
        if(side1 == side2 || side1 == side3 || side2 == side3){
            triangle = "Isosceles";
        }
        if(side1 == side2 && side1 == side3){
            triangle = "Equilateral";
        }
        if(side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2){
            triangle = "Invalid input!";
        }

        //  Print
        System.out.println("The triangle is a(n): " + triangle);

        stdin.close();
    }
}
