package telephonekeypad;

import gridlayout.Gridlayouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhonePad extends JFrame implements ActionListener {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 700;

    private JTextField numberScreen;
    private String strNumber = "";

    public PhonePad() {
        setSize(WIDTH, HEIGHT);
        setTitle("Phone pad");

        // get content pane
        Container content = getContentPane();

        // create keypad and add to content
        var keypad = new JPanel();
        keypad.setLayout(new GridLayout(4, 3));
        keypad.setBackground(Color.LIGHT_GRAY);
        content.add(keypad, "Center");

        // put keypad in the center

        // create button, add actionListener, add to keypad
        var oneButton = new JButton("1");
        oneButton.addActionListener(this);
        keypad.add(oneButton);

        var twoButton = new JButton("2");
        twoButton.addActionListener(this);
        keypad.add(twoButton);

        var threeButton = new JButton("3");
        threeButton.addActionListener(this);
        keypad.add(threeButton);

        var fourButton = new JButton("4");
        fourButton.addActionListener(this);
        keypad.add(fourButton);

        var fiveButton = new JButton("5");
        fiveButton.addActionListener(this);
        keypad.add(fiveButton);

        var sixButton = new JButton("6");
        sixButton.addActionListener(this);
        keypad.add(sixButton);

        var sevenButton = new JButton("7");
        sevenButton.addActionListener(this);
        keypad.add(sevenButton);

        var eightButton = new JButton("8");
        eightButton.addActionListener(this);
        keypad.add(eightButton);

        var nineButton = new JButton("9");
        nineButton.addActionListener(this);
        keypad.add(nineButton);

        var starButton = new JButton("*");
        starButton.addActionListener(this);
        keypad.add(starButton);

        var zeroButton = new JButton("0");
        zeroButton.addActionListener(this);
        keypad.add(zeroButton);

        var poundButton = new JButton("#");
        poundButton.addActionListener(this);
        keypad.add(poundButton);

        // create text panel, set layout
        var textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());

        // create text field and add to textLabel
        numberScreen = new JTextField(20);
        textPanel.add(numberScreen, BorderLayout.SOUTH);

        content.add(textPanel, "South");

        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e){
        strNumber += e.getActionCommand();
        numberScreen.setText(strNumber);
    }
    public static void main(String[] args) {
        var gui = new PhonePad();
        gui.setVisible(true);
    }
}
