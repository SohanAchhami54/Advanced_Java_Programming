// import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class MenuSwing{
    public static void main(String[] args){
        JFrame f=new JFrame("Menu Example");
        JMenuBar bar=new JMenuBar();
        JMenu filemenu=new JMenu("File"); 

        JMenuItem open1=new JMenuItem("Open");
        JMenuItem new1=new JMenuItem("New");
        JMenuItem close1=new JMenuItem("Close");
        JMenuItem exit1=new JMenuItem("Exit");

        filemenu.add(open1);
        filemenu.add(new1);
        filemenu.add(close1);
        filemenu.add(exit1);
        
        
        
        bar.add(filemenu);
        f.setJMenuBar(bar);
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        f.setVisible(true);
    }
}