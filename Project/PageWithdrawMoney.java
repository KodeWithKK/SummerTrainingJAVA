import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PageWithdrawMoney {
    JLabel l1, l2, l3;
    JFrame frm;
    JTextField t1;
    JButton b1, b2;

    PageWithdrawMoney() {
        frm = new JFrame("Withdraw Money");
        l1 = new JLabel("ABC Bank");
        l2 = new JLabel("Prayagraj");
        l3 = new JLabel("Enter Amount: ");
        t1 = new JTextField("");
        b1 = new JButton("Withdraw Money");
        b2 = new JButton("Go Back");
    }

    void layoutMgr() {
        frm.setLayout(null);
        frm.setSize(500, 400);
        l1.setBounds(225, 30, 200, 50);
        l2.setBounds(225, 50, 200, 50);

        l3.setBounds(80, 140, 150, 40);
        t1.setBounds(260, 140, 150, 40);

        b1.setBounds(80, 210, 150, 40);
        b2.setBounds(260, 210, 150, 40);

        frm.add(l1);
        frm.add(l2);
        frm.add(l3);
        frm.add(t1);
        frm.add(b1);
        frm.add(b2);

        frm.setVisible(true);
    }

    public static void main(String[] args){
        PageWithdrawMoney dm = new PageWithdrawMoney();
        dm.layoutMgr();
    }
}