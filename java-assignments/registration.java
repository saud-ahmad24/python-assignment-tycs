/* 
   Name - Shah Saud Ahmad
   Class - TYCS Sem - 6
   Div - A
   Enrollment - E20110192000310095
   Subject - Java Applet Programming
   Aim - Create Registration form for Student.


*/



import java.applet.*;
import java.awt.*;
import java.awt.event.*;



public class Registration_form extends Applet {

    Label lname, lemail, lpass, lpno, lgen, llang, lzip, labout;
    TextField tname, temail, tpass, tpno, tzip;
    TextArea tabout;
    Button regis;
    Checkbox male,female, others;
    Choice ch;
     
    public void init() {
        
        setLayout(new FlowLayout());
        
        lname = new Label("Name : ");
        tname = new TextField(20);
        lemail = new Label("E-Mail : ");
        temail = new TextField(20);
        lpass = new Label("Password : ");
        tpass = new TextField(20);
        lpno = new Label("Phone Number : ");
        tpno = new TextField(10);
        lgen = new Label("Gender : ");
        
        CheckboxGroup chkgrp = new CheckboxGroup();
        male = new Checkbox("Male", chkgrp, false);
        female = new Checkbox("Female", chkgrp, false);
        others = new Checkbox("Others", chkgrp, false);
        
        llang = new Label("Language");
        lzip = new Label("Zip Code : ");
        tzip = new TextField(6);
        labout = new Label("About : ");
        tabout = new TextArea(10, 50);
        
        ch = new Choice();
        ch.add("English");
        ch.add("Gujrati");
        ch.add("Hindi");
        
        regis = new Button("submit");
        
        add(lname);
        add(tname);
        add(lemail);
        add(temail);
        add(lpass);
        add(tpass);
        add(lpno);
        add(tpno);
        add(lgen);
        add(male);
        add(female);
        add(others);
        add(llang);
        add(ch);
        add(lzip);
        add(tzip);
        add(labout);
        add(tabout);
        add(regis);
        
    }

}