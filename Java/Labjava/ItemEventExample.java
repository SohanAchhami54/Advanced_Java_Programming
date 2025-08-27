import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemEvent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("Enable Option");
        
        // Add an ItemListener to handle item events
         checkBox.addItemListener(e -> {
            SwingUtilities.invokeLater(() -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(frame, "Checkbox Selected", "Item Event", JOptionPane.INFORMATION_MESSAGE);
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    JOptionPane.showMessageDialog(frame, "Checkbox Deselected", "Item Event", JOptionPane.INFORMATION_MESSAGE);
                }
            });
        });

        // Create a combo box
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Add an ItemListener to handle item events
        comboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                JOptionPane.showMessageDialog(frame, "Selected: " + e.getItem(), "Item Event", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add components to the frame
        frame.setLayout(new FlowLayout());
        frame.add(checkBox);
        frame.add(comboBox);

        // Make the frame visible
        frame.setVisible(true);
    }
}
