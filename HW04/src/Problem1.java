/*
    Homework 4
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];        // Declare variable

        // Ask for user input
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i ++){
            arr[i] = in.nextInt();
        }

        // Print result
        System.out.print("The distinct integers are: ");
        for(int x : eliminateDuplicate(arr)){
            System.out.print(x + " ");
        }

        in.close();
    }
    public static int[] eliminateDuplicate(int[] arr){
        int[] temp = new int[10];
        int c = 0; // track unique elements
        for(int i = 0; i < arr.length; i++){
            boolean dupe = false;
            for(int j = 0; j < c; j++){
                if(arr[i] == temp[j]){
                    dupe = true;
                }
            }
            if(!dupe){
                temp[c] = arr[i];
                c++;
            }
        }
        arr = new int[c];
        for(int i = 0; i < c; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}
