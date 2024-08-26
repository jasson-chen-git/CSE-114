/*
    Homework 1 Assignment
    Jason Chen
    112515450
*/
import java.util.Scanner;
public class Eggs {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        double egg_num, eggs, cost;        //  Declare variable
        int dozens;

        //  User input
        System.out.println("\t$0.45/egg\t$3.25/dozen");
        System.out.println("How many eggs would you like to purchase?");
        egg_num = stdin.nextDouble();

        //  Calculation and print results
        eggs = egg_num % 12;
        dozens = (int) egg_num / 12;
        cost = (dozens * 3.25) + (eggs * 0.45);
        System.out.println("You ordered " + egg_num + " eggs. That's " + dozens + " dozen eggs at $3.25 per dozen and "
                + eggs + " loose eggs at 45 cents for a total of $" + cost + ".");

        stdin.close();
    }
}
