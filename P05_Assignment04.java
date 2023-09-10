import java.awt.*;
import java.awt.event.*;

class Application implements ActionListener {
    Frame f;
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;

    Application() {
        f = new Frame("App - Concatenate");
        l1 = new Label("First Name");
        l2 = new Label("Second Name");
        l3 = new Label("Full Name");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b1 = new Button("Concatenate");
        b2 = new Button("Clear");
    }

    void layoutMgr() {
        f.setLayout(null);
        l1.setBounds(80, 50, 100, 40);
        t1.setBounds(200, 50, 100, 40);
        l2.setBounds(80, 110, 100, 40);
        t2.setBounds(200, 110, 100, 40);
        l3.setBounds(80, 170, 100, 40);
        t3.setBounds(200, 170, 100, 40);
        b1.setBounds(80, 230, 100, 40);
        b2.setBounds(200, 230, 100, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(b2);

        f.setSize(400, 400);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            t3.setText(t1.getText() + " " + t2.getText());
        }
        else if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
}

class P05_Assignment04 {

    public static void main(String[] args){
        
        Application obj = new Application();
        obj.layoutMgr();
    }
}