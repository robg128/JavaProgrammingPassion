package mypackage;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Main {
    
    JFrame jFrame;
    JPanel jPanel;
    JTextField textField;
    JButton button;
    Container contentPane;
    
    public static void main(String args[]) {
        Main sd = new Main();
        sd.launchFrame();
    }
    
    void launchFrame() {
        
        // Create JFrame
        jFrame = new JFrame("My First Swing Application");
        
        // Create JPanel
        jPanel = new JPanel();
        textField = new JTextField("Default text");
        button = new JButton("Click me!");
        
        // Add components to jPanel–FlowLayout by default
        jPanel.add(textField);
        jPanel.add(button);
        
        // Add JPanel to the Content Pane
        contentPane = jFrame.getContentPane();
        contentPane.add(jPanel, BorderLayout.CENTER);
        
        jFrame.pack();  //Size of jFrame based on components
        jFrame.setVisible(true);
    }
}