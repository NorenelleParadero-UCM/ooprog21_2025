// Start with a penny 
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;
public class DebugSix1
{
public static void main(String args[])
{
Scanner keyboard = new Scanner(System.in);
int days;
double money = 0.01;
int day = 1;

System.out.print("Enter number of days >> "); //Missing semicolon before 
days = keyboard.nextInt();

while(day <= days) //Wrong condition (was while(days < day)) 
{
money = 2 * money;
++day;
System.out.println("After day " + day +   //Printed wrong variable (was days) 
" you have " + money);
}

keyboard.close(); //Added to close the Scanner
}
}