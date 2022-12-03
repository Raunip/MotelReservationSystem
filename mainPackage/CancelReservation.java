package mainPackage;// insert package name here

import javax.swing.*;
import java.io.File;

public class CancelReservation
{
    private String filename;


    public CancelReservation(String filename)
    {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
            JOptionPane.showMessageDialog(null,"Successfully cancelled reservation",filename,JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Failed to cancel reservation",filename,JOptionPane.INFORMATION_MESSAGE);
        }
    }

}