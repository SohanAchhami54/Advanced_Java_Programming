import java.awt.event.*;
import javax.swing.*;

public class CalculatorSwing {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 250);
        frame.setLayout(null);//: We're manually setting positions using .setBounds()
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // First number label and text field
        JLabel label1 = new JLabel("First Num:");
        label1.setBounds(20, 20, 100, 25);
        JTextField text1 = new JTextField();
        text1.setBounds(120, 20, 120, 25);

        // Second number label and text field
        JLabel label2 = new JLabel("Second Num:");
        label2.setBounds(20, 60, 100, 25);
        JTextField text2 = new JTextField();
        text2.setBounds(120, 60, 120, 25);

        // Result label
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 140, 200, 25);

        // Add button
        JButton addButton = new JButton("Add");
        addButton.setBounds(40, 100, 80, 30);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(text1.getText());
                    int b = Integer.parseInt(text2.getText());
                    int result = a + b;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Enter valid numbers!");
                }
            }
        });

        // Subtract button
        JButton subButton = new JButton("Sub");
        subButton.setBounds(140, 100, 80, 30);
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(text1.getText());
                    int b = Integer.parseInt(text2.getText());
                    int result = a - b;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Enter valid numbers!");
                }
            }
        });

        // Add all to frame
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(resultLabel);

         frame.setVisible(true);
    }
}
