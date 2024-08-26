/*
    Homework 5
    Jason Chen
    112515450
 */
public class Circle2D {
    double x;
    double y;
    double radius;
    Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    Circle2D(){
        this(0.0, 0.0, 1);
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x, double y){
        return distance(x, y) <= radius;
    }
    public boolean contains(Circle2D circle){
        return distance(circle.x, circle.y) <= radius - circle.radius;
    }
    public boolean overlaps(Circle2D circle){
        return distance(circle.x, circle.y) <= radius + circle.radius;
    }
    public double distance(double x, double y){
        return Math.pow(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2), 0.5);
    }
    public static void main(String[] args){
        Circle2D C1 = new Circle2D(2, 2, 5.5);

        // Print results
        System.out.printf("Circle with origin at %.1f, %.1f and radius %.1f\n\thas an area of \t\t %.2f" +
                "\n\tand perimeter of \t %.2f\n\n", C1.x, C1.y, C1.radius, C1.getArea(), C1.getPerimeter());

        // Contains Circle
        System.out.println("Contains point 3, 3?: \t" + C1.contains(3, 3));
        System.out.println("Contains circle with origin at 4, 5 and radius " +
                "of 10.5?: \t" + C1.contains(new Circle2D(4, 5, 10.5)));

        // Overlaps Circle
        System.out.println("Overlaps with circle of origin at 3, 5 and radius " +
                "of 2.3?: \t" + C1.overlaps(new Circle2D( 3, 5, 2.3)));
    }
}
