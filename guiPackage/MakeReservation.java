package guiPackage;
import com.fasterxml.jackson.databind.ObjectMapper;
import mainPackage.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Paths;



/*//////////
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarakhouri
 */
 public class MakeReservation extends JFrame
{


    public MakeReservation()
    {
        JFrame frame = new JFrame("Make Reservation Submenu");

        JPanel panel = new JPanel();
        frame.setSize(350,460); //window size
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

        JLabel roomlabel = new JLabel("Room Type");
        roomlabel.setBounds(10,80,210,25);
        panel.add(roomlabel);

        JTextField roomText = new JTextField();
        roomText.setBounds(170,80,140,25);
        panel.add(roomText);

        JLabel roomRatelabel = new JLabel("Room Rate");
        roomRatelabel.setBounds(10,110,210,25);
        panel.add(roomRatelabel);

        JTextField roomRateText = new JTextField();
        roomRateText.setBounds(170,110,140,25);
        panel.add(roomRateText);

        JLabel paymentlabel = new JLabel("Payment Method");
        paymentlabel.setBounds(10,140,240,25);
        panel.add(paymentlabel);

        JTextField paymentText = new JTextField();
        paymentText.setBounds(170,140,140,25);
        panel.add(paymentText);

        JLabel checkMonthlabel = new JLabel("Check In Month");
        checkMonthlabel.setBounds(10,170,170,40);
        panel.add(checkMonthlabel);

        JTextField checkMonthText = new JTextField();
        checkMonthText.setBounds(170, 170, 140, 25);
        panel.add(checkMonthText);

        JLabel checkDaylabel = new JLabel("Check In Day");
        checkDaylabel.setBounds(10,200,190,40);
            panel.add(checkDaylabel);

        JTextField checkDateText = new JTextField();
        checkDateText.setBounds(170, 200, 140, 25);
        panel.add(checkDateText);

        JLabel checkYearlabel = new JLabel("Check In Year");
        checkYearlabel.setBounds(10,230,190,40);
        panel.add(checkYearlabel);

        JTextField checkYearText = new JTextField();
        checkYearText.setBounds(170, 230, 140, 25);
        panel.add(checkYearText);

        JLabel checkOutMonthlabel = new JLabel("Check Out Month");
        checkOutMonthlabel.setBounds(10,260,190,40);
        panel.add(checkOutMonthlabel);

        JTextField checkOutMonthText = new JTextField();
        checkOutMonthText.setBounds(170, 260, 140, 25);
        panel.add(checkOutMonthText);

        JLabel checkOutDaylabel = new JLabel("Check Out Day");
        checkOutDaylabel.setBounds(10,290,190,40);
        panel.add(checkOutDaylabel);

        JTextField checkOutDayText = new JTextField();
        checkOutDayText.setBounds(170, 290, 140, 25);
        panel.add(checkOutDayText);

        JLabel checkOutYearlabel = new JLabel("Check Out Year");
        checkOutYearlabel.setBounds(10,310,190,40);
        panel.add(checkOutYearlabel);

        JTextField checkOutYearText = new JTextField();
        checkOutYearText.setBounds(170, 320, 140, 25);
        panel.add(checkOutYearText);

        JLabel confirmlabel = new JLabel("Confirmation T/F ");
        confirmlabel.setBounds(10,340,190,40);
        panel.add(confirmlabel);

        JTextField confirmText = new JTextField();
        confirmText.setBounds(170, 350, 140, 25);
        panel.add(confirmText);

        JButton button = new JButton("Back");
        button.setBounds(10,380,80,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        panel.add(button);

        button = new JButton("Reserve");
        button.setBounds(240,380,80,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean value = Boolean.parseBoolean(confirmText.getText());
                mainPackage.MakeReservation makeReservation = new mainPackage.MakeReservation(fnameText.getText(),
                        lnameText.getText(),roomText.getText(),Integer.valueOf(roomRateText.getText()),paymentText.getText(),
                        Integer.valueOf(checkMonthText.getText()),Integer.valueOf(checkDateText.getText()),
                        Integer.valueOf(checkYearText.getText()),
                        Integer.valueOf(checkOutMonthText.getText()),Integer.valueOf(checkOutDayText.getText()),
                        Integer.valueOf(checkOutYearText.getText()),value);
                ReservationManager reservationManager = new ReservationManager();
                reservationManager.setReservation_info(makeReservation );
                String filename = String.valueOf(makeReservation.getConfirmation_num());
                String jsonfile = filename.concat(".json");
                try {

                    ObjectMapper mapper = new ObjectMapper();

                    mapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get(jsonfile).toFile(), reservationManager.getReservation_info());
                } catch (Exception ex) {
                    ex.printStackTrace();
        }
                frame.setVisible(false);
                JFrame fr = new JFrame();
                fr.setSize(100,100);
                JPanel pnl = new JPanel();
                JLabel lbl = new JLabel("Reservation Successful.");
                pnl.add(lbl);
            }
        });
        panel.add(button);

        panel.setBackground(new Color(0, 119, 200));
        frame.setVisible(true);
    }

    public static void  main(String[] args) {


        new MakeReservation();

    }


}
