import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Table Example");

        // Corrected String syntax
        String[] head = {"SN", "Name", "Phone", "Email"};
        String[][] data = {
            {"1", "Sulav Bikram Shrestha", "9823343434", "sulav@gmail.com"},
            {"2", "Sohan Achhami", "9823343344", "sohan@gmail.com"},
            {"3", "Prabhat K.C", "9823353434", "Prabhat@gmail.com"},
            {"4", "Bibek Bashyal", "98245443434", "bibek@gmail.com"},
        };

        // Create JTable and wrap it in JScrollPane
        JTable table = new JTable(data, head);
        JScrollPane scroll = new JScrollPane(table);

        // Add scroll pane to frame
        f.add(scroll);

        // Frame settings
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}


