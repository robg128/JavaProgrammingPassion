/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
package layout;
 
/*
*
* FlowLayoutDemo.java
*
*/
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class FlowLayoutDemo extends JFrame{
    
    JRadioButton RtoLbutton;
    JRadioButton LtoRbutton;
    FlowLayout flowLayout = new FlowLayout();
    final String RtoL = "Right to left";
    final String LtoR = "Left to right";
    JButton applyButton = new JButton("Apply component orientation");
     
    public FlowLayoutDemo(String name) {
        super(name);
    }
     
    public void addComponentsToPane(final Container pane) {
        
        // Use FlowLayout for JPanel
        final JPanel myJPanel1 = new JPanel();
        myJPanel1.setLayout(flowLayout);
        flowLayout.setAlignment(FlowLayout.TRAILING);
        
        // Use FlowLayout for JPanel
        JPanel myJPanel2 = new JPanel();
        myJPanel2.setLayout(new FlowLayout());
         
        LtoRbutton = new JRadioButton(LtoR);
        LtoRbutton.setActionCommand(LtoR);
        LtoRbutton.setSelected(true);
        RtoLbutton = new JRadioButton(RtoL);
        RtoLbutton.setActionCommand(RtoL);
         
        //Add buttons to the experiment layout
        myJPanel1.add(new JButton("Button 1"));
        myJPanel1.add(new JButton("Button 2"));
        myJPanel1.add(new JButton("Button 3"));
        myJPanel1.add(new JButton("Long-Named Button 4"));
        myJPanel1.add(new JButton("5"));
        //Left to right component orientation is selected by default
        myJPanel1.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT);
         
        //Add jPanel to set up the component orientation in the experiment layout
        final ButtonGroup group = new ButtonGroup();
        group.add(LtoRbutton);
        group.add(RtoLbutton);
        myJPanel2.add(LtoRbutton);
        myJPanel2.add(RtoLbutton);
        myJPanel2.add(applyButton);
         
        //Process the Apply component orientation button press
        applyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String command = group.getSelection().getActionCommand();
                //Check the selection
                if (command.equals("Left to right")) {
                    myJPanel1.setComponentOrientation(
                            ComponentOrientation.LEFT_TO_RIGHT);
                } else {
                    myJPanel1.setComponentOrientation(
                            ComponentOrientation.RIGHT_TO_LEFT);
                }
                //update the experiment layout
                myJPanel1.validate();
                myJPanel1.repaint();
            }
        });
        
        // Note that Content pane uses BorderLayout as a default
        pane.add(myJPanel1, BorderLayout.CENTER);
        pane.add(myJPanel2, BorderLayout.SOUTH); ;
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        FlowLayoutDemo frame = new FlowLayoutDemo("FlowLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane. Content pane uses 
        //BorderLayout as a default.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event dispatchi thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}