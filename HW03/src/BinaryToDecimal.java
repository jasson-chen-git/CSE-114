/*
    Homework 3
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        //  Ask for user input
        System.out.print("Enter a string of 0s and 1s: ");
        String b = stdin.nextLine();

        // Convert and display results
        System.out.print("Decimal value: " + bin2Dec(b));
        stdin.close();
    }
    public static int bin2Dec(String b){
        int d = 0;
        for(int i = 0; i < b.length(); i++){
            d += ((int) b.charAt(i) - 48) * Math.pow(2, b.length() - i - 1);
        }
        return d;
    }
}
