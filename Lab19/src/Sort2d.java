/*
    Lab 19
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Sort2d {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        System.out.print("Set of numbers: ");
        int n = in.nextInt();
        int[][] m = new int[n][2];

        System.out.print("Enter " + n * 2 + " numbers: ");
        for(int i = 0; i < n; i ++){
            m[i][0] = in.nextInt();
            m[i][1] = in.nextInt();
        }

        sort(m);

        in.close();
    }
    public static void print_sorted(int[][] m){
        System.out.println("Sorted Array");
        for(int i = 0; i < m.length; i++){
            System.out.print("{" + m[i][0] + ", " + m[i][1] + "}\t");
        }
        System.out.println();
    }
    public static void sort(int[][] m){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < m.length - 1; i++){
                if(m[i][0] > m[i + 1][0]){
                    sorted = false;
                    int[] temp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = temp;
                }
                else if(m[i][0] == m[i + 1][0] && m[i][1] > m[i + 1][1]){
                    sorted = false;
                    int[] temp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = temp;
                }
            }
        }
        print_sorted(m);
    }
}
