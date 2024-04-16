import javax.swing.*;

public class DialogBox {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programming in Java is interesting");
        NameDialog nameDialog = new NameDialog();
        nameDialog.displayWelcomeMessage();
    }

    public static class NameDialog {
        public void displayWelcomeMessage() {
            String name = JOptionPane.showInputDialog("What is your name");
            String message = String.format("Welcome %s to Java programming", name);
            JOptionPane.showMessageDialog(null, message);
        }
    }
}