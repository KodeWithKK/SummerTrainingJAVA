import java.awt.*;

class Win extends Frame {
    Label l1, l2, l3, l4;
    TextField t1, t2, t3;
    Button b1;
    GridLayout grid;

    // ----- GRID LAYOUT ----- //
    public Win() {
        setTitle("Working with AWT Components");
        setSize(400, 400);

        // rows | cols
        grid = new GridLayout(4, 2);
        setLayout(grid);

        l1 = new Label("First Number");
        t1 = new TextField();
        l2 = new Label("Second Number");
        t2 = new TextField();
        l3 = new Label("Sum");
        t3 = new TextField();
        l4 = new Label(); // empty label
        b1 = new Button("Sum");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(b1);

        setVisible(true);
    }
}

class P08_LayoutManager {
    
    public static void main(String[] args){
        Win w = new Win();
    }

}