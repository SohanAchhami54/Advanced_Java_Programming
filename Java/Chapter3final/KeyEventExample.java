import java.awt.*;
import java.awt.event.*;

public class KeyEventExample extends Frame implements KeyListener {
    TextField textField;

    KeyEventExample() {
        textField = new TextField(20);
        textField.addKeyListener(this); // Register key listener

        add(textField);
        setSize(300, 100);
        setLayout(new FlowLayout());
        setVisible(true);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

   public void keyPressed(KeyEvent e) {
    System.out.println("Key Pressed: " + e.getKeyChar());
}

public void keyReleased(KeyEvent e) {
    // You can leave empty if you don't need it
}

public void keyTyped(KeyEvent e) {
    // You can leave empty if you don't need it
}


    public static void main(String[] args) {
        new KeyEventExample();
    }
}
