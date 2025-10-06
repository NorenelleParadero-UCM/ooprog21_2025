import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hours = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        int empNumber = 1; 

        Employee emp = new Employee(empNumber, rate, hours);

        System.out.println("Regular pay is " + emp.getRegularPay());
        System.out.println("Overtime pay is " + emp.getOvertimePay());

        input.close();
    }
}

