//1.class and import statement
package GUI;
import javax.swing.JFrame;
import javax.swing.JButton;
//  You define a package GUI to organize your class, which is useful if you have multiple related classes.
// You import JFrame and JButton from the Swing library to use graphical components like windows (frames) and buttons in your application.

//2.class Defination:
public class GUIdemo {
    // class variables
    private JFrame frame;
    private JButton button ;
    private int width;
    private int height;
// GUIdemo is your main class for creating the GUI.
// You define frame as a JFrame, which represents the main window.
// button is a JButton that will be added to frame.
// width and height are integer variables to store the dimensions of the JFrame.

//3.constractor
    public GUIdemo(int w, int h) {
        this.width = w;
        this.height = h;
        frame = new JFrame();
        button = new JButton("click me");
    }
    // The constructor GUIdemo(int w, int h) initializes the GUI's width and height by taking parameters w and h.
    // frame = new JFrame(); creates a new JFrame object (the window).
    // button = new JButton("click me"); creates a new button with the text “click me.”

    //4.methos setUPGUI:
    public void setUPGUI() {
        frame.setSize(width, height);
        frame.setTitle("GUI Demo");
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   }
//     setSize(width, height);: Sets the frame’s width and height based on values passed in the constructor.
// setTitle("GUI Demo");: Sets the title of the JFrame to "GUI Demo."
// add(button);: Adds button to the frame, allowing it to be displayed inside the window.
// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);: Ensures the application will exit when the frame is closed.
// setVisible(true);: Makes the frame visible.

    public static void main(String[] args) {
        GUIdemo gd = new GUIdemo(800, 600);
        gd.setUPGUI();
    }
}

