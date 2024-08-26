/*
    Lab 6 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class AlphabeticalCities {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        String city1, city2, city3;     //  Declare variables

        //  Ask user for inputs
        System.out.println("Enter the first city: ");
        city1 = stdin.nextLine();
        System.out.println("Enter the second city: ");
        city2 = stdin.nextLine();
        System.out.println("Enter the third city: ");
        city3 = stdin.nextLine();

        //  Display alphabetically
        System.out.println("The cities are alphabetized as follows: ");
        if(city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0){
            System.out.println(city1);
            if(city2.compareTo(city3) < 0){
                System.out.println(city2);
                System.out.println(city3);
            }
            else{
                System.out.println(city3);
                System.out.println(city2);
            }
        }
        else if(city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0){
            System.out.println(city2);
            if(city1.compareTo(city3) < 0){
                System.out.println(city1);
                System.out.println(city3);
            }
            else{
                System.out.println(city3);
                System.out.println(city1);
            }
        }
        else{
            System.out.println(city3);
            if(city1.compareTo(city2) < 0){
                System.out.println(city1);
                System.out.println(city2);
            }
            else {
                System.out.println(city2);
                System.out.println(city1);
            }
        }

        stdin.close();
    }
}
