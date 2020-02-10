package labeltests;

import javax.swing.*;
import java.awt.*;

public class StackedLabels extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    public StackedLabels() {

        setSize(WIDTH, HEIGHT);
        setTitle("Stacked Labels");

        // get Content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // create JPanel
        var panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.setBackground(Color.LIGHT_GRAY);

        // create 4 labels
        var one = new JLabel("This is the one");
        var two = new JLabel("This is the two");
        var three = new JLabel("This is the three");
        var four = new JLabel("This is the four");

        // add labels to panel
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);




        // add panel to content pane
        contentPane.add(panel);

        // make window closeable
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        var gui = new StackedLabels();
        gui.setVisible(true);
    }
}
