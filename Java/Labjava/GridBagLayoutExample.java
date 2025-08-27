import java.awt.*;
import javax.swing.*;
public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set GridBagLayout as the layout manager
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Add components with constraints
        JButton button1 = new JButton("Button 1");
        gbc.gridx = 0; // Column 0
        gbc.gridy = 0; // Row 0
        gbc.gridwidth = 1; // Span 1 column
        gbc.gridheight = 1; // Span 1 row
        gbc.fill = GridBagConstraints.BOTH; // Fill both directions
        gbc.weightx = 1.0; // Horizontal weight
        gbc.weighty = 1.0; // Vertical weight
        frame.add(button1, gbc);

        JButton button2 = new JButton("Button 2");
        gbc.gridx = 1; // Column 1
        gbc.gridy = 0; // Row 0
        gbc.gridwidth = 2; // Span 2 columns
        gbc.gridheight = 1; // Span 1 row
        frame.add(button2, gbc);

        JButton button3 = new JButton("Button 3");
        gbc.gridx = 0; // Column 0
        gbc.gridy = 1; // Row 1
        gbc.gridwidth = 1; // Span 1 column
        gbc.gridheight = 1; // Span 1 row
        frame.add(button3, gbc);

        // Make the frame visible
        frame.setVisible(true);
    }
}
