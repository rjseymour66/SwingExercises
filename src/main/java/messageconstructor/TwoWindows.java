package messageconstructor;

import javax.swing.*;
import java.awt.*;

public class TwoWindows extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    public TwoWindows(String msg){
        super();
        setSize(WIDTH, HEIGHT);
        setTitle("Two Windows, 2 Messages");
        // create the JLabel
        var message = new JLabel(msg);
        // add it to the contentPane
        Container contentPane = getContentPane();
        contentPane.add(message);
        // make the window closeable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        var one = new TwoWindows("Where is John?");
        one.setVisible(true);

        var two = new TwoWindows("John is waterskiing.");
        two.setVisible(true);
    }
}
