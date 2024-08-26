/*
    Lab 13
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        //  Ask for user input
        System.out.print("Enter an integer: ");
        int n = stdin.nextInt();

        reverse(n);

        stdin.close();
    }
    public static void reverse(int n){
        int r = 0;
        do{
            r *= 10;
            r += n % 10;
            n /= 10;
        }while(n != 0);
        System.out.print("Reversed integer: " + r);
    }
}
