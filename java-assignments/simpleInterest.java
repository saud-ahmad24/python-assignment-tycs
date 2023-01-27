/* 
   Name - Shah Saud Ahmad
   Class - TYCS Sem - 6
   Div - A
   Enrollment - E20110192000310095
   Subject - Java Applet Programming
   Aim - Design the Applet page to calculate Simple 
         interest and Compound interest.

*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;



public class Simple_interest extends Applet implements ActionListener{

    Label l1,l2,l3;
    TextField tf1,tf2,tf3;
    Button btn;
    
    public void init() {
        
        setLayout(new FlowLayout());
        l1 = new Label("Principal Amount:");
        tf1= new TextField(10);
        add(l1); 
        add(tf1);
        
        l2 = new Label("Number of years:");
        tf2= new TextField(10);
        add(l2); 
        add(tf2);
        
        l3 = new Label("Rate of Interest:");
        tf3= new TextField(10);
        add(l3); 
        add(tf3);
        
        btn = new Button("Calculate");
        add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        Graphics g = getGraphics();
        if(e.getSource()==btn)
        {
           int x = Integer.parseInt(tf1.getText());
           int y = Integer.parseInt(tf2.getText());
           float z = Float.parseFloat(tf3.getText());
           double a = (x*y*z)/100;
           
           g.drawString("Simple Interest:", 550,100);
           g.drawString(a+"",660,100);
        }
        
    }
         

    
}