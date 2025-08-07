import javax.swing.*;
public class Groupla {
    public static void main(String[] args) {
        JFrame frame = new JFrame("One Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);

        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        JButton button = new JButton("Click Me");

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(button)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(button)
        );

        frame.setVisible(true);
    }
}
