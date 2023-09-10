import java.awt.*;

class Win extends Frame {
    Label l1, l2, l3, l4, l5;
    BorderLayout border;

    // ----- BORDER LAYOUT (DEFAULT) ----- //
    public Win() {
        setTitle("Working with AWT Components");
        setSize(400, 400);

        // rows | cols
        border = new BorderLayout();
        setLayout(border);

        l1 = new Label("United College", Label.CENTER);
        l1.setBackground(Color.red);
        l1.setForeground(Color.white);

        l2 = new Label("Naini, Prayagraj");
        l2.setBackground(Color.yellow);
        l2.setForeground(Color.blue);

        l3 = new Label("East");
        l3.setBackground(Color.green);
        l3.setForeground(Color.white);

        l4 = new Label("West");
        l4.setBackground(Color.black);
        l4.setForeground(Color.white);

        l5 = new Label("Center");
        l5.setBackground(Color.pink);
        l5.setForeground(Color.black);

        add(l1, "North");
        add(l2, "South");
        add(l3, "East");
        add(l4, "West");
        add(l5, "Center");

        setVisible(true);
    }
}

class P09_LayoutManager {
    
    public static void main(String[] args){
        Win w = new Win();
    }

}