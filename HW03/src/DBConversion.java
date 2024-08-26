/*
    Homework 3
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class DBConversion {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        //  Ask for user input
        System.out.print("Enter a decimal number: ");
        int n = stdin.nextInt();

        //  Convert and display
        System.out.print("Binary: " + dec2Bin(n));
    }
    public static String dec2Bin(int n){
        String b = "";
        do{
            if(n % 2 == 1){
                b += "1";
                n--;
            }
            else{
                b += "0";
            }
            n /= 2;
        }while(n != 0);
        return reverse(b);
    }
    public static String reverse(String s){
        String r = "";
        for(int i = 0; i < s.length(); i++){
            r += s.charAt(s.length() - i - 1);
        }
        return r;
    }
}
