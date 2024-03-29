

/**
 * Taharih Rogers
 * Java Review 1
 * Fan.java
 * 9/18/2019
 */

public class Fan {
    //variables
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    //constructors, including a no arg one that creates a default fan
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int inSpeed, boolean inOn, double inRadius, String inColor){
        speed = inSpeed;
        on = inOn;
        radius = inRadius;
        color = inColor;
    }

    //accessor and mutator methods for all 4 fields
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int inSpeed){
        speed = inSpeed;
    }
    public boolean getOn(){
        return on;
    }

    public void setOn(boolean inOn){
        on = inOn;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double inRadius){
        radius = inRadius;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String inColor){
        color = inColor;
    }

    //toString
    public String toString(){
        String toString;
        //if fan is on, returns the fan speed, color, and radius in one combined string
        if(on==true)
        {
            toString = "Fan speed: " + speed + " Color: " + color + " Radius: " + radius;
        }
        //if fan is off, returns the fan color and radius along with the string "fan is off" in one combined string.
        else if(on==false)
        {
            toString = "Fan Color: " + color + " Radius: " + radius + " fan is off";
        }
        else
        {
            toString = "null";
        }
        return toString;

    }

}
