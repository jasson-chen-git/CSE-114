/*
    Homework 5
    Jason Chen
    112515450
 */
import java.util.Scanner;
public class Complex {
    private double real;
    private double imaginary;
    Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex(){
        this(0.0, 0.0);
    }
    public void AddComplex(Complex C1){
        this.real += C1.real;
        this.imaginary += C1.imaginary;
    }
    public void SubtractComplex(Complex C1){
        this.real -= C1.real;
        this.imaginary -= C1.imaginary;
    }
    public void PrintComplex(){
        System.out.println("(" + this.real + "," + this.imaginary + ")");
    }
    public void Copy(Complex C1){
        this.real = C1.real;
        this.imaginary = C1.imaginary;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the real part of the first complex number: ");
        double a = in.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double b = in.nextDouble();
        Complex C0 = new Complex(a, b);

        System.out.print("Enter the real part of the second complex number: ");
        a = in.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        b = in.nextDouble();
        Complex C1 = new Complex(a, b);

        // Print results
        System.out.print("First complex number is: ");
        C0.PrintComplex();
        System.out.print("Second complex number is: ");
        C1.PrintComplex();

        System.out.print("Addition of complex numbers is: ");
        Complex temp = new Complex();
        temp.Copy(C0);
        temp.AddComplex(C1);
        temp.PrintComplex();

        System.out.print("Subtraction of complex numbers is: ");
        temp.Copy(C0);
        temp.SubtractComplex(C1);
        temp.PrintComplex();

        in.close();
    }
}
