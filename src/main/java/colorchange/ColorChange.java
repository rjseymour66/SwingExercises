package colorchange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChange extends JFrame implements ActionListener {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    public ColorChange(){
        setSize(WIDTH, HEIGHT);
        setTitle("Color Change");

        // get contentPane
        Container contentPane = getContentPane();

        // set layout
        contentPane.setLayout(new BorderLayout());

        // set background color
        contentPane.setBackground(Color.RED);

        // create button
        var button = new JButton("Change");
        button.addActionListener(this);
        contentPane.add(button, BorderLayout.NORTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        // get contentPane
        Container contentPane = getContentPane();
        int count = 1;
        // red 1
        // white 2
        // blue 3

        if (e.getActionCommand().equals("Change")
                && contentPane.getBackground().equals(Color.RED))
            contentPane.setBackground(Color.WHITE);
        else if (e.getActionCommand().equals("Change")
                && contentPane.getBackground().equals(Color.WHITE))
            contentPane.setBackground(Color.BLUE);
        else if (e.getActionCommand().equals("Change")
                && contentPane.getBackground().equals(Color.BLUE))
            contentPane.setBackground(Color.RED);
        else
            System.out.println("Error with the button.");
    }

    public static void main(String[] args) {
        var gui = new ColorChange();
        gui.setVisible(true);
    }
}
