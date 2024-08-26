/*
    Lab 23
    Jason Chen
    112515450
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the input string: ");
        String str = in.nextLine();

        // Print results
        System.out.print("Elements of the Character array list: ");
        for(char c :toCharacterArray(str)){
//            if(c == ' '){         // uncomment if spaces are ignored as characters
//            }
//            else{
//                System.out.print(c + " ");
//            }
            System.out.print(c + " ");
        }

        in.close();
    }
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> letters = new ArrayList<>(s.length());
        for(int i = 0; i < s.length(); i++){
            letters.add(s.charAt(i));
        }
        return letters;
    }
}
