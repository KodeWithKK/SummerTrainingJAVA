import java.awt.*;
import java.awt.event.*;

class Application implements ActionListener {
    Frame f;
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4, b5;

    Application() {
        f = new Frame("App - Calculator");
        l1 = new Label("First Number:");
        l2 = new Label("Second Number:");
        l3 = new Label("Result:");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("%");
    }

    void layoutMgr() {
        f.setLayout(null);
        l1.setBounds(80, 50, 100, 40);
        t1.setBounds(200, 50, 100, 40);
        l2.setBounds(80, 110, 100, 40);
        t2.setBounds(200, 110, 100, 40);
        l3.setBounds(80, 170, 100, 40);
        t3.setBounds(200, 170, 100, 40);
        b1.setBounds(60, 230, 40, 40);
        b2.setBounds(120, 230, 40, 40);
        b3.setBounds(180, 230, 40, 40);
        b4.setBounds(240, 230, 40, 40);
        b5.setBounds(300, 230, 40, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(400, 400);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        if (ae.getSource() == b1) {
            t3.setText(Integer.toString(num1 + num2));
        }
        else if (ae.getSource() == b2) {
            t3.setText(Integer.toString(num1 - num2));
        }
        else if (ae.getSource() == b3) {
            t3.setText(Integer.toString(num1 * num2));
        }
        else if (ae.getSource() == b4) {
            t3.setText(Integer.toString(num1 / num2));
        }
        else if (ae.getSource() == b5) {
            t3.setText(Integer.toString(num1 % num2));
        }
    }
}

class P06_Assignment05 {

    public static void main(String[] args){
        
        Application obj = new Application();
        obj.layoutMgr();
    }
}