import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String predefined = "Carmen";

        System.out.print("Enter your name > ");
        String userInput = input.nextLine();

        if (userInput.equals(predefined)) {
            System.out.println(predefined + " equals " + userInput);
        } else {
            System.out.println(predefined + " does not equal " + userInput);
        }

        input.close();
    }
}
