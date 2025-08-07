import javax.swing.*;

public class SimpleLabel {
    public static void main(String[] args) {
        JFrame f = new JFrame("Label");
        JLabel label = new JLabel("Hello, this is a label!");

        f.add(label);
        f.setSize(200, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
