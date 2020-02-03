package listofnames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * text area in center of the screen capable of holding ten lines that cannot be edited
 * Text field and Accept button in the south position
 * take the name from the text field and add it to the text area, then clear the text field
 */

public class ListOfNames extends JFrame implements ActionListener {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;
    public static final int LINES = 10;
    public static final int CHAR_PER_LINE = 40;

    private JTextArea theText;
    private JTextField inputText;
    private String totalText = "";

    public ListOfNames(){
        setSize(WIDTH, HEIGHT);
        setTitle("List of Names");

        // get content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // create textPanel
        var textPanel = new JPanel();
        textPanel.setBackground(Color.GRAY);

        // create textArea
        theText = new JTextArea(LINES, CHAR_PER_LINE);
        theText.setBackground(Color.WHITE);
        theText.setEditable(false);

        // add textArea to Text panel
        textPanel.add(theText);

        //create name panel and add layout
        var namePanel = new JPanel();
        namePanel.setBackground(Color.GRAY);
        namePanel.setLayout(new FlowLayout());

        // create nametext field and add it to name panel
        inputText = new JTextField("Enter names here", 20);
        inputText.setBackground(Color.WHITE);
        namePanel.add(inputText);

        // create Accept button and add it to name area
        var acceptButton = new JButton("Accept");
        acceptButton.addActionListener(this);
        namePanel.add(acceptButton);

        // add text panel, namePanel to content pane
        contentPane.add(namePanel, BorderLayout.SOUTH);
        contentPane.add(textPanel, BorderLayout.CENTER);

        // make it closeable
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String actionCommand = e.getActionCommand();
        String addText = inputText.getText().trim() + "\n";

        if (actionCommand.equals("Accept")){

            totalText += addText;
            theText.setText(totalText);

            // clear text field
            inputText.setText("");
        }
    }
    public static void main(String[] args) {
        var gui = new ListOfNames();
        gui.setVisible(true);
    }
}
