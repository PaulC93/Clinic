package client;

import javax.swing.*;

/**
 * Created by Paul on 02/05/2015.
 */
public class Notification extends Observer{

    private int doctorID;

    public Notification()
    {};

    public Notification(int doctorID) {
        this.doctorID=doctorID;
    }

    /**
     * Shows an informative message
     * @param s the string containing the message to be showed
     */
    private void showMessage(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    @Override
    public String update()
    {
        return "Updated";
    }

    public void update(int doctorID, String patientName, long patientPNC) {
        if (this.doctorID==doctorID) showMessage("Patient "+patientName+" with PNC "+patientPNC+" has arrived");
        System.out.println("Notified");

    }
}


