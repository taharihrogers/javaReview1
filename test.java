/**
 * Taharih Rogers
 * Java Review 1
 * test.java
 * 9/18/2019
 */
public class test {
    public static void main(String[] args)
    {
        //Write a test program that creates two Fan objects.
        // Assign maximum speed, radius 10, color yellow, and turn it on to the first objects.
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setSpeed(3);
        // Assign medium speed, radius 5, color blue and turn if off to the second object.
        Fan fan2 = new Fan(2, false, 5, "blue");

        // Display the objects by invoking their toString method.
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}