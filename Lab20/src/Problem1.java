/*
    Lab 20
    Jason Chen
    112515450
 */
import java.util.Random;
public class Problem1 {
    public static void main(String[] args){
        Random R = new Random();
        int[][] m = new int[4][4];
        int c = 0, r = 0;
        int max_c = 0, max_r = 0;

        // populate matrix
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = R.nextInt(2);
            }
        }

        // find first row and column with most 1s
        for(int i = 0; i < 4; i++){
            int sum_r = 0;
            int sum_c = 0;
            for(int j = 0; j < 4; j++){
                sum_r += m[i][j];
                sum_c += m[j][i];
                System.out.print(m[i][j]);
            }
            if(sum_r > max_r){
                max_r = sum_r;
                r = i;
            }if(sum_c > max_c){
                max_c = sum_c;
                c = i;
            }
            System.out.println();
        }

        // print results
        System.out.println("The largest row index is: " + r);
        System.out.println("The largest column index is: " + c);
    }
}
