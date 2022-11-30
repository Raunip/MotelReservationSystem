package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static guiPackage.ResrvationSubMenuGui.res_sub_menuFrame;

public class MainMenuGui extends JFrame implements ActionListener {

    private static final String reservation = "Reservation";
    private static final String avail_rooms = "Find Available Rooms";
    private static final String check_in = "Check In";
    private static final String check_out = "Check Out";
    static JFrame main_menu_frame;


    public void addResButton(){

        JButton res_button = new JButton(reservation);
        res_button.setBounds(90, 40, 100, 40);
        main_menu_frame.add(res_button);
        res_button.addActionListener(this);
    }

    public void addFindRoomsButton(){
        JButton find_roomsButton = new JButton(avail_rooms);
        find_roomsButton.setBounds(90,100,100,40);
        main_menu_frame.add(find_roomsButton);
        find_roomsButton.addActionListener(this);
    }

    public void addCheckInButton()
    {
        JButton check_inButton = new JButton(check_in);
        check_inButton.setBounds(90,160,100,40);
        main_menu_frame.add(check_inButton);
        check_inButton.addActionListener(this);
    }


    public void addCheckOutButton()
    {
        JButton check_outButton = new JButton(check_out);
        check_outButton.setBounds(90,220,100,40);
        main_menu_frame.add(check_outButton);
        check_outButton.addActionListener(this);
    }

    public MainMenuGui(){
        main_menu_frame = new JFrame("Main Menu");
        main_menu_frame.setSize(300, 350);
        main_menu_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_menu_frame.setBackground(new Color(0, 119, 200));
        main_menu_frame.setLayout(null);
        main_menu_frame.setVisible(true);
        addResButton();
        addFindRoomsButton();
        addCheckInButton();
        addCheckOutButton();

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Reservation")){
            this.setVisible(false); // first frame is still open
            new ResrvationSubMenuGui().setVisible(true);

        } else if (e.getActionCommand().equals("Find Available Rooms")) {
             this.setVisible(false);
             new FindAvailableRooms().setVisible(true);
        } else if (e.getActionCommand().equals("Check In")) {
             this.setVisible(false);
             new CheckIn().setVisible(true);
        } else if (e.getActionCommand().equals("Check Out")) {
             this.setVisible(false);
             new CheckOut().setVisible(true);
        }
    }


}

