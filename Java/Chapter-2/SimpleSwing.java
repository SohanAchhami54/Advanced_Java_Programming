import javax.swing.*;
public class SimpleSwing{
  public static void main(String[] args){
    JFrame f=new JFrame();
    JButton b=new JButton("Click me baby");
    b.setBounds(140,100, 150,50);
    f.add(b);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
}