// Application lists valid shipping codes: A, C, T, or H
// Then prompts user for a code
// Application accepts a shipping code and determines if it is valid

import java.util.*;

public class DebugEight1 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        char userCode;
        String entry;

        // FIXED: Should start as false (original code incorrectly set found = true)
        boolean found = false;

        // Array of valid shipping codes
        char[] okayCodes = {'A', 'C', 'T', 'H'};

        System.out.println("Enter shipping code for this delivery.");
        System.out.print("Valid codes are: ");

        // FIXED: Loop should display all valid codes, not only the first 2
        // Original: for(int x = 0; x < 2; ++x)
        for (int x = 0; x < okayCodes.length; ++x) {
            System.out.print(okayCodes[x]);
            if (x != (okayCodes.length - 1))
                System.out.print(", ");
        }

        System.out.print(" >> ");
        entry = input.nextLine();

        // FIXED: Should get the first character (index 0)
        // Original code used charAt(1) which caused errors for 1-character input
        userCode = entry.charAt(0);

        // Loop to check if code is valid
        for (int i = 0; i < okayCodes.length; ++i) {

            // FIXED: Use == for comparison (original mistakenly used = which is assignment)
            if (userCode == okayCodes[i]) {
                found = true;
                break;  // Stop when match is found
            }
        }

        // FIXED: Output logic reversed in original code
        if (found)
            System.out.println("Good code");
        else
            System.out.println("Sorry, code not found");
    }
}
