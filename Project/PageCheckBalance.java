import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PageCheckBalance {
    JLabel l1, l2, l3;
    JFrame frm;
    JButton b1;

    PageCheckBalance() {
        frm = new JFrame("Check Balance");
        l1 = new JLabel("ABC Bank");
        l2 = new JLabel("Prayagraj");
        l3 = new JLabel("Your Balance is ₹9,130");
        b1 = new JButton("Go Back");
    }

    void layoutMgr() {
        frm.setLayout(null);
        frm.setSize(400, 400);
        l1.setBounds(175, 30, 200, 50);
        l2.setBounds(175, 50, 200, 50);
        l3.setBounds(135, 140, 400, 40);
        b1.setBounds(125, 210, 150, 40);

        frm.add(l1);
        frm.add(l2);
        frm.add(l3);
        frm.add(b1);

        frm.setVisible(true);
    }

    public static void main(String[] args){
        PageCheckBalance cb = new PageCheckBalance();
        cb.layoutMgr();
    }
}