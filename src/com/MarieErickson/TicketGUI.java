package com.MarieErickson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nc0614dn on 11/1/2016.
 */
public class TicketGUI extends JFrame{
    private JPanel rootPanel;
    private JComboBox comboBox1;
    private JList ticketJList;
    private JButton addButton;
    private JButton deleteButton;
    private JTextField dataEnter;
    private JLabel label2;


    public TicketGUI() {
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        if (comboBox1.equals ("\"1. Enter Ticket\"")) {
            label2.setText("Enter Problem, Enter Who Reported the problem, and Priority.");
        }
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredData = dataEnter.getText();

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
