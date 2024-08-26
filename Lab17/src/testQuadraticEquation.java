/*
    Lab 17
    Jason Chen
    112515450
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class testQuadraticEquation {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a, b, c: ");
        double a = stdin.nextDouble();
        double b = stdin.nextDouble();
        double c = stdin.nextDouble();

        QuadraticEquation Q1 = new QuadraticEquation(a, b, c);
        if(Q1.getDiscriminant() == 0){
            System.out.println("The equation has one root: " + Q1.getRoot1());
        }
        else if(Q1.getDiscriminant() > 0){
            System.out.println("The equation has two roots: " + Q1.getRoot1() + " and " + Q1.getRoot2());
        }
        else{
            System.out.println("The equation has no real roots.");
        }
        stdin.close();
    }
}
