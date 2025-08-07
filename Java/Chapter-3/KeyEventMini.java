import java.awt.*;
import java.awt.event.*;

public class KeyEventMini extends Frame implements KeyListener {
    public KeyEventMini() {
        addKeyListener(this);
        setSize(200, 100);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    
    public static void main(String[] args) {
        new KeyEventMini();
    }
}
