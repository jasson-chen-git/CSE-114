/*
    Homework 2 Assignment
    Jason Chen
    112515450
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int lower_limit, upper_limit;     //  Declare variables

        //  Ask for user inputs
        System.out.print("Enter the lower limit: ");
        lower_limit = stdin.nextInt();
        System.out.print("Enter the upper limit: ");
        upper_limit = stdin.nextInt();

        //  Perform methods and print results
        System.out.print("The Armstrong numbers between " + lower_limit + " and " +
                upper_limit + " are: ");
        System.out.print(list_of_armstrong_num(lower_limit, upper_limit));

        stdin.close();
    }
    public static List<Integer> list_of_armstrong_num(int lower_limit, int upper_limit){
        List<Integer> list = new ArrayList<>();
        for(int num = lower_limit; num <= upper_limit; num++){
            if(is_armstrong_num(num)){
                list.add(num);
            }
        }
        return list;
    }
    public static boolean is_armstrong_num(int num){
        return sum_of_power_digits(num) == num;
    }
    public static int sum_of_power_digits(int num){
        int sum = 0;
        List<Integer> list = list_of_digits(num);
        for(int i = 0; i < list.size(); i++){
            sum += Math.pow(list.get(i), list.size());
        }
        return sum;
    }
    public static List<Integer> list_of_digits(int num){
        List<Integer> list = new ArrayList<>();
        while(num != 0){
            list.add(num % 10);
            num /= 10;
        }
        return list;
    }
}
