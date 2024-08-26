/*
    Homework 2 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        String str;         //  Declare variables

        //  Ask for user inputs
        System.out.print("Enter a string: ");
        str = stdin.nextLine();

        //  Check and print results
        if(remove_spaces(str).compareTo(backwards(remove_spaces(str))) == 0){
            System.out.println(" Input string " + str + " is a palindrome.");
        }
        else{
            System.out.println("Input string " + str + " is not a palindrome.");
        }
        stdin.close();
    }
    public static String backwards(String str){
        String temp = "";
        for(int i = 0; i < str.length(); i++){
            temp += str.charAt(i);
        }
        return temp;
    }
    public static String remove_spaces(String str){
        return str.replaceAll(" ", "");
    }
}
