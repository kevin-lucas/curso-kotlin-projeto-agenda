package ui;

import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemoveContact;
    private JTable tableContacts;

    public MainForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);
    }
}
