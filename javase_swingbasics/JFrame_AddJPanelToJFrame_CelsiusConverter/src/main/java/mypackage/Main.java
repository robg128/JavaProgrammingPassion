package mypackage;

/**
 * Main.java is a 1.4 application that 
 * demonstrates the use of JButton, JTextField and
 * JLabel.  It requires no other files.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener {
    
    JFrame converterJFrame;
    JPanel converterJPanel;
    JTextField tempCelsius;
    JLabel celsiusLabel, fahrenheitLabel;
    JButton convertJButton;

    public Main() {
        
        //Create and set up the window.
        converterJFrame = new JFrame("Convert Celsius to Fahrenheit");
        converterJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converterJFrame.setSize(new Dimension(120, 40));

        //Create and set up the panel.
        converterJPanel = new JPanel(new GridLayout(2, 2));

        //Add the widgets.
        addWidgetsJPanel();

        //Set the default button.
        converterJFrame.getRootPane().setDefaultButton(convertJButton);

        //Add the panel to the window.
        converterJFrame.add(converterJPanel, BorderLayout.CENTER);

        //Display the window.
        converterJFrame.pack();
        converterJFrame.setVisible(true);
    }

    /**
     * Create and add the widgets to JPabel
     */
    private void addWidgetsJPanel() {
        
        // Create widgets.
        tempCelsius = new JTextField(2);
        celsiusLabel = new JLabel("Celsius", SwingConstants.LEFT);
        convertJButton = new JButton("Convert");
        fahrenheitLabel = new JLabel("Fahrenheit", SwingConstants.LEFT);

        // Listen to events from the Convert button.
        convertJButton.addActionListener(this);

        // Add the widgets to the container.
        converterJPanel.add(tempCelsius);
        converterJPanel.add(celsiusLabel);
        converterJPanel.add(convertJButton);
        converterJPanel.add(fahrenheitLabel);
        
        celsiusLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        fahrenheitLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    // Event handler for JButton
    public void actionPerformed(ActionEvent event) {
        //Parse degrees Celsius as a double and convert to Fahrenheit.
        int tempFahr = (int)((Double.parseDouble(tempCelsius.getText()))
                             * 1.8 + 32);
        fahrenheitLabel.setText(tempFahr + " Fahrenheit");
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        Main converter = new Main();
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