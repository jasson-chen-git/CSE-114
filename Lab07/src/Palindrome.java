/*
    Lab 7 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int num1, num2 = 0;        //  Declare and initialize variables

        //  Ask for user input
        System.out.println("Enter a three-digit integer: ");
        num1 = stdin.nextInt();

        //  Reverse original number
        num2 += num1 % 10 * 100;
        num2 += num1 % 100 / 10 * 10;
        num2 += num1 / 100;

        //  Check if palindrome and display results
        if(num1 == num2){
            System.out.println(num1 + " is a palindrome.");
        }
        else{
            System.out.println(num1 + " is not a palindrome.");
        }

        stdin.close();
    }
}
