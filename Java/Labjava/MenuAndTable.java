import javax.swing.*;

public class MenuAndTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuAndTable");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Menu");
        JMenu subMenu = new JMenu("Submenu");
        JMenuItem menuItem1 = new JMenuItem("Item 1");
        JMenuItem menuItem2 = new JMenuItem("Item 2");
        JMenuItem subMenuItem1 = new JMenuItem("Sub Item 1");
        JMenuItem subMenuItem2 = new JMenuItem("Sub Item 2");

        fileMenu.add(menuItem1);
        fileMenu.add(menuItem2);
        subMenu.add(subMenuItem1);
        subMenu.add(subMenuItem2);
        fileMenu.add(subMenu);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        String columnNames[] = {"Column 1", "Column 2", "Column 3"};
        Object data[][] = {
            {"Data 1", "Data 2", "Data 3"},
            {"Data 4", "Data 5", "Data 6"},
            {"Data 7", "Data 8", "Data 9"}
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setBounds(30, 50, 200, 100);
        scrollPane.setBounds(30, 50, 200, 100);
        frame.add(scrollPane);
        frame.setSize(500, 500);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

