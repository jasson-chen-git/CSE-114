/*
    Lab 16
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double[][] matrix = new double[4][4];

        // Ask for user input
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = stdin.nextDouble();
            }
        }

        // Calculate sum and print results
        System.out.println("Sum of elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] matrix){
        double sum = 0.0;
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
