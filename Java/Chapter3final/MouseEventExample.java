import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener {

    MouseEventExample() {
        addMouseListener(this); // Register mouse listener

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        // Handle window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    // Optional methods (not implemented)
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
