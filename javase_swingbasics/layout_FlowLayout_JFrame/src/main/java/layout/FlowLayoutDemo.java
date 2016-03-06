package layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutDemo extends JFrame {
    public static void main(String args[]) {
        FlowLayoutDemo fld = new FlowLayoutDemo();
        fld.setLayout(new FlowLayout(FlowLayout.RIGHT,
                10, 10));
        fld.add(new JButton("ONE"));
        fld.add(new JButton("TWO"));
        fld.add(new JButton("THREE"));
        fld.setSize(100, 100);
        fld.setVisible(true);
    }
}