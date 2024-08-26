/*
    Lab 6 Assignment
    Jason Chen
    112515450
 */
public class TenRandom {
    public static void main(String[] args){

        int n;
        double total = 0;       //  Declare variables

        //  Show random generated numbers
        System.out.println("10 random numbers ranging from 0 to 100: ");
        for(int i = 0; i < 10; i++){
            n = (int) (100 * Math.random());
            System.out.println(n);
            total += n;
        }
        System.out.println("The average of the ten numbers are " + total / 10.0);
    }

}
