/*
    Homework 3
    Jason Chen
    112515450
 */
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        String str1, str2;      //  Declare variables

        //  Ask for user inputs
        System.out.print("Enter the first string: ");
        str1 = stdin.nextLine();
        System.out.print("Enter the second string: ");
        str2 = stdin.nextLine();

        System.out.print(str1 + " and " + str2 + " are " +
                anagram_check(str1.toLowerCase().replaceAll(" ", ""),
                        str2.toLowerCase().replaceAll(" ", "")) + "anagrams");

        stdin.close();
    }
    public static String anagram_check(String str1, String str2){
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1, s2)){
            return "";
        }
        else{
            return "NOT ";
        }
    }
}
