    import javax.swing.*;

public class SimplePassword {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Field Example");
        JPasswordField passwordField = new JPasswordField();

        frame.add(passwordField);             // Add password field to frame
        frame.setSize(300, 100);              // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);               // Show the frame
    }
}
