/*
    Homework 2 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class LargestCommonPrefix {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        String string1, string2;    //  Declare variables

        //  Ask for user input
        System.out.print("Enter the first string: ");
        string1 = stdin.nextLine();
        System.out.print("Enter the second string: ");
        string2 = stdin.nextLine();
        System.out.println(string1);
        System.out.println(string2);

        //  Find and print results.
        System.out.println("The largest common prefix is: " +
                first_largest_common_prefix(string1, string2));

        stdin.close();
    }
    public static String first_largest_common_prefix(String str1, String str2){
        boolean found = false;
        String prefix = str1 + " and " + str2 + " have no common prefix.";
        String str_short = shorter_string(str1, str2);
        String str_long = longer_string(str1, str2);
        int short_length = str_short.length(), long_length = str_long.length();

        //  Length of the common prefix should not be longer
        //  than the shortest string but longer than 1.
        for(int i = short_length; i > 1; i--){
            //  Check all substrings with length i in shorter string
            for(int j = 0; j < short_length - i + 1; j++){
                //  Check all substrings with length i in longer string
                for(int k = 0; k < long_length - i + 1; k++){
                    String prefix_of_str1 = str_short.substring(j, j + i);
                    String prefix_of_str2 = str_long.substring(k, k + i);
                    //  Compare if the substrings match.
                    if(prefix_of_str1.equals(prefix_of_str2)){
                        //  If matched, break out of this for loop and all
                        //  subsequent for loops.
                        prefix = prefix_of_str1;
                        found = true;
                        break;
                    }
                }
                if(found){break;}
            }
            if(found){break;}
        }
        return prefix;
    }
    public static String shorter_string(String str1, String str2){
        if(str1.length() < str2.length()){
            return str1;
        }
        else{
            return str2;
        }
    }
    public static String longer_string(String str1, String str2){
        if(shorter_string(str1, str2).equals(str1)){
            return str2;
        }
        else{
            return str1;
        }
    }
}