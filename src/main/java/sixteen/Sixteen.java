package sixteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sixteen extends JFrame implements ActionListener {

    public static final int WIDTH = 250;
    public static final int HEIGHT = 100;

    private JLabel message;
    private JButton yes;
    private JButton no;

    public Sixteen() {

        setSize(WIDTH, HEIGHT);
        setTitle("Sixteen or not?");

        // get contentPane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // label pane
        var labelPanel = new JPanel();
        labelPanel.setBackground(Color.LIGHT_GRAY);
        labelPanel.setLayout(new FlowLayout());

        // label
        message = new JLabel("Are you at least 16 years old?");
        labelPanel.add(message);

        // button panel
        var buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

        // yes button
        yes = new JButton("Yes");
        yes.addActionListener(this);
        buttonPanel.add(yes);

        // no button
        no = new JButton("No");
        no.addActionListener(this);
        buttonPanel.add(no);

        // add to contentPane
        contentPane.add(labelPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Yes")) {
            message.setText("The user is 16 years old.");
        } else if (e.getActionCommand().equals("No")){
            message.setText("The user is not yet 16 years old.");
        }
        yes.setVisible(false);
        no.setVisible(false);
    }

    public static void main(String[] args) {
        var gui = new Sixteen();
        gui.setVisible(true);
    }
}
