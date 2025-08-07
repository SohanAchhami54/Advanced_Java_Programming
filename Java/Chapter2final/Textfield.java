import javax.swing.*;

public class TextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Example");
        JTextField textField = new JTextField("Type here...");

        frame.add(textField);              // Add text field to frame
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(300, 200);           // Set frame size
        frame.setVisible(true);            // Show the frame
    }
}
    