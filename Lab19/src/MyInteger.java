/*
    Lab 19
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class MyInteger {
    int value;
    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven() {
        return value % 2 == 0;
    }
    public boolean isOdd() {
        return !isEven();
    }
    public boolean isPrime() {
        boolean prime = true;
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
    public static boolean isEven(MyInteger MI) {
        return MI.isEven();
    }
    public static boolean isOdd(MyInteger MI) {
        return MI.isOdd();
    }
    public static boolean isPrime(MyInteger MI) {
        return MI.isPrime();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter an integer: ");
        MyInteger MI = new MyInteger(in.nextInt());

        // Test all methods
        System.out.println("Test class methods: " + MI.getValue());
        System.out.println("Even?: " + MI.isEven());
        System.out.println("Odd?: " + MI.isOdd());
        System.out.println("Prime?: " + MI.isPrime());

        System.out.println("Test static methods: " + MI.getValue());
        System.out.println("Even?: " + isEven(MI));
        System.out.println("Odd?: " + isOdd(MI));
        System.out.println("Prime?: " + isPrime(MI));

        in.close();
    }
}