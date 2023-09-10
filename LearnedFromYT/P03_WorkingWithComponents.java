import java.awt.*;
import java.awt.event.*;

public class P03_WorkingWithComponents{

    public P03_WorkingWithComponents() {
        Frame f = new Frame("My GUI");
        Button btn = new Button("Click me");
        Label l = new Label("Hello World");
        TextField textField = new TextField();

        l.setBounds(160, 50, 150, 40);
        btn.setBounds(140, 100, 100, 40);
        textField.setBounds(140, 160, 100, 40);    

        btn.setBackground(Color.red);
        btn.setBackground(Color.white);

        f.add(l);
        f.add(btn);
        f.add(textField);

        f.setSize(400, 400);
        f.setLayout(null); // removing default layout
        f.setVisible(true);

        // Adding close button functionality
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args){
        new P03_WorkingWi thComponents();
    }
}