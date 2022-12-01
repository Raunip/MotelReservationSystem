package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModifyReservationGui implements ActionListener {

/**
 *
 * @author Raunip Patel
 */



    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Modify Reservation Submenu");

        JPanel panel = new JPanel();
        frame.setSize(350,300); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel first_name_label = new JLabel("First Name");
        first_name_label.setBounds(10,20,80,25);
        panel.add(first_name_label);

        //bounds ( x(left/right), y(up/down) , width , height )
        JTextField first_name_text = new JTextField();
        first_name_text.setBounds(170,20,140,25);
        panel.add(first_name_text);

        JLabel last_name_label = new JLabel("Last Name");
        last_name_label.setBounds(10,50,150,25);
        panel.add(last_name_label);

        JTextField last_name_text = new JTextField();
        last_name_text.setBounds(170,50,140,25);
        panel.add(last_name_text);

        JLabel check_in_date_label = new JLabel("Check In Date");
        check_in_date_label.setBounds(10,70,170,40);
        panel.add(check_in_date_label);

        JTextField checkInDateText = new JTextField();
        checkInDateText.setBounds(170, 80, 140, 25);
        panel.add(checkInDateText);

        JLabel check_out_date_label = new JLabel("Check Out Date");
        check_out_date_label.setBounds(10,100,170,40);
        panel.add(check_out_date_label);

        JTextField checkOutDateText = new JTextField();
        checkOutDateText.setBounds(170, 110, 140, 25);
        panel.add(checkOutDateText);


        JLabel room_type_label = new JLabel("Room Type");
        room_type_label.setBounds(10,140,190,25);
        panel.add(room_type_label);

        JTextField roomTypeText = new JTextField();
        roomTypeText.setBounds(170,140,140,25);
        panel.add(roomTypeText);

        JLabel room_rate_label = new JLabel("Room Rate");
        room_rate_label.setBounds(10,170,210,25);
        panel.add(room_rate_label);

        JTextField roomRateText = new JTextField();
        roomRateText.setBounds(170,170,140,25);
        panel.add(roomRateText);

        JLabel payment_method_label = new JLabel("Payment Method");
        payment_method_label.setBounds(10,200,240,25);
        panel.add(payment_method_label);

        JTextField paymentText = new JTextField();
        paymentText.setBounds(170,200,140,25);
        panel.add(paymentText);

        JButton button = new JButton("Back");
        button.setBounds(10,240,80,25);
        panel.add(button);

        button = new JButton("Reserve");
        button.setBounds(240,240,80,25);
        panel.add(button);

        JButton button1 = new JButton("Calendar");
        button1.setBounds(310,80,25,30);
        panel.add(button1);

        panel.setBackground(new Color(0, 119, 200));
        frame.setVisible(true);
    }




    //
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
