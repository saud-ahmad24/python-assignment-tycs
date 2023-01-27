/* 
   Name - Shah Saud Ahmad
   Class - TYCS Sem - 6
   Div - A
   Enrollment - E20110192000310095
   Subject - Java Applet Programming
   Aim - Write an applet which has three radio buttons, 
         on click of any radio button perform. Rectangle,
         Oval, Triangle


*/


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JRadioButton.*;


public class Shape_rbtn extends Applet implements ItemListener{
    
    Button btn;
    CheckboxGroup Chkbx1;
    Checkbox bx1,bx2,bx3;
    

    @Override
    public void init() 
    {
       Chkbx1 = new CheckboxGroup();
       bx1 = new Checkbox("Triangle",Chkbx1,false);
       bx2 = new Checkbox("Rectangle",Chkbx1,false);
       bx3 = new Checkbox("Oval",Chkbx1,false);
       
       add(bx1);
       add(bx2);
       add(bx3);
       
       bx1.addItemListener(this);
       bx2.addItemListener(this);
       bx3.addItemListener(this);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }
    
    public void paint(Graphics g)
            
    {
        
        g.drawString("Click above to draw shapes", 560, 50);
        
        if(bx1.getState() == true)
        {
            g.drawLine(177,141,177,361);
            g.drawLine(177,141,438,361);
            g.drawLine(177,361,438,361);
        }
        
        else if(bx2.getState() == true)
        {
            g.drawRect(570, 200, 200, 200);
            
        }
        
        else if(bx3.getState()==true){
            g.drawOval(570,200,150,250);
       }
        
    }

   
}