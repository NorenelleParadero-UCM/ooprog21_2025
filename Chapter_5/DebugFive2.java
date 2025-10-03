// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;

public class DebugFive2
{
    public static void main(String args[])
    {
        int num;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();   // (1) fixed: added ()

        System.out.print("Enter another number: ");
        num2 = input.nextInt();  // (2) fixed: added ()

        if((num % num2 == 0) || (num2 % num == 0))   // (3) fixed: changed to % and used OR
        {
            System.out.println("One of these numbers is");
            System.out.println("evenly divisible into the other");
        }
        else
        { 
            System.out.println("Neither of these numbers is");
            System.out.println("evenly divisible into the other");
        }
    }
}

// What I fixed:
// (1) Added parentheses () after nextInt to call the method properly.
// (2) Did the same for num2 with nextInt().
// (3) used % instead of / and changed && to || so it works if either divides the other.
