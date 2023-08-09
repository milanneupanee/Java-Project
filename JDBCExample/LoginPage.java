package JDBCExample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginPage extends JFrame {
    JLabel UserName;
    JLabel PasswordLabel;
    JTextField userNameField;
    JTextField passwordField;
    JButton Btn;

    Connection connect;
    Statement stm;

    LoginPage() {
        DataHandle();

        setSize(400, 300);
        setTitle("Login Here !!");

        UserName = new JLabel("Enter UserName");
        UserName.setBounds(50, 50, 120, 20);
        add(UserName);

        userNameField = new JTextField();
        userNameField.setBounds(170, 50, 120, 20);
        add(userNameField);

        PasswordLabel = new JLabel("Enter Password");
        PasswordLabel.setBounds(50, 80, 120, 20);
        add(PasswordLabel);

        passwordField = new JTextField();
        passwordField.setBounds(170, 80, 120, 20);
        add(passwordField);

        Btn = new JButton("click button");
        Btn.setBounds(110, 120, 150, 20);
        add(Btn);

        Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RequirementCheck();
            }
        });

        setLayout(null);
        setVisible(true);
    }

    public void DataHandle() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            stm = connect.createStatement();
            System.out.println("connected .....");
            String cd_query = "create database if not exists test_db";

            stm.executeUpdate(cd_query);
            System.out.println("Database created.....");
            stm.addBatch("use test_db;");
            stm.executeBatch();

            String ct_query = "create table if not exists test_tbl1(username varchar(30), password varchar(30);)";
            stm.executeUpdate(ct_query);
            System.out.println("Table Created successfully..");
            stm.addBatch("insert into test_tbl1 values('milan','milan');");
            stm.executeBatch();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void RequirementCheck() {
        String username = userNameField.getText();
        String password = passwordField.getText();

        // Replace these with actual credentials from the database or some predefined values
        String validUsername = "UserName";
        String validPassword = "password";

        if (username.equals(validUsername) && password.equals(validPassword)) {
            showMessageDialog("Login Success");
        } else {
            showMessageDialog("Not Found");
        }
    }

    public void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}