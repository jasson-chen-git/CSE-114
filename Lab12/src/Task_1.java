/*
    Lab 12
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        String str;
        char c;

        //  Ask for user input
        System.out.print("Enter a string followed by a character: ");
        str = stdin.next();
        c = stdin.next().charAt(0);

        //  Display results
        System.out.println("The character " + c + " occurs " + count(str, c) + " times in " + str);
        stdin.close();
    }
    public static int count(String str, char c){
        int n = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                n++;
            }
        }
        return n;
    }
}
