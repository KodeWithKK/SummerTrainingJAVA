import java.awt.*;

class Win extends Frame {
    Label l1;
    TextField t1;
    Button b1;

    public Win() {
        setTitle("Working With AWT Components");
        setSize(600, 400);
        setLayout(new FlowLayout());
        l1 = new Label("Enter Name");
        t1 = new TextField(30);
        b1 = new Button("Click Me");
        add(l1);
        add(t1);
        add(b1);
        setVisible(true);
    }
}

class P04_WorkingWithComponents {

    public static void main(String[] args){
        
        Win w = new Win();
    }
}