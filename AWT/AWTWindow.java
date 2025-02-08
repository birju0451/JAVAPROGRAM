package AWT;

import java.awt.*;
import java.awt.event.*;

public class AWTWindow extends Frame {
    AWTWindow() {
        // Set window title
        setTitle("My First AWT Window");

        // Set window size
        setSize(400, 300);

        // Set layout
        setLayout(new FlowLayout());

        // Add a label
        Label label = new Label("Welcome to AWT!");
        add(label);

        // Window closing event handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the window
            }
        });

        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTWindow(); // Create and show the window
    }
}
