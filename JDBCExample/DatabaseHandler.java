package JDBCExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseHandler implements ActionListener {
    Connection connect;
    Statement stm;
    ResultSet resultSet;
    ApplicationFrame af;

    public DatabaseHandler(ApplicationFrame af){
        this.af=af;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        connectDatabase();
        int getid;
        try {
            String name = af.nameField.getText();
            String adrs = af.addressField.getText();
            String email = af.emailField.getText();

            if (ae.getSource().equals(af.insert)) {
                String query = "INSERT INTO it_4th_student(name, address, email) VALUES ('Ram','Kathmandu','ram@gmail.com')";
                stm.executeUpdate(query);
                System.out.println("I am loading.");
            }
            if (ae.getSource().equals(af.read)) {
                getid = Integer.parseInt(af.idField.getText());
                String query = "SELECT * FROM it_4th_student WHERE id=" + getid;
                resultSet = stm.executeQuery(query);
                while (resultSet.next()) {
                    String s_name = resultSet.getString("name");
                    String s_address = resultSet.getString("address");
                    String s_email = resultSet.getString("email");

                    String record = "Name" + s_name + "\nAddress:" + s_address + "\nEmail:" + s_email;
                    af.result.setText(record);
                    connect.close();
                }
            }
            if (ae.getSource().equals(af.update)) {
                getid = Integer.parseInt(af.idField.getText());
                String upName = JOptionPane.showInputDialog("Updated Name:");
                String upAdrs = JOptionPane.showInputDialog("Updated Address:");
                String upEmail = JOptionPane.showInputDialog("Updated Email:");
                String query = "UPDATE it_4th_student SET name='" + upName + "', email='" + upEmail + "' WHERE id=" + getid;
                stm.executeUpdate(query);
                af.result.setText("One record updated with name " + upName);
                connect.close();
            }
            if(ae.getSource().equals(af.delete)){
                getid = Integer.parseInt(af.idField.getText());
                String query = "DELETE FROM it_4th_student WHERE id=" + getid;
                stm.executeUpdate(query);
                af.result.setText("Record with id:"+getid+" deleted .");
                connect.close();
            }
        }
        catch(Exception e){
                e.printStackTrace();
            }

        }


    private void connectDatabase() {
        try{

            String url = "jdbc:mysql://localhost:3306/milandb";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url,user,password);
            stm = connect.createStatement();

            if(connect != null){
                System.out.println("Database connection success ...");
            }
            connect.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }

