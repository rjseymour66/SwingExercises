package gridlayout;

import javax.swing.*;
import java.awt.*;

public class Gridlayouts extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    public Gridlayouts() {
        setSize(WIDTH, HEIGHT);
        setTitle("Grid Layout");
        Container content = getContentPane();
        content.setLayout(new GridLayout(2, 2));

        var one = new JLabel("Location one");
        content.add(one);

        var two = new JLabel("Location two");
        content.add(two);

        var three = new JLabel("Location three");
        content.add(three);

        var four = new JLabel("Location four");
        content.add(four);

        var five = new JLabel("Location five");
        content.add(five);

        var six = new JLabel("Location six");
        content.add(six);

        var seven = new JLabel("Location seven");
        content.add(seven);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        var gui = new Gridlayouts();
        gui.setVisible(true);
    }
}
