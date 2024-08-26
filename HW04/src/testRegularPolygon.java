/*
    Lab 18
    Jason Chen
    112515450
 */
public class testRegularPolygon {
    public static void main(String[] args){
        RegularPolygon P1 = new RegularPolygon();
        RegularPolygon P2 = new RegularPolygon(6, 4);
        RegularPolygon P3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Print polygon info
        P1.printInfo();
        P2.printInfo();
        P3.printInfo();
    }
}
