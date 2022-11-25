package guiPackage;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/////

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FindReservation implements ActionListener
{

    public static void main(String[] args) {

        //Title for window
        JFrame frame;
        frame = new JFrame("Find Reservation");

        JPanel panel = new JPanel();
        frame.setSize(350,200); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel namelabel = new JLabel("Name");
        namelabel.setBounds(10,20,80,25);
        panel.add(namelabel);

        //allows user to insert a text
        JTextField nameText = new JTextField();
        nameText.setBounds(170,20,140,25);
        panel.add(nameText);

        //label name asking for the confirmation number
        JLabel numLabel = new JLabel("Confirmation Number");
        numLabel.setBounds(10,50,150,25);
        panel.add(numLabel);

        JTextField numText = new JTextField();
        numText.setBounds(170,50,140,25);
        panel.add(numText);

        JButton button = new JButton("Back");
        button.setBounds(10,80,80,25);
        button.addActionListener(new FindReservation());
        panel.add(button);

        button = new JButton("Find");
        button.setBounds(190,80,80,25);
        button.addActionListener(new FindReservation());
        panel.add(button);


        panel.setBackground(new Color(0, 119, 200)); //RGB code for background
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}