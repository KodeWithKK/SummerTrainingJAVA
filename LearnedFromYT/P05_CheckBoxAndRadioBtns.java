import java.awt.*;

class Win extends Frame {
    Checkbox cb1, cb2, cb3, cb4, cb5;
    CheckboxGroup cbg;
    Label l1, l2;

    public Win() {
        setTitle("Working with AWT Components");
        setSize(400, 400);
        setLayout(new FlowLayout());

        l1 = new Label("Hobbies");
        cb1 = new Checkbox("Cricket", true);
        cb2 = new Checkbox("Movies");
        cb3 = new Checkbox("Reading");
        l2 = new Label("Gender");
        cbg = new CheckboxGroup();
        cb4 = new Checkbox("Male", cbg, true);
        cb5 = new Checkbox("Female", cbg, false);

        add(l1);
        add(cb1);
        add(cb2);
        add(cb3);
        add(l2);
        add(cb4);
        add(cb5);
        setVisible(true);

    }
}

class P05_CheckBoxAndRadioBtns {

    public static void main(String[] args){
        
        Win w = new Win();
    }
}