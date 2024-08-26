/*
    Lab 17
    Jason Chen
    112515450
 */
public class Rectangle {
    double width = 1.0;
    double height = 1.0;
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public void print_info(){
        System.out.printf("Rectangle 1\n\tWidth: %.2f\n\tHeight: %.2f\n\tArea: %.2f\n\tPerimeter: %.2f\n\n",
                width, height, getArea(), getPerimeter());
    }
}

