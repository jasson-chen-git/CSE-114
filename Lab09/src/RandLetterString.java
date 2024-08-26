/*
    Lab 9 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;

public class RandLetterString {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int i;          //  Declare counter variable

        System.out.print("Random Capital Letter: ");
        System.out.println(get_rand_letter());


        System.out.print("Random License Plate: ");
        for (i = 0; i < 3; i++){
            System.out.print(get_rand_letter());
        }
        for(i = 0; i < 4; i++){
            System.out.print(get_rand_number());
        }

        stdin.close();
    }

    public static char get_rand_letter(){
        char c;         //  Declare variables
        c = (char) (100 * Math.random() % 26 + 65);
        return c;
    }
    public static int get_rand_number(){
        int c;         //  Declare variables
        c = (int) (10 * Math.random());
        return c;
    }
}
