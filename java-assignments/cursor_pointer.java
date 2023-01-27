/* 
   Name - Shah Saud Ahmad
   Class - TYCS Sem - 6
   Div - A
   Enrollment - E20110192000310095
   Subject - Java Applet Programming
   Aim - Cursor Pointer of Mouse


*/


import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;


public class Cursor_pointer extends Applet implements MouseMotionListener
{
    int a,b;
    
    @Override
    public void init()
    {
        addMouseMotionListener(this);
    }
    
    @Override
    public void mouseDragged(MouseEvent ev)
    {
        a=ev.getX();
        b=ev.getY();
        repaint();        
    }
    
    @Override
    public void mouseMoved(MouseEvent ev)
    {
        a=ev.getX();
        b=ev.getY();
        repaint();
    }
    
    @Override
    public void paint(Graphics g)
    {
        g.fillRect(a,b,10,10);
    }
}