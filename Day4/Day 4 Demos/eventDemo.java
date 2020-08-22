import java.awt.*;
import java.awt.event.*;

class eventDemo
{
eventDemo()
{
Frame f=new Frame("My Frame");
Button b=new Button("Button1");
//b.addActionListener(new handler());
b.addMouseListener(new handler());
f.setSize(400,500);
f.setVisible(true);
f.setLayout(new FlowLayout());
f.add(b);
}
public static void main(String[] args)
{
eventDemo e=new eventDemo();
}
}

class handler implements ActionListener,MouseListener
{
public void actionPerformed(ActionEvent aa)
{
//System.out.println("Hi u have entered!!!");
}
public void mousePressed(MouseEvent mm)
{}
public void mouseClicked(MouseEvent mm)
{}
public void mouseReleased(MouseEvent mm)
{}
public void mouseEntered(MouseEvent mm)
{
System.out.println("Mouse Entered!!!");
}
public void mouseExited(MouseEvent mm)
{
System.out.println("Mouse Exited!!!");
}
}