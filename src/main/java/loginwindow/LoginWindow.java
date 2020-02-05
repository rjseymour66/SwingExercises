package loginwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Enter username and password in separate fields
 * Login button - when clicked, check if:
 * name matches "John" and password matches "myPassword"
 * if both match, put "You have been logged in" on a label
 * if they don't match, put "Sorry, that password is not valid" on the result label
 */

public class LoginWindow extends JFrame implements ActionListener {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 350;

    private JTextField username;
    private JTextField password;
    private JLabel textLabel;

    public LoginWindow(){
        setSize(WIDTH, HEIGHT);
        setTitle("Password Match");

        // get content pane and layout
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // create textField panel and layout
        var textPanel = new JPanel();
        textPanel.setBackground(Color.GRAY);
        textPanel.setLayout(new FlowLayout());

        // create textFields
        username = new JTextField("Enter name", 20);
        textPanel.add(username);

        password = new JTextField("Enter password", 20);
        textPanel.add(password);

        // create buttonPanel and layout
        var buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        // create buttons and add to button Panel
        var loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        buttonPanel.add(loginButton);

        // create label
        textLabel = new JLabel("");
        buttonPanel.add(textLabel);


        // add panels to the contentPane
        contentPane.add(textPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);


        // close window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Login") &&
        username.getText().equals("John") &&
        password.getText().equals("myPassword")){
            textLabel.setText("You have been logged in.");
        } else
            textLabel.setText("Sorry, that password is not valid.");
    }

    public static void main(String[] args) {
        var gui = new LoginWindow();
        gui.setVisible(true);
    }
}
