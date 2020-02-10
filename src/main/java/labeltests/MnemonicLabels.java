package labeltests;

import javax.swing.*;
import java.awt.*;

public class MnemonicLabels extends JFrame {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    private JTextField firstField;
    private JTextField middleField;
    private JTextField lastField;

    private JLabel firstLabel;
    private JLabel middleLabel;
    private JLabel lastLabel;

    public MnemonicLabels() {

        setSize(WIDTH, HEIGHT);
        setTitle("Mnemonic labels");

        // get contentpane
        Container contentPane = getContentPane();

        // JTextFields
        firstField = new JTextField(10);
        middleField = new JTextField(10);
        lastField = new JTextField(10);

        // Create labels and mnemonics
        firstLabel = new JLabel("First Name", JLabel.RIGHT);
        firstLabel.setDisplayedMnemonic('F');
        firstLabel.setLabelFor(firstField);

        middleLabel = new JLabel("Middle Initial", JLabel.RIGHT);
        middleLabel.setDisplayedMnemonic('I');
        middleLabel.setDisplayedMnemonicIndex(7);
        middleLabel.setLabelFor(middleField);

        lastLabel = new JLabel("Last Name", JLabel.RIGHT);
        lastLabel.setDisplayedMnemonic('L');
        lastLabel.setLabelFor(lastField);

        // layout and display
        var p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 5, 5));
        p.add(firstLabel);
        p.add(firstField);
        p.add(middleLabel);
        p.add(middleField);
        p.add(lastLabel);
        p.add(lastField);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        var gui = new MnemonicLabels();
        gui.setVisible(true);
    }
}
