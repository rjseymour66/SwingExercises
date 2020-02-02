package colorconstructor;

import javax.swing.*;
import java.awt.*;

public class ThreeWindows extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    public ThreeWindows(String title, Color color) {
        setSize(WIDTH, HEIGHT);
        setTitle(title);
        Container contentPane = getContentPane();
        contentPane.setBackground(color);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        var one = new ThreeWindows("Magenta", Color.MAGENTA);
        one.setVisible(true);

        var two = new ThreeWindows("Orange", Color.ORANGE);
        two.setVisible(true);

        var three = new ThreeWindows("Green", Color.GREEN);
        three.setVisible(true);
    }
}
