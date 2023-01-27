/* 
   Name - Shah Saud Ahmad
   Class - TYCS Sem - 6
   Div - A
   Enrollment - E20110192000310095
   Subject - Java Applet Programming
   Aim -List Queue

*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class assignment8 extends Applet implements ActionListener{

    Label l1;
    TextField t;
    List list;
    Button b1,b2;
    
    
    public void init() {
        
        l1 = new Label("Enter : ");
        add(l1);
        
        t = new TextField(20);
        add(t);
        
        list = new List();
        list.addActionListener(this);
        
        b1 = new Button("Insert");
        b1.addActionListener(this);
        add(b1);
        add(list);
        
        b2 = new Button("Delete");
        b2.addActionListener(this);
        add(b2);
        
    }


    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == b1 ){
            
            list.add(t.getText());
            t.setText("");
            
        }
        
        if(e.getSource() == b2){
            for(int i=0; i<1; i--){
                list.remove(i);

            }
        }
        
    }
}