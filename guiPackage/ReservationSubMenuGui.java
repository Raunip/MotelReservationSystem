package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationSubMenuGui {
    private static final String make_res = "Make Reservation";
    private static final String find_res = "Find Reservation";

    private  static final  String back = "Back";

    public boolean visible;

    public ReservationSubMenuGui (){
        JFrame frame = new JFrame("Reservation Sub Menu");
        frame.setSize(350, 250);
        frame.setLayout(null);

        JButton make_resButton = new JButton(make_res);
        make_resButton.setBounds(90, 40, 150, 40);
        make_resButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MakeReservation().setVisible(true);
            }
        });


        JButton find_resButton = new JButton(find_res);
        find_resButton.setBounds(90,100,150,40);

        find_resButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new FindReservation().setVisible(true);
            }
        });


        JButton back_button = new JButton(back);
        back_button.setBounds(20,150,100,40);

        frame.add(make_resButton);
        frame.add(find_resButton);
        frame.add(back_button);
        frame.getContentPane().setBackground(new Color(0,119,200));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
}
