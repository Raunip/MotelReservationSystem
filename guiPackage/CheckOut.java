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


public class CheckOut implements ActionListener {

    public static void main(String[] args) {

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
        button.addActionListener(new CheckOut());
        panel.add(button);

        button = new JButton("Check Out");
        button.setBounds(190,120,120,25);
        button.addActionListener(new CheckOut());
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
