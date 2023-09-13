import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class PageLogin implements ActionListener  {
    JFrame fr;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2;
    JButton b1, b2;
    Statement st;

    PageLogin(JFrame fr, Statement st) {
        this.fr = fr;
        this.st = st;
        l1 = new JLabel("ABC Bank");
        l2 = new JLabel("Prayagraj");
        l3 = new JLabel("Username: ");
        l4 = new JLabel("Password: ");
        t1 = new JTextField("");
        t2 = new JTextField("");
        b1 = new JButton("New User?");
        b2 = new JButton("Login");
    }

    void showLayout() {
        fr.setTitle("Login");
        fr.setLayout(null);
        fr.setSize(500, 480);
        l1.setBounds(225, 30, 200, 50);
        l2.setBounds(225, 50, 200, 50);

        l3.setBounds(80, 140, 150, 40);
        t1.setBounds(260, 140, 150, 40);

        l4.setBounds(80, 210, 150, 40);
        t2.setBounds(260, 210, 150, 40);

        b1.setBounds(80, 300, 150, 40);
        b2.setBounds(260, 300, 150, 40);

        b1.addActionListener(this);
        b2.addActionListener(this);

        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.add(l4);
        fr.add(t1);
        fr.add(t2);
        fr.add(b1);
        fr.add(b2);

        fr.setVisible(true);
    }

    void hideLayout() {
        fr.remove(l1);
        fr.remove(l2);
        fr.remove(l3);
        fr.remove(l4);
        fr.remove(t1);
        fr.remove(t2);
        fr.remove(b1);
        fr.remove(b2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            hideLayout();
            PageSignUp su = new PageSignUp(fr, st);
            su.showLayout();
        }
        else if (ae.getSource() == b2) {

            String userName = t1.getText();
            String pass = t2.getText();

            try {
                ResultSet rs = st.executeQuery("select * from bank where username = '" + userName + "'");
                rs.next();
                boolean passIsCorrect = false;
                
                if (rs.getString("password").equals(pass)) {
                    passIsCorrect = true;
                }
                
                if (passIsCorrect) {
                    hideLayout();
                    ManageAccount ma = new ManageAccount(fr, st, userName);
                    ma.showLayout();
                }

            }
            catch (Exception e) {
                System.out.println(e);
            }  
            
            
        }
    }

    public static void main(String[] args){
        JFrame fr = new JFrame("");
        Statement st = null;
        PageLogin lg = new PageLogin(fr, st);
        lg.showLayout();
    }
}