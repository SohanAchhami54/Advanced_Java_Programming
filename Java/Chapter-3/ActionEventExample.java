import java.awt.*;
import java.awt.event.*;

public class ActionEventExample {
    public static void main(String[] args) {
        Frame frame = new Frame("ActionEvent Demo");
        Button button = new Button("Click Me");

        button.addActionListener(e -> System.out.println("Button clicked!"));

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
        frame.dispose();
    }
});

    }
}