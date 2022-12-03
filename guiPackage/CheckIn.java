package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/////
/**
 * Creates a new window containing the appropriate labels and buttons to check in a customer.
 * @author sarakhouri
 */
public class CheckIn extends JFrame implements ActionListener
{

    /**
     * Constructor for CheckIn class. No parameters.
     */
    public CheckIn() {

        //Title for window
        JFrame frame = new JFrame("Check In Submenu");

        JPanel panel = new JPanel();
        frame.setSize(350,200); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        JLabel namelabel = new JLabel("Name");
        namelabel.setBounds(10,20,80,25);
        panel.add(namelabel);

        JTextField nameText = new JTextField();
        nameText.setBounds(200,20,140,25);
        panel.add(nameText);

        JLabel conflabel = new JLabel("Confirmation Number");
        conflabel.setBounds(10,50,150,40);
        panel.add(conflabel);

        JTextField confText = new JTextField();
        confText.setBounds(200,50,140,25);
        panel.add(confText);


        JButton button = new JButton("Back");
        button.setBounds(10,120,80,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        panel.add(button);

        button = new JButton("Check In");
        button.setBounds(190,120,120,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fr = new JFrame();
                fr.setSize(100,100);
                JPanel pnl = new JPanel();
                JLabel lbl = new JLabel("Check in Successful.");
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
     * This method can be overridden in the constructor.
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}