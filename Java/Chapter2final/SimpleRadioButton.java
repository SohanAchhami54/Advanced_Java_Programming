import javax.swing.*;

public class SimpleRadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button");
        JRadioButton option1 = new JRadioButton("Choose me 1");
        JRadioButton option2 = new JRadioButton("Choose me 2");

        frame.setLayout(new java.awt.FlowLayout());  // Simple layout
        frame.add(option1);                          // Add first radio button
        frame.add(option2);                          // Add second radio button

        frame.setSize(200, 100);                     
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);                      
    }
}
