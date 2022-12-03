package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//////

/**
 * Creates a new window containing the appropriate labels and text boxes to check out a customer.
 */
public class CheckOut extends JFrame implements ActionListener {

    /**
     * Constructor for checkout class. No parameters.
     */
    public CheckOut() {

        //Title for window
        JFrame frame = new JFrame("Check Out Submenu");

        JPanel panel = new JPanel();
        frame.setSize(350,200); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        JLabel namelabel = new JLabel("Name");
        namelabel.setBounds(10,20,80,25);
        panel.add(namelabel);

        JTextField nameText = new JTextField();
        nameText.setBounds(170,20,140,25);
        panel.add(nameText);

        JLabel checkDate = new JLabel("Check Out Date");
        checkDate.setBounds(10,50,120,25);
        panel.add(checkDate);

        JTextField checkText = new JTextField();
        checkText.setBounds(170,50,140,25);
        panel.add(checkText);

        JLabel roomNumlabel = new JLabel("Room Number");
        roomNumlabel.setBounds(10,80,160,25);
        panel.add(roomNumlabel);

        JTextField roomNumText = new JTextField();
        roomNumText.setBounds(170,80,140,25);
        panel.add(roomNumText);

        JButton button = new JButton("Back");
        button.setBounds(10,120,80,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        panel.add(button);


        button = new JButton("Check Out");
        button.setBounds(190,120,120,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fr = new JFrame();
                fr.setSize(100,100);
                JPanel pnl = new JPanel();
                JLabel lbl = new JLabel("Check Out Successful.");
                pnl.add(lbl);
            }
        });
        panel.add(button);

        panel.setLayout(null);


        panel.setBackground(new Color(0, 119, 200)); //RGB code for background
        frame.setVisible(true);

    }

    /**
     * Returns the text associated with the object. Unused method.
     * @return null
     */
    public static String getText() {

        return null;
    }

    /**
     * Throws an exception with a message indicating if a given feature is not functional.
     * This method can be overridden by the constructor.
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
