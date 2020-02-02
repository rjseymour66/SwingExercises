package flowlayout;

import javax.swing.*;
import java.awt.*;

public class FlowLayouts extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    public FlowLayouts(){
        setSize(WIDTH, HEIGHT);
        setTitle("Flow Layout!");

        // get content pane
        Container contentPane = getContentPane();
        // add layout
        contentPane.setLayout(new FlowLayout());

        // create labels
        var one = new JLabel("Location one");
        contentPane.add(one);

        var two = new JLabel("Location two");
        contentPane.add(two);

        var three = new JLabel("Location three");
        contentPane.add(three);

        var four = new JLabel("Location four");
        contentPane.add(four);

        var five = new JLabel("Location five");
        contentPane.add(five);

        var six = new JLabel("Location six");
        contentPane.add(six);

        var seven = new JLabel("Location seven");
        contentPane.add(seven);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        var gui = new FlowLayouts();
        gui.setVisible(true);
    }
}
