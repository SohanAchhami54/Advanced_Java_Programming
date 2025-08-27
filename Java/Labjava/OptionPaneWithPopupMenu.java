import java.awt.event.*;
import javax.swing.*;

public class OptionPaneWithPopupMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OptionPane with Popup Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a popup menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem option1 = new JMenuItem("Option 1");
        JMenuItem option2 = new JMenuItem("Option 2");
        JMenuItem option3 = new JMenuItem("Option 3");

        // Add menu items to the popup menu
        popupMenu.add(option1);
        popupMenu.add(option2);
        popupMenu.add(option3);

        // Add action listeners to menu items
        ActionListener menuListener = e -> {
            String selectedOption = e.getActionCommand();
            JOptionPane.showMessageDialog(frame, "You selected: " + selectedOption, "Selection", JOptionPane.INFORMATION_MESSAGE);
        };

        option1.addActionListener(menuListener);
        option2.addActionListener(menuListener);
        option3.addActionListener(menuListener);

        // Add a mouse listener to show the popup menu
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(frame, e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(frame, e.getX(), e.getY());
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
