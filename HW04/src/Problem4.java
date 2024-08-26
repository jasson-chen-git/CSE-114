/*
    Homework 4
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = 3;          // 3 by 3 matrix

        // Ask for user inputs
        System.out.print(n + " x " + n + " Matrix Multiplication\nEnter matrix 1: ");
        double[][] matrix1 = new double[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix1[i][j] = in.nextDouble();
            }
        }
        System.out.print("Enter matrix 2: ");
        double[][] matrix2 = new double[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix2[i][j] = in.nextDouble();
            }
        }

        // Print results
        double[][] product = multiplyMatrix(matrix1, matrix2);
        System.out.print("The cross product is");
        for(int i = 0; i < n; i++){
            if(i != 0){
                System.out.print("\n\t\t\t\t\t\t");
            }
            else{
                System.out.print("\t");
            }
            for(int j = 0; j < n; j++){
                System.out.printf("\t%.1f ", product[i][j]);
            }
        }
    }
    public static double[][] multiplyMatrix(double[][] matrix1, double matrix2[][]){
        double[][] product = new double[matrix1.length][matrix2[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                for(int k = 0; k < matrix1[0].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
}
