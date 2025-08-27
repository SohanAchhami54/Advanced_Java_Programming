import javax.swing.*;

public class SimpleSlider {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Slider Example");
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,20);  // Default slider from 0 to 100

        frame.add(slider);               // Add slider to frame
        frame.setSize(300, 100);         // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);          // Show the frame
    }
}
