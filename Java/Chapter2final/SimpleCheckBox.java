import javax.swing.*;

public class SimpleCheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Example");
        JCheckBox checkBox = new JCheckBox("I agree");

        frame.add(checkBox);               // Add checkbox to frame
        frame.setSize(300, 100);           // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);            // Show the frame
    }
}
