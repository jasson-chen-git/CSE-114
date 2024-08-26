/*
    Lab 16
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Scores {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        // Ask for user inputs
        System.out.print("Enter the number of students: ");
        int student_num = stdin.nextInt();
        int[] scores = new int[student_num];

        System.out.print("Enter " + student_num + " scores: ");
        for(int i = 0; i < student_num; i++){
            scores[i] = stdin.nextInt();
        }

        // Print back results
        for(int i = 0; i < student_num; i++){
            System.out.println("Student " + i + " score is " + scores[i] +
                    " and grade is " + convert_score(scores[i], max_score(scores)));
        }
    }
    public static char convert_score(int n, int m){
        if(n >= m - 10){
            return 'A';
        }
        else if(n >= m - 20){
            return 'B';
        }
        else if(n >= m - 30){
            return 'C';
        }
        else if(n >= m - 40){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public static int max_score(int[] scores){
        int max = 0;
        for(int i = 0; i < scores.length; i++){
            if(scores[i] > max){
                max = scores[i];
            }
        }
        return max;
    }
}
