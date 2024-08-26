/*
    Lab 10 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;

public class PhoneNum {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        String num;         //  Declare variables

        //  Ask user input
        System.out.print("Enter the phone number: ");
        num = stdin.nextLine();

        //  Format and print new number
        System.out.print("Formatted phone number: ");
        System.out.print("(" + num.substring(0, 3) + ")" + num.substring(3, 6) +
                "-" + num.substring((6)));

        stdin.close();
    }
}
