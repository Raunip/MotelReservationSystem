package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    public static void main(String[] args){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Motel Reservation System");


        frame.setSize(350,170);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

      userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

         passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

         passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

         button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener( new LoginPage());
        panel.add(button);

        

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        panel.setBackground(new Color(0, 119, 200));

        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("reservations") && password.equals("1234")) {
            success.setText("Login successful!");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    this.setVisible(false);
                    new MainMenuGui().setVisible(true);
                }

                private void setVisible(boolean b) {
                }
            });
        }
            else{
                success.setText("Incorrect user or password.");
            }

        }
    }

