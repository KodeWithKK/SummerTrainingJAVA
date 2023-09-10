import java.awt.*;

class Win extends Frame {
    Button b1, b2, b3;
    FlowLayout flow;

    // ----- FLOWLAYOUT ----- //
    public Win() {
        setTitle("Working with AWT Components");
        setSize(400, 400);

        flow = new FlowLayout(FlowLayout.CENTER);
        // flow = new FlowLayout(FlowLayout.LEFT);
        // flow = new FlowLayout(FlowLayout.RIGHT);
        setLayout(flow);

        b1 = new Button("First Button");
        b2 = new Button("Second Button");
        b3 = new Button("Third Button");

        add(b1);
        add(b2);
        add(b3);

        setVisible(true);
    }
}

class P07_LayoutManager {
    
    public static void main(String[] args){
        Win w = new Win();
    }

}