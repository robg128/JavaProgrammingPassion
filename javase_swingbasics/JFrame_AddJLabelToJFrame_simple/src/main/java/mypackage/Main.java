package mypackage;

import javax.swing.*;

public class Main {
    /**
     * Create the GUI and show it.  
     */
    private static void createAndShowGUI() {
        
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setSize(200,4200);
        
        // Exit the application when it is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add the ubiquitous "Hello World" label.
        JLabel label1 = new JLabel("  Hello World  ");
        frame.add(label1);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}



