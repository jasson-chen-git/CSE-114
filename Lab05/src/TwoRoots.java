/*
    Lab 5 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class TwoRoots {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double a, b, c;       //  Declare input variables
        double disc, root1, root2;      //  Declare misc. and output variables

        //  Ask for user inputs
        System.out.println("Enter a, b, and c: ");
        a = stdin.nextDouble();
        b = stdin.nextDouble();
        c = stdin.nextDouble();

        //  Calculate discriminant
        disc = b * b - 4 * a * c;
        //  Calculate roots if possible and display results

        if(disc >= 0){      //  Calculate root 1
            root1 = (Math.pow(disc, 0.5) - b) / (2 * a);
            if(disc > 0){       //  Calculate root 2 and display
                root2 = (-b - Math.pow(disc, 0.5)) / (2 * a);
                System.out.println("The equation has two roots: " + root1 + " and " + root2);
            }
            else{       //  Display one root since root 2 is the same
                System.out.println("The equation has one root: " + root1);
            }
        }
        else{       //  Display no roots since they are imaginary
            System.out.println("The equation has no real roots.");
        }

        stdin.close();
    }
}
