import javax.swing.*;
import java.awt.*;

public class GridBag {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Set layout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        // First button at (0,0)
        g.gridx = 0;
        g.gridy = 0;
        frame.add(new JButton("Button 1"), g);

        // Second button at (1,1)
        g.gridx = 1;
        g.gridy = 1;
        frame.add(new JButton("Button 2"), g);

        frame.setVisible(true);
    }
}
