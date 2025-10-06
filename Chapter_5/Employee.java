public class Employee {
    private int employeeNumber;
    private double payRate;
    private double regularPay;
    private double overtimePay;

    final int MAX_EMP_NUMBER = 9999;
    final double MAX_RATE = 60.00;
    final double OVERTIME_MULTIPLIER = 1.5;
    final int REGULAR_HOURS = 40;

    public Employee(int empNumber, double rate, double hoursWorked) {
        if (empNumber > MAX_EMP_NUMBER) {
            empNumber = MAX_EMP_NUMBER;
        }

        this.employeeNumber = empNumber;
        this.payRate = rate;

        calculatePay(hoursWorked);
    }

    private void calculatePay(double hoursWorked) {
        if (hoursWorked > REGULAR_HOURS) {
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            regularPay = REGULAR_HOURS * payRate;
            overtimePay = overtimeHours * payRate * OVERTIME_MULTIPLIER;
        } else {
            regularPay = hoursWorked * payRate;
            overtimePay = 0;
        }
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getRegularPay() {
        return regularPay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }
}

