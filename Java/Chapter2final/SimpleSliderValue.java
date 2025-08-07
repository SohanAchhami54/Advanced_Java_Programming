import javax.swing.*;

public class SimpleSliderValue {
    public static void main(String[] args) {
        JFrame f = new JFrame("Slider");
        JSlider s = new JSlider(1, 10, 1);
        JLabel l = new JLabel("Value: 1");

        s.addChangeListener(e -> l.setText("Value: " + s.getValue()));

        f.setLayout(new java.awt.FlowLayout());
        f.add(s);
        f.add(l);

        f.setSize(200, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
