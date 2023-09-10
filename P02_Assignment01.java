import java.awt.event.*;
import java.awt.*;

class Application implements ActionListener{
    Frame f;
    Label l;
    Button b1;

    Application() {
        f = new Frame();
        l = new Label("Welcome");
        b1 = new Button("Change");
    }

    void layoutMgr() {
        f.setLayout(null);
        l.setBounds(170, 50, 400, 40);
        b1.setBounds(150, 150, 100, 40);
        b1.addActionListener(this);
        f.add(l);
        f.add(b1);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            l.setText("DK United");
        }
    }
}


class P02_Assignment01 {
    public static void main(String[] args){
        
        Application obj = new Application();
        obj.layoutMgr();
    }
}