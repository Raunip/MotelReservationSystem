package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FindReservation extends JFrame
{
    JLabel name_label;
    JLabel conf_num_label;
    JTextField name_textField;
    JTextField conf_num_texField;
    JButton back_button;
   JButton find_button;
   JFrame frame = new JFrame("Find Reservation");


    public FindReservation()
    {
     frame.setSize(350,160);
     //frame.getContentPane().setBackground(new Color(0, 119, 200));
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     JPanel panel = new JPanel();



     name_label = new JLabel("Name");
     name_label.setBounds(10,20,80,25);
     panel.add(name_label);

     conf_num_label = new JLabel("Confirmation Number");
     conf_num_label.setBounds(10,50,150,25);
     panel.add(conf_num_label);

     name_textField = new JTextField();
     name_textField.setBounds(170,20,140,25);
     panel.add(name_textField);

     conf_num_texField = new JTextField();
     conf_num_texField.setBounds(170,50,140,25);
     panel.add(conf_num_texField);

     back_button = new JButton("Back");
     back_button.setBounds(10,80,80,25);
     back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
     panel.add(back_button);

     find_button = new JButton("Find");
     find_button.setBounds(190,80,80,25);
     panel.add(find_button);
     find_button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             String confirmation = new String(conf_num_texField.getText());
             String filename = confirmation.concat(".json");
             mainPackage.FindReservation findReservation = new mainPackage.FindReservation(filename);
             findReservation.setFilenname(filename);
             frame.setVisible(false);
             new FindReservationSubMenu(filename).setVisible(true);

         }
     });

     frame.add(panel);


      //RGB code for background

        panel.setLayout(null);

        panel.setBackground(new Color(0, 119, 200));
        frame.setVisible(true);


    }
    public static void  main(String[] args) {


       new FindReservation();

    }



}