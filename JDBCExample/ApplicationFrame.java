package JDBCExample;

import javax.swing.*;
import java.awt.*;

public class ApplicationFrame extends JFrame {
    JPanel recordInsertPanel,recordUpdatePanel;
    JLabel nameLabel,addressLabel,emailLabel,idLabel;
    JTextArea result;
    JTextField nameField,addressField,emailField,idField;
    JButton insert,update,delete,read;
    public ApplicationFrame(){
        recordInsertPanel=new JPanel();

        nameLabel=new JLabel("Insert Student Name:");
        nameLabel.setBounds(20,50,160,30);
        recordInsertPanel.add(nameLabel);

        nameField=new JTextField();
        nameField.setBounds(190,50,160,30);
        recordInsertPanel.add(nameField);

        addressLabel=new JLabel("Enter student address:");
        addressLabel.setBounds(20,90,160,30);
        recordInsertPanel.add(addressLabel);

        addressField=new JTextField();
        addressField.setBounds(190,90,160,30);
        recordInsertPanel.add(addressField);

        emailLabel=new JLabel("Insert Student Email:");
        emailLabel.setBounds(20,130,160,30);
        recordInsertPanel.add(emailLabel);

        emailField=new JTextField();
        emailField.setBounds(190,130,160,30);
        recordInsertPanel.add(emailField);

        insert=new JButton("Save");
        insert.setBounds(120,170,80,30);
        recordInsertPanel.add(insert);

        recordInsertPanel.setBackground(Color.orange);
        recordInsertPanel.setLayout(null);
        add(recordInsertPanel);

        recordUpdatePanel=new JPanel();
        idLabel=new JLabel("Enter record id to be updated:");

        idLabel.setBounds(20,50,180,30);
        recordUpdatePanel.add(idLabel);

        idField=new JTextField();
        idField.setBounds(210,50,80,30);
        recordUpdatePanel.add(idField);

        read=new JButton("Read");
        read.setBounds(20,90,80,30);
        recordUpdatePanel.add(read);

        update=new JButton("Update");
        update.setBounds(110,90,80,30);
        recordUpdatePanel.add(update);

        delete=new JButton("Delete");
        delete.setBounds(200,90,80,30);
        recordUpdatePanel.add(delete);

        recordUpdatePanel.setBackground(Color.pink);
        recordUpdatePanel.setLayout(null);
        add(recordUpdatePanel);

        result=new JTextArea("Result here");
        result.setBounds(20,130,300,50);
        result.setEditable(false);
        recordUpdatePanel.add(result);

        DatabaseHandler handler =new DatabaseHandler(this);
        insert.addActionListener(handler);
        read.addActionListener(handler);
        update.addActionListener(handler);
        delete.addActionListener(handler);

        setTitle("CRUD handler");
        setSize(800,360);
        setLayout(new GridLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
