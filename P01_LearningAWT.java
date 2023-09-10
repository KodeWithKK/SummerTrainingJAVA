import java.awt.event.*;
import java.awt.*;

class Application implements ActionListener {
    // Instances not declaration
    Frame f;
    Button b1, b2;
    
    // constructor - called when obj is created
    Application () {
        f = new Frame();
        b1 = new Button("Hello");
        b2 = new Button("Bye");
    }

    void layoutMgr() {
        f.setLayout(null);
        b1.setBounds(20, 50, 100, 40);
        b2.setBounds(150, 50, 100, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.add(b1);
        f.add(b2);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    // ----- NOTE 01 ----- //

    // --> The line f.setLayout(null); is setting the layout of the Frame object to null. 
    // --> This means that the Frame object will not use any layout manager to arrange the components. Instead, you will need to explicitly specify the position and size of each component.

    // ----- NOTE 02 ----- //

    // --> The keyword this in the line b1.addActionListener(this); refers to the current object, in this case the Application object.
    // --> This means that the Application object is registering itself as an ActionListener for the Button object b1.
    // --> This means that the Application object will be notified when the user clicks the Button object b1.

    
    // this is called when user clicks one of the button
    public void actionPerformed (ActionEvent ae) {
        if (ae.getSource() == b1) {
            System.out.println("Hello Button is Clicked");
        }
        else if (ae.getSource() == b2) {
            System.out.println("Bye Button is Clicked");
        }
    }

}

class P01_LearningAWT {
    public static void main(String arr[]) {

        Application obj = new Application();
        obj.layoutMgr();
    }
}