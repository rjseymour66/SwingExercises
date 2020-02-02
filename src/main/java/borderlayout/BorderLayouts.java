package borderlayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayouts extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    public BorderLayouts(){
        setSize(WIDTH, HEIGHT);
        setTitle("Border Layouts!");
        Container contentPane = getContentPane();

        contentPane.setLayout(new BorderLayout());

        JLabel north = new JLabel("Northern Location");
        contentPane.add(north, BorderLayout.NORTH);

        JLabel south = new JLabel("Southern Location");
        contentPane.add(south, BorderLayout.SOUTH);

        JLabel east = new JLabel("Eastern Location");
        contentPane.add(east, BorderLayout.EAST);

        JLabel west = new JLabel("Western Location");
        contentPane.add(west, BorderLayout.WEST);

        JLabel center = new JLabel("Central Location");
        contentPane.add(center, BorderLayout.CENTER);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        var gui = new BorderLayouts();
        gui.setVisible(true);
    }
}
