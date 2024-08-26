/*
    Homework 5
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Rational {
    private int numerator;
    private int denominator;
    Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        SimplifyRational();
    }
    Rational(){
        this(1, 1);
    }
    public void AddRational(Rational R1){
        this.numerator *= R1.denominator;
        this.numerator += R1.numerator * this.denominator;
        this.denominator *= R1.denominator;
        SimplifyRational();
    }
    public void SubtractRational(Rational R1){
        this.numerator *= R1.denominator;
        this.numerator -= R1.numerator * this.denominator;
        this.denominator *= R1.denominator;
        SimplifyRational();
    }
    public void MultiplyRational(Rational R1){
        this.numerator *= R1.numerator;
        this.denominator *= R1.denominator;
        SimplifyRational();
    }
    public void DivideRational(Rational R1){
        this.numerator *= R1.denominator;
        this.denominator *= R1.numerator;
        SimplifyRational();
    }
    public void PrintRational(){
        System.out.println("" + this.numerator + "/" + this.denominator);
    }
    public void SimplifyRational(){
        for(int i = 2; i <= this.numerator && i <= this.denominator; i++){
            if(this.numerator % i == 0 && this.denominator % i == 0){
                this.numerator /= i;
                this.denominator /= i;
            }
        }
    }
    public void Copy(Rational R1){
        this.numerator = R1.numerator;
        this.denominator = R1.denominator;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter numerator for the first rational number: ");
        int a = in.nextInt();
        System.out.print("Enter denominator for the first rational number: ");
        int b = in.nextInt();
        Rational R0 = new Rational(a, b);

        System.out.print("Enter numerator for the first rational number: ");
        a = in.nextInt();
        System.out.print("Enter denominator for the first rational number: ");
        b = in.nextInt();
        Rational R1 = new Rational(a, b);

        // Print results
        System.out.print("First rational number is: ");
        R0.PrintRational();
        System.out.print("Second rational number is: ");
        R1.PrintRational();

        System.out.print("Addition of the rational numbers is: ");
        Rational temp = new Rational();
        temp.Copy(R0);
        temp.AddRational(R1);
        temp.PrintRational();

        System.out.print("Subtraction of the rational numbers is: ");
        temp.Copy(R0);
        temp.SubtractRational(R1);
        temp.PrintRational();

        System.out.print("Multiplication of the rational numbers is: ");
        temp.Copy(R0);
        temp.MultiplyRational(R1);
        temp.PrintRational();

        System.out.print("Division of the rational numbers is: ");
        temp.Copy(R0);
        temp.DivideRational(R1);
        temp.PrintRational();

        in.close();
    }
}
