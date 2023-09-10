import java.awt.*;
import java.awt.event.*;

class Application implements ActionListener {
    Frame f;
    Label l1, l2;
    TextField t1, t2;
    Button b1, b2;

    Application() {
        f = new Frame("App - Copy Text");
        l1 = new Label("String 1");
        l2 = new Label("String 2");
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("Copy Text");
        b2 = new Button("Clear");
    }

    void layoutMgr() {
        f.setLayout(null);
        l1.setBounds(80, 50, 100, 40);
        t1.setBounds(200, 50, 100, 40);
        l2.setBounds(80, 110, 100, 40);
        t2.setBounds(200, 110, 100, 40);
        b1.setBounds(80, 170, 100, 40);
        b2.setBounds(200, 170, 100, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);

        f.setSize(400, 400);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            t2.setText(t1.getText());
        }
        else if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
        }
    }
}

class P04_Assignment03 {

    public static void main(String[] args){
        
        Application obj = new Application();
        obj.layoutMgr();
    }
}