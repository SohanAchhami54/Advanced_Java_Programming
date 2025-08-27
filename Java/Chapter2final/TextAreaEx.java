import javax.swing.*;

public class TextAreaEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Area Example");
        JTextArea textArea = new JTextArea("Write something...");

        frame.add(textArea);               // Add text area to frame
        frame.setSize(300, 200);           // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);            // Show the frame
    }
}
