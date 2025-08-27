import java.awt.*;
import java.awt.event.*;

public class EventHandlingAdpater {
    public static void main(String[] args) {
        Frame frame = new Frame("Event Handling Example");
        Button button = new Button("Click Me");
        Label label = new Label("Click the button to see the event in action");

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Button clicked at: " + e.getX() + ", " + e.getY());
                System.out.println("Button clicked at: " + e.getX() + ", " + e.getY());
            }
        });

        
        frame.add(button);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
}
}

