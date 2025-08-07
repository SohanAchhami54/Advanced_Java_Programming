import javax.swing.*;

public class ComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");

        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);  // Create combo box

        frame.add(comboBox);             // Add combo box to frame
        frame.setSize(200, 100);         // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);          // Show the frame
    }
}
