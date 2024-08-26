/*
    Lab 1 Assignment
    Jason Chen
    112515450
*/
import java.util.Scanner;
public class lab01 {
    public static void main(String[] args){
        double radius, area;    //  Define radius and area variables
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = stdin.nextDouble();    //  New value is stored in variable radius

        //  Computing area
        area = 3.14159 * radius * radius;

        //  Displaying results
        System.out.println("The area for a circle with radius "
            + radius + " is " + area);

        stdin.close();
    }
}
