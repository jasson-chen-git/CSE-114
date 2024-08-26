/*
    Lab 21
    Jason Chen
    112515450
 */
public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    public String color = "blue";
    Fan(){}
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(isOn()){
            return "Fan Speed: \t" + speed +
                    "\nColor: \t\t" + color +
                    "\nRadius: \t" + radius + "\n";
        }
        else{
            return "Color: \t\t" + color +
                    "\nRadius: \t" + radius +
                    "\nFan is OFF\n";
        }
    }
    public static void main(String[] args){
        Fan F0 = new Fan();
        F0.setSpeed(FAST);
        F0.setRadius(10);
        F0.setColor("yellow");
        F0.setOn(true);

        Fan F1 = new Fan();
        F1.setSpeed(MEDIUM);
        F1.setRadius(5);

        System.out.println(F0.toString());
        System.out.println(F1.toString());
    }
}
