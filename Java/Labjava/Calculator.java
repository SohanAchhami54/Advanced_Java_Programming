
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculation");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel n1 = new JLabel("First Number:");
        n1.setBounds(10, 10, 100, 20);
        frame.add(n1);

        JTextField t1 = new JTextField();
        t1.setBounds(120, 10, 100, 20);
        frame.add(t1);
        t1.setToolTipText("Enter first number");

        JLabel n2 = new JLabel("Second Number:");
        n2.setBounds(10, 40, 100, 20);
        frame.add(n2);

        JTextField t2 = new JTextField();
        t2.setBounds(120, 40, 100, 20);
        frame.add(t2);
        t2.setToolTipText("Enter second number");

        JTextField r1 = new JTextField();

        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 80, 100, 20);
        addButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                r1.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numbers only.");
            }
        });
        frame.add(addButton);

        // JButton subButton = new JButton("Sub");
        // subButton.setBounds(120, 80, 100, 20);
        // subButton.addActionListener(e -> {
        //     try {
        //         int num1 = Integer.parseInt(t1.getText());
        //         int num2 = Integer.parseInt(t2.getText());
        //         int diff = num1 - num2;
        //         r1.setText(String.valueOf(diff));
        //     } catch (NumberFormatException ex) {
        //         JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numbers only.");
        //     }
        // });
        // frame.add(subButton);
        //
        

        JLabel result = new JLabel("Result:");
        result.setBounds(10, 120, 100, 20);
        frame.add(result);

        r1.setBounds(120, 120, 100, 20);
        frame.add(r1);

        frame.setSize(300, 250);
        frame.setVisible(true);
    }
}

