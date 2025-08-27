import java.awt.*;
import java.awt.event.*;

public class ActionEventExample extends Frame implements ActionListener {
    Button button;

    ActionEventExample() {
        button = new Button("Click Me");
        button.addActionListener(this);
        add(button);
        setSize(200, 100);
        setLayout(new FlowLayout());
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }   
        });
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    public static void main(String[] args) {
        new ActionEventExample();
    }
}
