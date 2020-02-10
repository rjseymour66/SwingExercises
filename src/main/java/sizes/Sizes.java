package sizes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sizes extends JFrame implements ActionListener {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private JTextField size;
    private JLabel msg;

    public Sizes() {

        setSize(WIDTH, HEIGHT);
        setTitle("Sizes");

        // get contentPane
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3, 1));

        // textField panel
        var textPanel = new JPanel();
        textPanel.setBackground(Color.LIGHT_GRAY);
        textPanel.setLayout(new FlowLayout());

        size = new JTextField(10);
        textPanel.add(size);

        // message panel
        var messagePanel = new JPanel();
        messagePanel.setBackground(Color.LIGHT_GRAY);
        messagePanel.setLayout(new FlowLayout());

        // message label
        msg = new JLabel("");
        messagePanel.add(msg);

        // button panel
        var buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout());

        // button
        var accept = new JButton("Accept");
        accept.addActionListener(this);
        buttonPanel.add(accept);

        contentPane.add(textPanel);
        contentPane.add(messagePanel);
        contentPane.add(buttonPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String text = size.getText();

        if (e.getActionCommand().equals("Accept") &&
                text.equals("S") ||
                text.equals("M") ||
                text.equals("L") ||
                text.equals("XL") ||
                text.equals("XXL")) {
            msg.setText("Size accepted");
        } else if (e.getActionCommand().equals("Accept"))
            msg.setText("Size rejected");
        else
            msg.setText("Error");
    }
    public static void main(String[] args) {
        var gui = new Sizes();
        gui.setVisible(true);
    }
}
