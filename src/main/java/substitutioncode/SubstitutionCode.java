package substitutioncode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubstitutionCode extends JFrame implements ActionListener {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int LINES = 10;
    public static final int CHARS_PER_LINE = 40;

    private JTextArea theText;
    private int count = 65;
    private String typedLetters = "";

    public SubstitutionCode(){

        setSize(WIDTH, HEIGHT);
        setTitle("Substitution Code");

        // get contentPane
        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        // create text panel
        var textPanel = new JPanel();
        textPanel.setBackground(Color.GRAY);

        // create text area
        theText = new JTextArea(LINES, CHARS_PER_LINE);
        theText.setBackground(Color.WHITE);
        theText.setLineWrap(true);
        textPanel.add(theText);

        // add text area to panel
        content.add(textPanel, BorderLayout.CENTER);

        // create button panel
        var buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6,6));

        // create 26 buttons for alphabet
        var aButton = new JButton("A");
        aButton.addActionListener(this);
        buttonPanel.add(aButton);

        var bButton = new JButton("B");
        bButton.addActionListener(this);
        buttonPanel.add(bButton);

        var cButton = new JButton("C");
        cButton.addActionListener(this);
        buttonPanel.add(cButton);

        var dButton = new JButton("D");
        dButton.addActionListener(this);
        buttonPanel.add(dButton);

        var eButton = new JButton("E");
        eButton.addActionListener(this);
        buttonPanel.add(eButton);

        var fButton = new JButton("F");
        fButton.addActionListener(this);
        buttonPanel.add(fButton);

        var gButton = new JButton("G");
        gButton.addActionListener(this);
        buttonPanel.add(gButton);

        var hButton = new JButton("H");
        hButton.addActionListener(this);
        buttonPanel.add(hButton);

        var iButton = new JButton("I");
        iButton.addActionListener(this);
        buttonPanel.add(iButton);

        var jButton = new JButton("J");
        jButton.addActionListener(this);
        buttonPanel.add(jButton);

        var kButton = new JButton("K");
        kButton.addActionListener(this);
        buttonPanel.add(kButton);

        var lButton = new JButton("L");
        lButton.addActionListener(this);
        buttonPanel.add(lButton);

        var mButton = new JButton("M");
        mButton.addActionListener(this);
        buttonPanel.add(mButton);

        var nButton = new JButton("N");
        nButton.addActionListener(this);
        buttonPanel.add(nButton);

        var oButton = new JButton("O");
        oButton.addActionListener(this);
        buttonPanel.add(oButton);

        var pButton = new JButton("P");
        pButton.addActionListener(this);
        buttonPanel.add(pButton);

        var qButton = new JButton("Q");
        qButton.addActionListener(this);
        buttonPanel.add(qButton);

        var rButton = new JButton("R");
        rButton.addActionListener(this);
        buttonPanel.add(rButton);

        var sButton = new JButton("S");
        sButton.addActionListener(this);
        buttonPanel.add(sButton);

        var tButton = new JButton("T");
        tButton.addActionListener(this);
        buttonPanel.add(tButton);

        var uButton = new JButton("U");
        uButton.addActionListener(this);
        buttonPanel.add(uButton);

        var vButton = new JButton("V");
        vButton.addActionListener(this);
        buttonPanel.add(vButton);

        var wButton = new JButton("W");
        wButton.addActionListener(this);
        buttonPanel.add(wButton);

        var xButton = new JButton("X");
        xButton.addActionListener(this);
        buttonPanel.add(xButton);

        var yButton = new JButton("Y");
        yButton.addActionListener(this);
        buttonPanel.add(yButton);

        var zButton = new JButton("Z");
        zButton.addActionListener(this);
        buttonPanel.add(zButton);


        // add button panel to content panel
        content.add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        // print A, B, C, etc in order
        char inOrder = (char)count;
        count++;
        typedLetters += Character.toString(inOrder);
        theText.setText(typedLetters);

        // make invisible
        JButton clicked = (JButton)e.getSource();
        clicked.setVisible(false);
    }

    public static void main(String[] args) {
        var gui = new SubstitutionCode();
        gui.setVisible(true);
    }
}
