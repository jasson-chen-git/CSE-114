/*
    Lab 13
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        //  Ask user for input
        System.out.print("Enter an integer: ");
        int n = stdin.nextInt();

        displayPattern(n);

        stdin.close();
    }
    public static void displayPattern(int n){
        for(int i = 1; i <= n; i ++){
            for(int j = 0; j < n; j++){
                if(j < n - i){
                    System.out.print("\t");
                }
                else{
                    System.out.print(n - j  + "\t");
                }
            }
            System.out.print("\n");
        }
    }
}
