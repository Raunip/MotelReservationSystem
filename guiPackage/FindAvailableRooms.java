package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Creates a new window containing the appropriate labels and buttons to find an available room.
 */
public class FindAvailableRooms extends JFrame {

    /**
     * Constructor for FindAvailableRooms class. No parameters.
     */
    public  FindAvailableRooms()
        {


        //Title for window
        JFrame frame = new JFrame("Find Available Rooms Submenu");

        JPanel panel = new JPanel();
        frame.setSize(400,230); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);


        JLabel roomNumlabel = new JLabel("Room Number");
        roomNumlabel.setBounds(10,20,90,25);
        panel.add(roomNumlabel);

        JTextField roomNumText = new JTextField();
        roomNumText.setBounds(170,20,140,25);
        panel.add(roomNumText);

        JLabel roomTypelabel = new JLabel("Room Type");
        roomTypelabel.setBounds(10,50,120,25);
        panel.add(roomTypelabel);

        JTextField roomTypeText = new JTextField();
        roomTypeText.setBounds(170,50,140,25);
        panel.add(roomTypeText);

        JLabel checkInlabel = new JLabel("Check In Date");
        checkInlabel.setBounds(10,80,160,25);
        panel.add(checkInlabel);

        JTextField checkInText = new JTextField();
        checkInText.setBounds(170,80,140,25);
        panel.add(checkInText);

        JLabel checkOutlabel = new JLabel("Check In Date");
        checkOutlabel.setBounds(10,110,190,25);
        panel.add(checkOutlabel);

        JTextField checkOutText = new JTextField();
        checkOutText.setBounds(170,110,140,25);
        panel.add(checkOutText);


        JButton button = new JButton("Back");
        button.setBounds(10,150,80,25);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });

        button = new JButton("Find");
        button.setBounds(190,150,120,25);
        panel.add(button);


        panel.setBackground(new Color(0, 119, 200)); //RGB code for background
        frame.setVisible(true);



    }


}
