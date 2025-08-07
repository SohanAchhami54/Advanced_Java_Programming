import java.awt.*;
import javax.swing.*;

public class Form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Form");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        // Name
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);
        frame.add(nameLabel);
        frame.add(nameField);

        // Password
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        frame.add(passLabel);
        frame.add(passField);

        // Hobbies
        JLabel hobbyLabel = new JLabel("Hobbies:");
        JCheckBox cb1 = new JCheckBox("Reading");
        JCheckBox cb2 = new JCheckBox("Gaming");
        JCheckBox cb3 = new JCheckBox("Traveling");
        frame.add(hobbyLabel);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);

        // Submit Button
        JButton submit = new JButton("Submit");
        frame.add(submit);

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
