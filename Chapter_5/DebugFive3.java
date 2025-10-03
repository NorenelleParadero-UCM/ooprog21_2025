// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher - Housewares Department
import java.util.Scanner;

public class DebugFive3
{
    public static void main (String args[])
    {
        int item;
        String output;
        final int LOW = 111;
        final int HIGH = 999;
        final int CUTOFF = 500;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter item number >> ");
        item = input.nextInt();

        if(item < LOW)   // (1) changed > LOW to < LOW
            output = "Item number too low";
        else if(item > HIGH)   // (2) fixed typo HIGHH → HIGH
            output = "Item number too high";
        else if(item < CUTOFF)   // (3) changed == CUTOFF to < CUTOFF
            output = "Valid - Item in Automotive Department";
        else   // (4) all 500 or more go here
            output = "Valid - Item in Housewares Department";

        System.out.println(output);
    }
}

// What I fixed:
// (1) The first condition should check if the item number is less than LOW, not greater.
// (2) There was a typo in the second condition where HIGH was misspelled as HIGHH.
// (3) The third condition should check if the item number is less than CUTOFF to classify it as Automotive, not equal.
// (4) The last else now correctly handles all numbers 500 or more, which belong to the Housewares Department.
