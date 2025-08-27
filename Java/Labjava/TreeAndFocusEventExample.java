import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeAndFocusEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree Item and Focus Event Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);

        // Add a TreeSelectionListener to handle tree item events
        tree.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
            if (selectedNode != null) {
                JOptionPane.showMessageDialog(frame, "Selected: " + selectedNode.getUserObject(), "Tree Item Event", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Create a JTextField to demonstrate focus events
        JTextField textField = new JTextField("Click here to focus");
        textField.setPreferredSize(new Dimension(200, 30));

        // Add a FocusListener to handle focus events
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField.setBackground(Color.YELLOW);
                System.out.println("Focus gained on text field.");
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField.setBackground(Color.WHITE);
                System.out.println("Focus lost on text field.");
            }
        });

        // Add components to the frame
        frame.setLayout(new FlowLayout());
        frame.add(new JScrollPane(tree));
        frame.add(textField);

        // Make the frame visible
        frame.setVisible(true);
    }
}
