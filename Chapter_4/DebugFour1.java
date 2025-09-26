// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;

public class DebugFour1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int radius;

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();

        DebugCircle c = new DebugCircle(radius); 
        // fixed: before it was Circle c = new Circle(), but Circle didn’t exist
        // also removed c = new DebugCircle(c) because constructor needs an int, not an object

        System.out.println("The radius is " + c.getRadius());   
        // fixed: before it was getRad(), changed to match method name in DebugCircle

        System.out.println("The diameter is " + c.getDiameter());  
        // fixed: before it was getDiam(), changed to match method name in DebugCircle

        System.out.println("The area is " + c.getArea());
    }
}
