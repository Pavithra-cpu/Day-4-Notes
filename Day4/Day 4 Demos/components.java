import java.awt.*;

class components
{
components()
{
Frame f=new Frame("Untitled-Notepad");
MenuBar mb=new MenuBar();

Menu m1=new Menu("File");
Menu m2=new Menu("Edit");
Menu m3=new Menu("Format");

MenuItem mi1=new MenuItem("New");
MenuItem mi2=new MenuItem("Open");
MenuItem mi3=new MenuItem("Save");
MenuItem mi4=new MenuItem("Save-as");

f.setSize(400,500);
f.setVisible(true);
f.setMenuBar(mb);

mb.add(m1);
mb.add(m2);
mb.add(m3);

m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
m1.addSeparator();
m1.add(mi4);

}
public static void main(String[] args)
{
components c=new components();
}
}