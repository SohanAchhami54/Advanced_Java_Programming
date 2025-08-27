import java.awt.event.*;
import javax.swing.*;

public class WindowEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowEvent Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent automatic closing

        // Add a WindowListener to handle window events
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Window Opened", "Window Event", JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(frame, "Are you sure you want to close the window?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    frame.dispose(); // Close the window
                }
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
