/*
    Lab 11 Assignment
    Jason Chen
    112515450
 */
public class Summation {
    public static void main(String[] args){
        double sum = 0;

        for(int i = 1; i < 99; i+=2){
            sum += (double) i / (i + 2);
        }

        System.out.println("Summation of (1/3) + (3/5) + (5/7) + ... + (95/97) + (97/99) = " + sum);
    }
}
