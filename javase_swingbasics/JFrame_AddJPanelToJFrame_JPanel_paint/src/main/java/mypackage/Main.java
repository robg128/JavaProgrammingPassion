package mypackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {
    
    Main() {
        setBackground(Color.black);
    }
    
    public void paint(Graphics g) {
        g.setColor(new Color(0,255,0));	//green
        g.setFont(new Font("Helvetica",Font.PLAIN,16));
        g.drawString("Hello GUI World!", 30, 100);
        g.setColor(new Color(1.0f,0,0));	//red
        g.fillRect(30, 100, 150, 10);
    }
    
    /* need to place Panel in Frame or other Window */
    public static void main(String args[]) {
        
        JFrame jFrame = new JFrame("Testing Graphics Panel");
        Main gp = new Main(); // It is JPanel
        jFrame.add(gp);
        jFrame.setSize(600, 300);
        jFrame.setVisible(true);
    }
}