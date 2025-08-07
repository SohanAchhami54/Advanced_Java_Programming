import javax.swing.*;

public class SimpleList {
    public static void main(String[] args) {
        JFrame f = new JFrame("List Example");

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(items);  // Create list with array

        f.add(list);                     // Add list to frame
        f.setSize(200, 150);             // Set frame size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);              // Show frame
    }
}
