// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 centsimport java.util.*;
import java.util.*;

public class DebugFive1
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        int usersChoice;
        double bill = 0.0; // (1) fixed: initialized bill

        System.out.println("Order please:");
        System.out.println("1 - Burger");
        System.out.println("2 - Hotdog");
        System.out.println("3 - Grilled cheese");
        System.out.print("4 - Fish sandwich >> ");

        usersChoice = kb.nextInt();

        if(usersChoice == 1 || usersChoice == 2)   // (2) fixed: changed && to ||
            bill = bill + HIGH_PRICE;
        else if(usersChoice == 3 || usersChoice == 4)
            bill = bill + MED_PRICE;
        else
            System.out.println("Invalid choice. No sandwich added.");

        System.out.print("Fries with that? 1 - Yes 2 - No >> ");
        usersChoice = kb.nextInt();

        if(usersChoice == 1)   // (3) fixed: changed = to ==
            bill = bill + LOW_PRICE;

        System.out.println("Total bill is " + bill);  // (4) fixed: added quotes properly
    }
}
//What I fixed:
// (1) The variable bill was used before giving it a value, so we needed to start it at 0.0.
// (2) The condition if(usersChoice == 1 && usersChoice == 2) was wrong because the user cannot pick 1 and 2 at the same time. It should use OR || instead of AND &&.
// (3) The statement if(usersChoice = 1) was using = which sets a value, instead of == which checks a value. Changing it to == fixes the error.
// (4) The print statement was written as System.out.println(Total bill is " + bill) which is incorrect because the words were not inside quotes. The correct way is System.out.println("Total bill is " + bill);.
 