/*
    Homework 1 Assignment
    Jason Chen
    112515450
*/
import java.util.Scanner;
public class DivisibleTest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        boolean div5and6 = false, div5or6 = false, div5xor6 = false;        //  Declare variables
        int num;

        //  User input
        System.out.println("Enter an integer: ");
        num = stdin.nextInt();

        //  Boolean determination
        if(num % 5 == 0 && num % 6 == 0){
            div5and6 = true;
        }
        if(num % 5 == 0 || num % 6 == 0){
            div5or6 = true;
        }
        if(!div5and6 && div5or6){
            div5xor6 = true;
        }

        //  Case determination
        System.out.println("Is " + num + " divisible by 5 and 6? " + div5and6 + ".");
        System.out.println("Is " + num + " divisible by 5 or 6? " + div5or6 + ".");
        System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + div5xor6 + ".");

        stdin.close();
    }
}

