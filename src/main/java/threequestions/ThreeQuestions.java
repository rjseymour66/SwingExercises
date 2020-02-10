package threequestions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreeQuestions extends JFrame implements ActionListener {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    private JTextField tTop;
    private JTextField tMid;
    private JTextField tBottom;
    private JLabel rLabel;

    private JPanel top;
    private JPanel mid;
    private JPanel bottom;


    public ThreeQuestions() {

        setSize(WIDTH, HEIGHT);
        setTitle("Three Questions");

        // get contentPane and setlayout
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(5,1));

        // 3 panels to add label questions and answer textField
        top = new JPanel();
        top.setBackground(Color.LIGHT_GRAY);
        top.setLayout(new FlowLayout());

        mid = new JPanel();
        mid.setBackground(Color.LIGHT_GRAY);
        mid.setLayout(new FlowLayout());

        bottom = new JPanel();
        bottom.setBackground(Color.LIGHT_GRAY);
        bottom.setLayout(new FlowLayout());

        // 3 labels for questions
        var qTop = new JLabel("This is question one");
        var qMid = new JLabel("This is question two");
        var qBottom = new JLabel("This is question three");

        // 3 textFields for answers
        tTop = new JTextField("", 10);
        tMid = new JTextField("", 10);
        tBottom = new JTextField("", 10);

        // add qs and text to panels
        top.add(qTop);
        top.add(tTop);

        mid.add(qMid);
        mid.add(tMid);

        bottom.add(qBottom);
        bottom.add(tBottom);

        // results panel
        var rPanel = new JPanel();
        rPanel.setLayout(new FlowLayout());
        rPanel.setBackground(Color.LIGHT_GRAY);

        // results label
        rLabel = new JLabel("");
        rPanel.add(rLabel);

        // button panel
        var buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(Color.GRAY);

        // Accept button
        var accept = new JButton("Accept");
        accept.addActionListener(this);
        buttonPanel.add(accept);

        // add panels, button, to contentPane
        contentPane.add(top);
        contentPane.add(mid );
        contentPane.add(bottom);
        contentPane.add(rPanel);
        contentPane.add(buttonPanel);

        // make closeable
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e) {
        String topText = tTop.getText();
        String midText = tMid.getText();
        String bText = tBottom.getText();
        boolean flag = true;

        // Accept button that checks whether each text area contains a nonempty string
        if (e.getActionCommand().equals("Accept") && topText.equals("")) {
            top.setBackground(Color.RED);
            flag = false;
        }

        if (e.getActionCommand().equals("Accept") && midText.equals("")) {
            mid.setBackground(Color.RED);
            flag = false;
        }

        if (e.getActionCommand().equals("Accept") && bText.equals("")) {
            bottom.setBackground(Color.RED);
            flag = false;
        }

        if (flag) {
            rLabel.setText("Your answers have been recorded.");
        } else
            rLabel.setText("You must answer all questions!");
    }

    public static void main(String[] args) {
        var gui = new ThreeQuestions();
        gui.setVisible(true);
    }
}
