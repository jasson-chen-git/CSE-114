/*
    Lab 10 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class SSN {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        String ssn;         //  Declare variables
        boolean valid = true;

        //  Ask for input
        System.out.print("Enter a SSN: ");
        ssn = stdin.nextLine();

        //  Check
        if(ssn.charAt(3) == '-' && ssn.charAt(6) == '-'){
            String temp = ssn.replaceAll("-", "");
            if(temp.length() != 9){
                valid = false;
            }
            else{
                for(int i = 0; i < temp.length(); i++){
                    if(temp.charAt(i) <= '0' && temp.charAt(i) >= '9') {
                        valid = false;
                        break;
                    }
                }
            }
        }
        else{
            valid = false;
        }
        if(valid){
            System.out.println(ssn + " is a valid SSN number.");
        }
        else{
            System.out.println(ssn + " is not a valid SSN number.");
        }

        stdin.close();
    }
}
