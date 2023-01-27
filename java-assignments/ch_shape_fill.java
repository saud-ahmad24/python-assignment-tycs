/* 
   Name - Shah Saud Ahmad
   Class - TYCS Sem - 6
   Div - A
   Enrollment - E20110192000310095
   Subject - Java Applet Programming
   Aim -Tchange color using dropdown menu
*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   



public class assignment7 extends Applet implements ActionListener{

    Label l1;
    Button b1,b2,b3;
    JComboBox c1;
    ButtonGroup b;

    
    public void init() {
        
        b1 = new Button("Triangle");
        b1.addActionListener(this);
        add(b1);
        
        b2 = new Button("Rectangle");
        b2.addActionListener(this);
        add(b2);
        
        b3 = new Button("oval");
        b3.addActionListener(this);
        add(b3);
        
//        b = new ButtonGroup();
//        b.add(b1);
//        b.add(b2);
//        
        
        
        c1 = new JComboBox();
        c1.addItem("Red");        
        c1.addItem("Green");
        c1.addItem("Black");
        c1.addItem("Yellow");
        c1.addItem("Blue");
        c1.addItem("Pink");
        c1.addActionListener(this);
        add(c1);
        
        
        
    }

    
    public void actionPerformed(ActionEvent e) {
        
        Graphics g = getGraphics();
        
        if(e.getSource() == b1){
      
            g.drawRoundRect(100, 100, 200, 200, 200, 200);
        }
        
        if(e.getSource() == b2){
            
            g.drawRect(450, 100, 350, 200);

        }
        
        if(e.getSource() == b3){
            g.drawOval(900, 100, 100, 200);
        }
        
        
        if(e.getSource() == c1){
            
            if(c1.getSelectedItem() == "Red"){
                g.setColor(Color.RED);
                g.fillRect(450, 100, 350, 200);
                g.fillOval(900, 100, 100, 200);
                g.fillRoundRect(100, 100, 200, 200, 200, 200);
                
             
            }else if(c1.getSelectedItem() == "Green"){
                g.setColor(Color.GREEN);
                g.fillRect(450, 100, 350, 200);
                g.fillOval(900, 100, 100, 200);
                g.fillRoundRect(100, 100, 200, 200, 200, 200);
                
            }else if(c1.getSelectedItem() == "Black"){
                g.setColor(Color.BLACK);
                g.fillRect(450, 100, 350, 200);
                g.fillOval(900, 100, 100, 200);
                g.fillRoundRect(100, 100, 200, 200, 200, 200);
                
            }else if(c1.getSelectedItem() == "Yellow"){
                g.setColor(Color.YELLOW);
                g.fillRect(450, 100, 350, 200);
                g.fillOval(900, 100, 100, 200);
                g.fillRoundRect(100, 100, 200, 200, 200, 200);
                
            }else if(c1.getSelectedItem() == "Blue"){
                g.setColor(Color.BLUE);
                g.fillRect(450, 100, 350, 200);
                g.fillOval(900, 100, 100, 200);
                g.fillRoundRect(100, 100, 200, 200, 200, 200);
                
            }else if(c1.getSelectedItem() == "Pink"){
                g.setColor(Color.pink);
                g.fillRect(450, 100, 350, 200);
                g.fillOval(900, 100, 100, 200);
                g.fillRoundRect(100, 100, 200, 200, 200, 200);
                
            }  
        }
        
    }