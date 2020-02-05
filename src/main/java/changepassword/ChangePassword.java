package changepassword;

import gridlayout.Gridlayouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ChangePassword extends JFrame implements ActionListener {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;

    private JTextField oPWord;
    private JTextField nPWord;
    private JLabel rLabel;

    public ChangePassword(){

        setSize(WIDTH, HEIGHT);
        setTitle("Change Password");

        // get contentPane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // textPanel
        var textPanel = new JPanel();
        textPanel.setBackground(Color.GRAY);
        textPanel.setLayout(new FlowLayout());

        // add text fields
        oPWord = new JTextField("Old Password", 20);
        textPanel.add(oPWord);

        nPWord = new JTextField("New Password", 20);
        textPanel.add(nPWord);

        // button panel
        var buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.RED);
        buttonPanel.setLayout(new FlowLayout());

        // add button
        var changeButton = new JButton("Change");
        changeButton.addActionListener(this);
        buttonPanel.add(changeButton);

/*
        // results panel
        var resultsPanel = new JPanel();
        resultsPanel.setBackground(Color.BLUE);
*/
        // results label
        rLabel = new JLabel("");
        buttonPanel.add(rLabel);



        // add to content pane
        contentPane.add(textPanel, BorderLayout.CENTER);
        //contentPane.add(resultsPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        // closeable
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent e){
        String originalText = oPWord.getText();
        String newText = nPWord.getText();

        if(e.getActionCommand().equals("Change") &&
        originalText.equals(newText)){
            rLabel.setText("Your password has been updated!");
        } else
            rLabel.setText("Sorry, the passwords do not match");

    }

    public static void main(String[] args) {
        var gui = new ChangePassword();
        gui.setVisible(true);
    }
}
