/* 
   Name - Shah Saud Ahmad
   Class - TYCS Sem - 6
   Div - A
   Enrollment - E20110192000310095
   Subject - Java Applet Programming
   Aim -Write a program to choose programming language

*/

package applet_95;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class languagedropdown extends Applet implements ActionListener {

    JComboBox m = new JComboBox();
    JComboBox n = new JComboBox();
    Label l1, l2;

    public void init() {

        l1 = new Label("Languages :");
        add(l1);

        m.addItem("");
        m.addItem("JAVA");
        m.addItem("Android");
        m.addItem("Python");
        m.addItem("PHP");
        m.addItem(".NET");
        m.addItem("RDBMS");
        m.addActionListener(this);
        add(m);

        l2 = new Label("Students :");
        add(l2);

        n.addItem("");
        n.addItem("Shyam");
        n.addItem("Chandan");
        n.addItem("Deepak");
        n.addItem("Saud");
        n.addItem("Shreyansh");
        n.addItem("Akash");
        n.addActionListener(this);
        add(n);

    }

    // TODO overwrite start(), stop() and destroy() methods
    public void actionPerformed(ActionEvent e) {

        Graphics g = getGraphics();

        g.drawString(String.valueOf(m.getSelectedItem() + " is Enrolled by " + String.valueOf(n.getSelectedItem())), 200, 400);

    }
}