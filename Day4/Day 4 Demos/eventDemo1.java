import java.awt.*;
import java.awt.event.*;

class eventDemo1
{
eventDemo1()
{
Frame f=new Frame("My Frame");
Button b=new Button("Button1");
b.addMouseMotionListener(new handler());
f.setSize(400,500);
f.setVisible(true);
f.setLayout(new FlowLayout());
f.add(b);
}
public static void main(String[] args)
{
eventDemo1 e=new eventDemo1();
}
}

class handler implements ActionListener,MouseMotionListener
{
public void actionPerformed(ActionEvent aa)
{
}
public void mouseMoved(MouseEvent mm)
{
System.out.println("Mouse Moved!!!");
}
public void mouseDragged(MouseEvent mm)
{
System.out.println("Mouse Dragged!!!");
}
}