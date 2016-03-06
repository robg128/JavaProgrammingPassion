package layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLayoutDemo extends JFrame {
    public static void main(String args[]) {
        BorderLayoutDemo bld = new BorderLayoutDemo();
        bld.setLayout(new BorderLayout(10, 10));
        bld.add(new JButton("NORTH"), BorderLayout.NORTH);
        bld.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        bld.add(new JButton("EAST"), BorderLayout.EAST);
        bld.add(new JButton("WEST"), BorderLayout.WEST);
        bld.add(new JButton("CENTER"), BorderLayout.CENTER);
        bld.setSize(200, 200);
        bld.setVisible(true);
    }
}