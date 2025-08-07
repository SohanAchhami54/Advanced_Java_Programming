// import java.awt.event.*;
// import javax.swing.*;

// public class MouseAdapterExample {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Mouse Example");
//         frame.setSize(300, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         JLabel label = new JLabel("Click anywhere", SwingConstants.CENTER);
//         frame.add(label);

//         frame.addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                 label.setText("Mouse clicked!");
//             }
//         });

//         frame.setVisible(true);
//     }
// }
import java.awt.*;
import java.awt.event.*;

public class SimpleMouseClick extends Frame {

    public SimpleMouseClick() {
        setSize(300, 200);
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked");
            }
        });
    }

    public static void main(String[] args) {
        new SimpleMouseClick();
    }
}

