// This class uses a DebugPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values
import java.util.Scanner;

public class DebugFour2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String color;
        String point;
        DebugPen pen1;
        DebugPen pen2;

        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();

        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();

        pen1 = new DebugPen();               
        pen2 = new DebugPen(color, point);   
        /* before (point, color), but the order was wrong.
        The constructor expects color first and point second,
        so I swapped them to make the pen data correct.
        */

        System.out.println("Default value pen:");
        display(pen1);

        System.out.println("User value pen:");
        display(pen2);   
        /* it was pen22 before, but that variable doesn’t exist.
        I changed it to pen2, which is the correct object.
        */
    }

    public static void display(DebugPen p)  

    /* 
    it was written as FixDebugPen, but that class doesn’t exist.
     I replaced it with DebugPen so it matches the real class.
    */

    {
        System.out.println(" The pen has ink color " + p.getColor());
        System.out.println(" and a " + p.getPoint() + " point.");  
        
        /* 
        it was p1 before, but p1 was never declared.
        I changed it to p since that’s the actual parameter name.
        */
    }
}