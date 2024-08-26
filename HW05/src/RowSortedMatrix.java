/*
    Homework 5
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class RowSortedMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] m = new double[3][3];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = in.nextDouble();
            }
        }

        // Show matrix, call sort method, print result
        System.out.println("Original matrix");
        print_matrix(m);
        System.out.println("Row sorted matrix");
        print_matrix(sortRows(m));

        in.close();
    }
    public static void print_matrix(double[][] m){
        for(double[] x: m){
            for(double y: x){
                System.out.print(" \t" + y);
            }
            System.out.println();
        }
    }
    public static double[][] sortRows(double[][] m){
        for(int i = 0; i < m.length; i++){
            boolean sorted = false;
            while(!sorted){
                sorted = true;
                for(int j = 0; j < m[i].length - 1; j++){
                    if(m[i][j] > m[i][j + 1]){
                        sorted = false;
                        double temp = m[i][j];
                        m[i][j] = m[i][j + 1];
                        m[i][j + 1] = temp;
                    }
                }
            }
        }
        return m;
    }
}
