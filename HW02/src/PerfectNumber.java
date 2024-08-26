/*
    Homework 2 Assignment
    Jason Chen
    112515450
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int limit;          //  Declare variables

        //  Ask for user input
        System.out.print("Enter the upper limit: ");
        limit = stdin.nextInt();

        //  Print results
        System.out.print("The perfect numbers below " + limit + " are: ");
        System.out.print(arr_of_perf_num(limit));

        stdin.close();
    }
    public static List<Integer> arr_of_perf_num(int limit){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= limit; i++){
            if(is_perf_num(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean is_perf_num(int value){
        return sum_of_divisors(value) == value;
    }
    public static int sum_of_divisors(int value){
        int sum = 0;
        List<Integer> list = arr_of_divisors(value);
        for(int i: list){
            sum += i;
        }
        return sum;
    }
    public static List<Integer> arr_of_divisors(int num){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                list.add(i);
            }
        }
        return list;
    }
}
