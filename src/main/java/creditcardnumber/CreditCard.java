package creditcardnumber;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Takes a 16 digit cc number in a text field
 * Add Accept button. when clicked, checks that it is 16 digits
 * If 16, display "Number accepted" and the card number in a label, then clear the text field
 * if not 16, display "Number rejected" in the label
 */

public class CreditCard extends JFrame implements ActionListener {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    private JTextField inputField;
    private JLabel message;

    public CreditCard(){
        setSize(WIDTH, HEIGHT);
        setTitle("Credit Card Validator");

        // get Content pane
        Container contentPane = getContentPane();

        // create textPanel that has field and button
        var ccPanel = new JPanel();
        ccPanel.setLayout(new FlowLayout());

        // create textField
        inputField = new JTextField(16);
        ccPanel.add(inputField);

        // create Accept button
        var acceptButton = new JButton("Accept");
        acceptButton.addActionListener(this);
        ccPanel.add(acceptButton);

        // create labelPanel
        var msgPanel = new JPanel();
        msgPanel.setLayout(new BorderLayout());
        msgPanel.setBackground(Color.WHITE);

        // create label
        message = new JLabel("XXXXXXX");
        msgPanel.add(message, BorderLayout.CENTER);

        // add everything to contentPane
        contentPane.add(msgPanel, BorderLayout.CENTER);
        contentPane.add(ccPanel, BorderLayout.SOUTH);

        // make window closeable
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String actionCommand = e.getActionCommand();
        String inputText = inputField.getText();

        if (actionCommand.equals("Accept") && inputText.length() != 16){
            message.setText("Number rejected");
        } else if (actionCommand.equals("Accept") && inputText.length() == 16){
            message.setText("Number accepted " + inputText);
            inputField.setText("");
        } else
            inputField.setText("Error processing request");
    }
    public static void main(String[] args) {
        var gui = new CreditCard();
        gui.setVisible(true);
    }
}
