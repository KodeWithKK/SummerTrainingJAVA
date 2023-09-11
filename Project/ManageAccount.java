import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ManageAccount {
    JLabel l1, l2;
    JFrame frm;
    JButton b1, b2, b3, b4, b5;

    ManageAccount() {
        frm = new JFrame("Manage Account");
        l1 = new JLabel("ABC Bank");
        l2 = new JLabel("Prayagraj");
        b1 = new JButton("Check Profile");
        b2 = new JButton("Deposit Money");
        b3 = new JButton("Withdraw Money");
        b4 = new JButton("Check Balance");
        b5 = new JButton("View Transactions");
    }

    void layoutMgr() {
        frm.setLayout(null);
        frm.setSize(400, 600);
        l1.setBounds(170, 30, 200, 50);
        l2.setBounds(170, 50, 200, 50);

        b1.setBounds(100, 120, 200, 50);
        b2.setBounds(100, 190, 200, 50);
        b3.setBounds(100, 260, 200, 50);
        b4.setBounds(100, 330, 200, 50);
        b5.setBounds(100, 400, 200, 50);

        frm.add(l1);
        frm.add(l2);
        frm.add(b1);
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);

        frm.setVisible(true);
    }

    public static void main(String[] args){
        ManageAccount ma = new ManageAccount();
        ma.layoutMgr();
    }
}