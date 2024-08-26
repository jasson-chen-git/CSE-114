/*
    Lab 14
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Reverse_Array {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double num[] = new double[10];
        // Ask for user input
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            num[i] = stdin.nextDouble();
        }

        // Print results
        System.out.print("Original Array: ");
        print_array(num);
        System.out.print("\nReversed Array: ");
        print_array(reverse_array(num));

        stdin.close();
    }
    public static double[] reverse_array(double num[]){
        double temp1, temp2;
        int s = num.length;
        for(int i = 0; i < s / 2; i++){
            temp1 = num[i];
            temp2 = num[s - i - 1];
            num[i] = temp2;
            num[s - i - 1] = temp1;
        }
        return num;
    }
    public static void print_array(double num[]){
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "  ");
        }
    }
}
