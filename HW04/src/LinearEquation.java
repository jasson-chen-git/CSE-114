public class LinearEquation {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public boolean isSolvable(){
        return (a * d - b * c) != 0;
    }
    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }
    public double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }
    public void printResults(){
        if(isSolvable()){
            System.out.println("X is " + getX() + "\nY is " + getY() + "\n");
        }
        else{
            System.out.println("The equation has no solutions.\n");
        }
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
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }
}
