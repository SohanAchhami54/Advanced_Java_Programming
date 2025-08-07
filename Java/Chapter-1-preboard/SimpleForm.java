import java.awt.*;
import java.awt.event.*;

public class SimpleForm extends Frame {

    TextField nameField, passwordField;
    Checkbox hobby1, hobby2, hobby3;
    CheckboxGroup genderGroup;
    Checkbox male, female;
    Button submit;

    public SimpleForm() {
        setTitle("Simple Form");
        setSize(400, 300);
        setLayout(null); // Use no layout manager for simplicity

        // Name
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 60, 20);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(120, 50, 150, 20);
        add(nameField);

        // Password
        Label passLabel = new Label("Password:");
        passLabel.setBounds(50, 80, 60, 20);
        add(passLabel);

        passwordField = new TextField();
        passwordField.setEchoChar('*');
        passwordField.setBounds(120, 80, 150, 20);
        add(passwordField);

        // Hobbies
        Label hobbyLabel = new Label("Hobbies:");
        hobbyLabel.setBounds(50, 110, 60, 20);
        add(hobbyLabel);

        hobby1 = new Checkbox("Reading");
        hobby1.setBounds(120, 110, 70, 20);
        add(hobby1);

        hobby2 = new Checkbox("Gaming");
        hobby2.setBounds(200, 110, 70, 20);
        add(hobby2);

        hobby3 = new Checkbox("Traveling");
        hobby3.setBounds(280, 110, 80, 20);
        add(hobby3);

        // Gender
        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 140, 60, 20);
        add(genderLabel);

        genderGroup = new CheckboxGroup();

        male = new Checkbox("Male", genderGroup, false);
        male.setBounds(120, 140, 60, 20);
        add(male);

        female = new Checkbox("Female", genderGroup, false);
        female.setBounds(190, 140, 70, 20);
        add(female);

        // Submit Button
        submit = new Button("Submit");
        submit.setBounds(150, 180, 80, 30);
        add(submit);

        // Close Window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the window
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleForm();
    }
}
