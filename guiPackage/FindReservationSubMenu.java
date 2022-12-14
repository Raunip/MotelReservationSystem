package guiPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import mainPackage.CancelReservation;
import mainPackage.CustomerInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Paths;

/**
 * Creates a new window with the necessary labels and text boxes to find an existing reservation
 * when the constructor is called.
 */
public class FindReservationSubMenu extends JFrame
{

    /**
     * Constructor for FindReservationSubmenu class.
     * @param filename Name of the file to search for.
     */
    public FindReservationSubMenu(String filename)
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

        CustomerInfo customerInfo = new CustomerInfo();
        try {
            // read the data from file
            ObjectMapper mapper = new ObjectMapper();
            customerInfo = mapper.readValue(Paths.get(filename).toFile(), CustomerInfo.class);

            System.out.print(filename);
            System.out.println(customerInfo.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.print(customerInfo.getFirstname());
        //bounds ( x(left/right), y(up/down) , width , height )
        JTextField fnameText = new JTextField();
        fnameText.setBounds(170,20,140,25);
        panel.add(fnameText);
        fnameText.setText(customerInfo.getFirstname());

        fnameText.setText(customerInfo.getFirstname());

        JLabel lnamelabel = new JLabel("Last Name");
        lnamelabel.setBounds(10,50,150,25);
        panel.add(lnamelabel);

        JTextField lnameText = new JTextField();
        lnameText.setBounds(170,50,140,25);
        panel.add(lnameText);
        lnameText.setText(customerInfo.getLastname());

        JLabel checkDatelabel = new JLabel("Check In Date");
        checkDatelabel.setBounds(10,70,170,40);
        panel.add(checkDatelabel);


        JTextField checkDateText = new JTextField();
        checkDateText.setBounds(170, 80, 140, 25);
        panel.add(checkDateText);
        checkDateText.setText(customerInfo.getCheck_In_Date());

        JLabel checkOutDatelabel = new JLabel("Check Out Date");
        checkOutDatelabel.setBounds(10,110,190,25);
        panel.add(checkOutDatelabel);


        JTextField checkOutDateText = new JTextField();
        checkOutDateText.setBounds(170, 110, 140, 25);
        panel.add(checkOutDateText);
        checkOutDateText.setText(customerInfo.getCheck_Out_Date());

        JLabel roomlabel = new JLabel("Room Type");
        roomlabel.setBounds(10,140,210,25);
        panel.add(roomlabel);


        JTextField roomText = new JTextField();
        roomText.setBounds(170,140,140,25);
        roomText.setText(customerInfo.getRoomType());
        panel.add(roomText);

        JLabel roomRatelabel = new JLabel("Room Rate");
        roomRatelabel.setBounds(10,170,240,25);
        panel.add(roomRatelabel);

        JTextField roomRateText = new JTextField();
        roomRateText.setBounds(170,170,140,25);
        roomRateText.setText(String.valueOf(customerInfo.getRoomRate()));
        panel.add(roomRateText);

        JLabel paymentlabel = new JLabel("Payment Method");
        paymentlabel.setBounds(10,200,270,25);
        panel.add(paymentlabel);

        JTextField paymentText = new JTextField();
        paymentText.setBounds(170,200,140,25);
        panel.add(paymentText);
        paymentText.setText(customerInfo.getPayment_Type());

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
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                CustomerInfo customerInfo1 = new CustomerInfo();
                customerInfo1.setFirstname(fnameText.getText());
                customerInfo1.setLastname(lnameText.getText());
                customerInfo1.setRoomType(roomText.getText());
                customerInfo1.setRoomRate(Integer.valueOf(roomRateText.getText()));
                customerInfo1.setPayment_Type(paymentText.getText());
                customerInfo1.setCheck_In_Date(checkDateText.getText());
                customerInfo1.setCheck_Out_Date(checkOutDateText.getText());
                int confNum =Integer.parseInt(filename.replaceAll("[^0-9]",""));
                customerInfo1.setConfirmation_Number(confNum);

                try{
                    ObjectMapper mapper = new ObjectMapper();
                    mapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get(filename).toFile(),customerInfo1);
                    JOptionPane.showMessageDialog(null,"Confirmation Number : "+confNum,"Successfully Modified" ,JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e1){
                    e1.printStackTrace();
                }
            }
        });

        JButton button2 = new JButton("Cancel Reservation");
        button2.setBounds(80,260,150,25);
        panel.add(button2);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new CancelReservation(filename);
                frame.setVisible(false);
            }
        });

        panel.setBackground(new Color(0, 119, 200));
        frame.setVisible(true);
    }





}
