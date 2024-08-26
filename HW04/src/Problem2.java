/*
    Homework 4
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user inputs
        System.out.print("Enter list 1 size and contents: ");
        int[] list1 = new int[in.nextInt()];
        for(int i = 0; i < list1.length; i++){
            list1[i] = in.nextInt();
        }
        System.out.print("Enter list 2 size and contents: ");
        int[] list2 = new int[in.nextInt()];
        for(int i = 0; i < list2.length; i++){
            list2[i] = in.nextInt();
        }

        // Print results
        System.out.print("List 1 is ");
        for(int x : list1){
            System.out.print(x + " ");
        }
        System.out.print("\nList 2 is ");
        for(int x : list2){
            System.out.print(x + " ");
        }
        System.out.print("\nThe merged list is ");
        for(int x : merge(list1, list2)){
            System.out.print(x + " ");
        }

        in.close();
    }
    public static int[] merge(int[] list1, int[] list2){
        int[] temp = new int[list1.length + list2.length];
        int j = 0, k = 0;
        for(int i = 0; i < temp.length; i++){
            if(j >= list1.length){
                temp[i] = list2[k];
                k ++;
            }
            else if(k >= list2.length){
                temp[i] = list1[j];
                j++;
            }
            else if(list1[j] < list2[k]){
                temp[i] = list1[j];
                j++;
            }
            else{
                temp[i] = list2[k];
                k++;
            }
        }
        return temp;
    }
}
