/*
    Homework 4
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        String[] cities = new String[10];
        System.out.print("Enter 10 strings: ");
        for(int i = 0; i < cities.length; i++){
            cities[i] = in.nextLine();
        }

        // Print results
        System.out.print("Sorted cities: ");
        int commas = 0;
        for(String s : bubble_sort(cities)){
            System.out.print(s);
            if(commas < bubble_sort(cities).length - 1){
                System.out.print(", ");
                commas++;
            }
        }

        in.close();
    }
    public static String[] bubble_sort(String[] cities){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < cities.length - 1; i++){
                if(cities[i].compareTo(cities[i + 1]) > 0){
                    sorted = false;
                    String temp = cities[i];
                    cities[i] = cities[i + 1];
                    cities[i + 1] = temp;
                }
            }
        }
        return cities;
    }
}
