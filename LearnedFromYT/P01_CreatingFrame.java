import java.awt.*;

public class P01_CreatingFrame extends Frame {

    public P01_CreatingFrame() {
        setSize(400, 400);
        setVisible(true);
        setTitle("My GUI");
    }

    public static void main(String[] args){
        new P01_CreatingFrame();
    }
}