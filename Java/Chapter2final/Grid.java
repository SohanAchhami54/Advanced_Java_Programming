import javax.swing.*;
import java.awt.*;

public class Grid {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Set GridLayout with 2 rows and 3 columns
        frame.setLayout(new GridLayout(2, 3));

        // Add 6 buttons to fill the grid
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // Make the frame visible
        frame.setVisible(true);
    }
}
