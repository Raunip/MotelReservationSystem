package guiPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/////
/**
 *
 * @author sarakhouri
 */
public class CheckIn implements ActionListener
{

    public static void main(String[] args) {

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
        button.addActionListener(new CheckIn());
        panel.add(button);

        button = new JButton("Check In");
        button.setBounds(190,120,120,25);
        button.addActionListener(new CheckIn());
        panel.add(button);

        panel.setLayout(null);


        panel.setBackground(new Color(0, 119, 200)); //RGB code for background
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}