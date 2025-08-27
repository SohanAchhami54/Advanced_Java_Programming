import java.awt.event.*;
import javax.swing.*;

public class EventHandlingInterface implements KeyListener {
    
    private JFrame frame;

    public EventHandlingInterface() {
        frame = new JFrame("Key Event Handling Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.setVisible(true);
        JLabel keyLabel = new JLabel("Key Pressed: ");
        keyLabel.setBounds(50, 150, 200, 30);
        frame.add(keyLabel);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                keyLabel.setText("Key Pressed: " + e.getKeyChar());
            }
        }); 
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new EventHandlingInterface();
    }
}

