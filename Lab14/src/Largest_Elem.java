/*
    Lab 15
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Largest_Elem {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = stdin.nextInt();
        int cols = stdin.nextInt();

        double num_arr[][] = new double[rows][cols];

        System.out.print("Enter the array: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                num_arr[i][j] = stdin.nextDouble();
            }
        }

        System.out.printf("The largest element in the array is at index: (%d, %d)",
                locate_elem(num_arr)[0], locate_elem(num_arr)[1]);

        stdin.close();
    }
    public static int[] locate_elem(double num_array[][]){
        double max = 0;
        int index[] = new int[2];

        for(int i = 0; i < num_array.length; i ++){
            for(int j = 0; j < num_array[i].length; j++){
                if(num_array[i][j] > max){
                    max = num_array[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}
