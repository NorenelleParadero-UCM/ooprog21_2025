// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;

public class DebugFive4
{
    public static void main (String args[])
    {
        int one, two, three, four;
        int highest;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer >> ");
        one = input.nextInt();   // (1) correct: store in one

        System.out.print("Enter an integer >> ");
        two = input.nextInt();   // (2) fixed: should store in two

        System.out.print("Enter an integer >> ");
        three = input.nextInt(); // (3) fixed: should store in three

        System.out.print("Enter an integer >> ");
        four = input.nextInt();  // (4) fixed: should store in four

        if(one > two && one > three && one > four)
            highest = one;
        else if(two > one && two > three && two > four)   // (5) fixed: changed OR (||) to AND (&&)
            highest = two;
        else if(three > one && three > two && three > four) // (6) fixed: removed == one, just check if greater
            highest = three;
        else
            highest = four;

        System.out.println("The highest number is " + highest);
    }
}

// What I fixed:
// (1)–(4) Each input was being stored into "one". Changed them so values go into one, two, three, and four properly.
// (5) Changed condition for two from OR (||) to AND (&&) so it compares correctly against all numbers.
// (6) Removed unnecessary "== one" in the three check. It should only compare if three is greater than the others.
