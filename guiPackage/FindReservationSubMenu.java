package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FindReservationSubMenu extends JFrame
{


    public FindReservationSubMenu()
    {
        JFrame frame = new JFrame("Find Reservation Submenu");

        JPanel panel = new JPanel();
        frame.setSize(340,350); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel fnamelabel = new JLabel("First Name");
        fnamelabel.setBounds(10,20,80,25);
        panel.add(fnamelabel);

        //bounds ( x(left/right), y(up/down) , width , height )
        JTextField fnameText = new JTextField();
        fnameText.setBounds(170,20,140,25);
        panel.add(fnameText);

        JLabel lnamelabel = new JLabel("Last Name");
        lnamelabel.setBounds(10,50,150,25);
        panel.add(lnamelabel);

        JTextField lnameText = new JTextField();
        lnameText.setBounds(170,50,140,25);
        panel.add(lnameText);

        JLabel checkDatelabel = new JLabel("Check In Date");
        checkDatelabel.setBounds(10,70,170,40);
        panel.add(checkDatelabel);


        JTextField checkDateText = new JTextField();
        checkDateText.setBounds(170, 80, 140, 25);
        panel.add(checkDateText);

        JLabel checkOutDatelabel = new JLabel("Check Out Date");
        checkOutDatelabel.setBounds(10,110,190,25);
        panel.add(checkOutDatelabel);


        JTextField checkOutDateText = new JTextField();
        checkOutDateText.setBounds(170, 110, 140, 25);
        panel.add(checkOutDateText);

        JLabel roomlabel = new JLabel("Room Type");
        roomlabel.setBounds(10,140,210,25);
        panel.add(roomlabel);


        JTextField roomText = new JTextField();
        roomText.setBounds(170,140,140,25);
        panel.add(roomText);

        JLabel roomRatelabel = new JLabel("Room Rate");
        roomRatelabel.setBounds(10,170,240,25);
        panel.add(roomRatelabel);

        JTextField roomRateText = new JTextField();
        roomRateText.setBounds(170,170,140,25);
        panel.add(roomRateText);

        JLabel paymentlabel = new JLabel("Payment Method");
        paymentlabel.setBounds(10,200,270,25);
        panel.add(paymentlabel);

        JTextField paymentText = new JTextField();
        paymentText.setBounds(170,200,140,25);
        panel.add(paymentText);

        JButton button = new JButton("Back");
        button.setBounds(10,290,80,25);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
       // panel.add(button);

        JButton button1 = new JButton("Modify Reservation");
        button1.setBounds(80,230,150,25);
        panel.add(button1);

        JButton button2 = new JButton("Cancel Reservation");
        button2.setBounds(80,260,150,25);
        panel.add(button2);

        panel.setBackground(new Color(0, 119, 200));
        frame.setVisible(true);
    }

    public static void  main(String[] args) {


        new FindReservationSubMenu();

    }


}