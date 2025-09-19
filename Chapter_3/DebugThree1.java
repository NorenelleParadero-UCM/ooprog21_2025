// This program calculates a tip as 15% of the bill
import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  
        // fixed: before it was inputnextInt(), now I used nextDouble() so I can enter decimal amounts

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  
        // fixed: same problem here, changed to nextDouble()

        calcTip(check1);  // fixed: now I pass the value to the method
        calcTip(check2);
    }

    public static void calcTip(double bill) {  
        // fixed: added (double bill) so it can receive the amount
        final double RATE = 0.15;
        double tip;  // fixed: before it was written wrong (doube), now corrected to double

        tip = bill * RATE;  
        // fixed: before it was bill / RATE, I changed to bill * RATE to get 15%

        System.out.println("The tip should be at least $" + tip);
    }
}