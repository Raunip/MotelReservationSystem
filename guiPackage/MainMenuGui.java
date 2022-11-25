package guiPackage;

import javax.swing.*;
import java.awt.*;

public class MainMenuGui {

    private static final String reservation = "Reservation";
    private static final String avail_rooms = "Find Available Rooms";
    private static final String check_in = "Check In";
    private static final String check_out = "Check Out";


    public static void main (String[] args){
        JFrame frame = new JFrame("Main Menu");
        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(0, 119, 200));

        frame.setLayout(null);



        JButton res_button = new JButton(reservation);
        res_button.setBounds(90, 40, 100, 40);
        frame.add(res_button);

        JButton find_roomsButton = new JButton(avail_rooms);
        find_roomsButton.setBounds(90,100,100,40);
        frame.add(find_roomsButton);

        JButton check_inButton = new JButton(check_in);
        check_inButton.setBounds(90,160,100,40);
        frame.add(check_inButton);

        JButton check_outButton = new JButton(check_out);
        check_outButton.setBounds(90,220,100,40);
        frame.add(check_outButton);

        frame.setVisible(true);

    }

}
