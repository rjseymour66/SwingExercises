package stopwatch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stopwatch extends JFrame implements ActionListener {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;
    private JLabel label;

    public Stopwatch(){
        setSize(WIDTH, HEIGHT);
        setTitle("Stopwatch");

        // get contentPane
        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        // create button panel
        var buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new FlowLayout());

        // create buttons and add to button panel
        var startButton = new JButton("Start");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);

        var stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        buttonPanel.add(stopButton);

        var resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        // create label with text and color
        label = new JLabel("");

        // add everything to the content pane
        content.add(buttonPanel, BorderLayout.SOUTH);
        content.add(label, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e) {

        Container contentPane = getContentPane();

        if (e.getActionCommand().equals("Start")){
            contentPane.setBackground(Color.GREEN);
            label.setText("Start was pressed");
        } else if (e.getActionCommand().equals("Stop")){
            contentPane.setBackground(Color.RED);
            label.setText("Stop was pressed");
        } else if (e.getActionCommand().equals("Reset")){
            contentPane.setBackground(Color.ORANGE);
            label.setText("Reset was pressed");
        } else
            System.out.println("Error with buttons");
    }

    public static void main(String[] args) {
        var gui = new Stopwatch();
        gui.setVisible(true);
    }
}
