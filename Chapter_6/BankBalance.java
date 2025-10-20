import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double INTEREST_RATE = 0.03;
        double balance;
        int year = 1;
        int choice;

        System.out.print("Enter initial bank balance: ");
        balance = sc.nextDouble();

        System.out.println("Do you want to see next year's balance? ");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        choice = sc.nextInt();

        while (choice == 1) {
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n",
                    year, INTEREST_RATE, balance);

            System.out.println("\nDo you want to see the balance at the end for another year? ");
            System.out.print("Enter 1 for yes, or any other number for no >> ");
            choice = sc.nextInt();

            year++;
        }

        sc.close();
    }
}
