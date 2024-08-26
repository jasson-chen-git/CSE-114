/*
    Lab 15
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Markov_Matrix {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the size of the square matrix: ");
        int n = stdin.nextInt();

        double matrix[][] = new double[n][n];

        System.out.print("Enter a(n) " + n + " by " + n + " matrix row by row: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = stdin.nextDouble();
            }
        }
        if(isMarkovMatrix(matrix)){
            System.out.print("It is a Markov matrix.");
        }
        else{
            System.out.print("It is NOT a Markov matrix.");
        }
    }
    public static boolean isMarkovMatrix(double matrix[][]){
        double sum;
        boolean isMarkov = true;
        for(int i = 0; i < matrix.length; i++){
            if(!isMarkov){
                break;
            }
            sum = 0.0;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[j][i] < 0){
                    isMarkov = false;
                }
                sum += matrix[j][i];
            }
            if(sum != 1){
                isMarkov = false;
            }
        }
        return isMarkov;
    }
}
