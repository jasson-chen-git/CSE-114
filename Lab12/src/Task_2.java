/*
    Lab 12
    Jason Chen
    112515450
 */
public class Task_2 {
    public static void main(String[] args){
        for(int i = 1; i <= 20; i++){
            System.out.printf(i + "\t\t%.4f\n", compute_sum((float)i));
        }
    }
    public static float compute_sum(float n){
        if(n == 1){
            return n / (n + 1);
        }
        else{
            return n / (n + 1) + compute_sum(n - 1);
        }
    }
}
