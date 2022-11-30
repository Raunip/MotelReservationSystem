package guiPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResrvationSubMenuGui extends JFrame {
    private static final String make_res = "Make Reservation";
    private static final String find_res = "Find Reservation";

    private  static final  String back = "Back";

    static JFrame res_sub_menuFrame;

    public ResrvationSubMenuGui(){
        res_sub_menuFrame = new JFrame("Reservation Sub Menu");
        res_sub_menuFrame.setSize(350, 250);
        res_sub_menuFrame.setLayout(null);

        JButton make_resButton = new JButton(make_res);
        make_resButton.setBounds(90, 40, 150, 40);
        make_resButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FindReservation().setVisible(true);
            }
        });

        JButton find_resButton = new JButton(find_res);
        find_resButton.setBounds(90,100,150,40);
        find_resButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FindReservation().setVisible(true);
            }
        });

        JButton back_button = new JButton(back);
        back_button.setBounds(20,150,100,40);
        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res_sub_menuFrame.setVisible(false);
            }
        });

        res_sub_menuFrame.add(make_resButton);
        res_sub_menuFrame.add(find_resButton);
        res_sub_menuFrame.add(back_button);
        res_sub_menuFrame.setBackground(new Color(0,119,200));
        res_sub_menuFrame.setVisible(true);
        res_sub_menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
