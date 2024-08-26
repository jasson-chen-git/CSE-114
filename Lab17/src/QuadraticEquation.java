/*
    Lab 17
    Jason Chen
    112515450
 */
public class QuadraticEquation {
    double a, b, c;
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(b, 2) - (4 * a * c);
    }
    public double getRoot1(){
        return (Math.pow(getDiscriminant(), 0.5) - b) / (2 * a);
    }
    public double getRoot2(){
        return (Math.pow(getDiscriminant(), 0.5) + b) / (2 * a);
    }
}
