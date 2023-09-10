import java.awt.*;

class Win extends Frame {
    Label l1, l2, l3;
    Choice c1;
    List li1;
    TextArea ta1;

    public Win() {
        setTitle("Working with AWT Components");
        setSize(600, 400);
        setLayout(new FlowLayout());

        l1 = new Label("Select City");
        c1 = new Choice();
        c1.addItem("Prayagraj");
        c1.addItem("Lucknow");
        c1.addItem("Delhi");
        c1.addItem("Agra");

        // It Views 3 items & multi-select enabled
        l2 = new Label("Select Program");
        li1 = new List(3, true); 
        li1.addItem("B.Tech");
        li1.addItem("MCA");
        li1.addItem("M.Tech");
        li1.addItem("PHD");

        l3 = new Label("Comment");
        ta1 = new TextArea(20, 10);

        add(l1);
        add(c1);
        add(l2);
        add(li1);
        add(l3);
        add(ta1);

        setVisible(true);
    }
}

class P06_ChoiceListAndTextArea {

    public static void main(String[] args){
        
        Win w = new Win();
    }
}