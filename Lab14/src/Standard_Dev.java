/*
    Lab 14
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Standard_Dev {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double num[] = new double[10];
        // Ask for user input
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            num[i] = stdin.nextDouble();
        }

        // Print Results
        System.out.println("The mean is: " + mean(num));
        System.out.println("The standard deviation is: " + deviation(num));

        stdin.close();
    }
    public static double mean(double num[]){
        double sum = 0;
        int i;
        for (i = 1; i < num.length + 1; i++){
            sum += num[i - 1];
        }
        return sum / i;
    }
    public static double deviation(double num[]){
        double sum = 0;
        double avg = mean(num);
        int i;
        for(i = 1; i < num.length + 1; i++){
            sum += Math.pow((num[i - 1] - avg), 2);
        }
        return Math.pow(sum / (i - 1), 0.5);
    }
}
