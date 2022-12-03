package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Creates a new window for the main menu with the appropriate buttons to select an option.
 */
public class MainMenuGui extends JFrame implements ActionListener {

    private static final String reservation = "Reservation";
    private static final String avail_rooms = "Find Available Rooms";
    private static final String check_in = "Check In";
    private static final String check_out = "Check Out";

    private static final String find_submenu = "Find Reservation SubMenu";

    private final SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy");

    Calendar inDate = Calendar.getInstance();
    Calendar outDate= Calendar.getInstance();
    static JFrame main_menu_frame;

    /**
     * Adds a button to access the reservation submenu.
     */
    public void addResButton(){

        JButton res_button = new JButton(reservation);
        res_button.setBounds(90, 40, 150, 40);
        main_menu_frame.add(res_button);
        res_button.addActionListener(this);
    }

    /**
     * Adds a button to select the option to find available rooms.
     */
    public void addFindRoomsButton(){
        JButton find_roomsButton = new JButton(avail_rooms);
        find_roomsButton.setBounds(90,100,150,40);
        main_menu_frame.add(find_roomsButton);
        find_roomsButton.addActionListener(this);
    }

    /**
     * Adds a button for the option to check in a customer.
     */
    public void addCheckInButton()
    {
        JButton check_inButton = new JButton(check_in);
        check_inButton.setBounds(90,160,150,40);
        main_menu_frame.add(check_inButton);
        check_inButton.addActionListener(this);
    }

    /**
     * Adds a button for the option to check out a customer.
     */
    public void addCheckOutButton()
    {
        JButton check_outButton = new JButton(check_out);
        check_outButton.setBounds(90,220,150,40);
        main_menu_frame.add(check_outButton);
        check_outButton.addActionListener(this);
    }

    public MainMenuGui(){
        main_menu_frame = new JFrame("Main Menu");
        main_menu_frame.setSize(300, 350);
        main_menu_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addResButton();
        addFindRoomsButton();
        addCheckInButton();
        addCheckOutButton();

        main_menu_frame.setLayout(null);
        main_menu_frame.getContentPane().setBackground(new Color(0, 119, 200));
        main_menu_frame.setVisible(true);

    }

    /**
     * Calls the appropriate constructors depending on what button is pressed.
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Reservation")){
            this.setVisible(false); // first frame is still open
            new ReservationSubMenuGui().setVisible(true);

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

