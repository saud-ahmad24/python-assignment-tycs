/* 
   Name - Shah Saud Ahmad
   Class - TYCS Sem - 6
   Div - A
   Enrollment - E20110192000310095
   Subject - Java Applet Programming
   Aim -Swastik draw
*/

package applet_95;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author srki-035
 */
public class applet_first_assgn extends Applet {

    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g) {
//    int a=20;
//    int b=30;
//    int c=a+b;
        g.drawLine(50, 50, 50, 100);
        g.drawLine(50, 100, 150, 100);
        g.drawLine(100, 150, 100, 50);
        g.drawLine(100, 50, 150, 50);
        g.drawLine(150, 100, 150, 150);
        g.drawLine(100, 150, 50, 150);
        
        
//        g.drawLine(200, 200, 200, 400);
//        g.drawLine(50, 100, 150, 100);

 

    }
}