import java.awt.event.*;
import java.awt.*;

class Application implements ActionListener {
    Frame f;
    Label l1, l2;
    Button b1;

    Application() {
        f = new Frame();
        l1 = new Label("Krishna");
        l2 = new Label("Radhe");
        b1 = new Button("Swap");
    }

    void layoutMgr() {
        f.setLayout(null);
        l1.setBounds(80, 50, 100, 40);
        l2.setBounds(280, 50, 100, 40);
        b1.setBounds(150, 150, 100, 40);
        b1.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(b1);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            String s1 = l1.getText();
            l1.setText(l2.getText());
            l2.setText(s1);
        }
    }
}

class P03_Assignment02 {
    public static void main(String[] args){

        Application obj = new Application();
        obj.layoutMgr();
        
    }
}
