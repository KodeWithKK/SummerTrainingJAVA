import java.awt.*;
import java.awt.event.*;

public class P02_CreatingFrameM2{

    public P02_CreatingFrameM2() {
        Frame f = new Frame("Hello First GUI");

        f.setSize(400, 400);
        f.setVisible(true);

        // Adding close button functionality
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args){
        new P02_CreatingFrameM2();
    }
}