/*
    Lab 11 Assignment
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class FormatDate {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        //  Ask for user input
        System.out.print("Enter a date in this format MM/DD/YYYY: ");
        String date = stdin.nextLine();

        //  Call methods and print results
        System.out.println("Alternate format: " + find_month(date.substring(0, 2)) + " "
                + date.substring(3, 5) + ", " + date.substring(6, 10));

        stdin.close();
    }
    public static String find_month(String mm){
        String month;
        switch(mm){
            case "01": month = "January";
                break;
            case "02": month = "February";
                break;
            case "03": month = "March";
                break;
            case "04": month = "April";
                break;
            case "05": month = "May";
                break;
            case "06": month = "June";
                break;
            case "07": month = "July";
                break;
            case "08": month = "August";
                break;
            case "09": month = "September";
                break;
            case "10": month = "October";
                break;
            case "11": month = "November";
                break;
            case "12": month = "December";
                break;
            default: throw new IllegalArgumentException("Invalid month: " + mm);
        }
        return month;
    }
}