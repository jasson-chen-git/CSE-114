/*
    Lab 22
    Jason Chen
    112515450
 */
package lab;
import java.util.Scanner;
public class Triangle extends GeometricObject{
    double side1 = 1.0, side2 = 1.0, side3 = 1.0;
    Triangle(){
        super();
    }
    Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    public String toString(){
        return super.toString() + "\nTriangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter 3 sides: ");
        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double s3 = in.nextDouble();
        System.out.print("Enter color: ");
        String co = in.nextLine();
        co = in.nextLine();
        boolean filled;
        System.out.print("Is the triangle filled? 0 - false, 1 - true: ");
        if(in.nextInt() == 0){
            filled = false;
        }
        else{
            filled = true;
        }

        // Create triangle and process
        GeometricObject T0 = new Triangle(s1, s2, s3, co, filled);
        System.out.println(T0.toString());


        in.close();
    }
}
