/*
    Lab 18
    Jason Chen
    112515450
 */
public class RegularPolygon {
    int n = 3;
    double side = 1;
    double x = 0;
    double y = 0;
    public RegularPolygon(){}
    public RegularPolygon(int n, double side){
        setN(n);
        setSide(side);
    }
    public RegularPolygon(int n, double side, double x, double y){
        setN(n);
        setSide(side);
        setX(x);
        setY(y);
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }    public int getN() {
        return n;
    }
    public double getSide() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getPerimeter(){
        return getN() * getSide();
    }
    public double getArea(){
        return (getN() * Math.pow(getSide(), 2)) / (4 * Math.tan(Math.PI / getN()));
    }
    public void printInfo(){
        System.out.println("The " + getN() + " sided regular polygon with length " + getSide() +
                ", centered at (" + getX() + ", " + getY() + ")\nhas a perimeter of " +
                getPerimeter() + " and an area of " + getArea() + ".\n");
    }
}
