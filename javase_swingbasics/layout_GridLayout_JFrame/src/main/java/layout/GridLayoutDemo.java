package layout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayoutDemo extends JFrame {
    public static void main(String args[]) {
        GridLayoutDemo gld = new GridLayoutDemo();
        gld.setLayout(new GridLayout(2, 3, 4, 4));
        gld.add(new JButton("ONE"));
        gld.add(new JButton("TWO"));
        gld.add(new JButton("THREE"));
        gld.add(new JButton("FOUR"));
        gld.add(new JButton("FIVE"));
        gld.setSize(200, 200);
        gld.setVisible(true);
    }
}