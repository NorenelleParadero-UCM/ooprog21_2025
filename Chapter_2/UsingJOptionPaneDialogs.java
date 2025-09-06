import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    
    public static void main (String[] args) {
        String nameValue;
        int confirmationValue;

        do {

            nameValue = JOptionPane.showInputDialog(null, "What is your name?");
            confirmationValue = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
        } while (confirmationValue == 1);

        String outputmessage = "Hello, " + nameValue + "!";

        JOptionPane.showMessageDialog(null, outputmessage);
    }
}