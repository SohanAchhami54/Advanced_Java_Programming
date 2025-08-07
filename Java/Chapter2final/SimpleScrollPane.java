import javax.swing.*;

public class SimpleScrollPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ScrollPane Example");
        JTextArea textArea = new JTextArea(5, 20);

        // Add lots of text to force scrollbar appearance
        for (int i = 1; i <= 20; i++) {
            textArea.append("This is line " + i + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
