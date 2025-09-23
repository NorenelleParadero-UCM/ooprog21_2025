public class DebugCircle
{
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;

   public DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }

   public int getRadius() // There was an extra semicolon in getRadius, making it invalid so I have to remove it
   {
      return radius; // changed the typo from radiuss to radius
   }

   public int getDiameter() // getDiameter was set as void but it returned a value, so it needed to be changed to int
   {
      return diameter;
   }

   public double getArea()
   {
      return area;
   }
}