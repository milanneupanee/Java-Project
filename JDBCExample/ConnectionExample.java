package JDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionExample {
    ConnectionExample(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
            System.out.println("Success");
            String query="Create database if not exists new_database";
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            String s="Use  new_database;";
            stm.executeUpdate(s);
            String t_query="create table if not exists table1(no int,name varchar(30));";
            stm.executeUpdate(t_query);
            stm.addBatch("insert into table1 values(1,'Milan');");
            stm.executeBatch();
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ConnectionExample();
    }
}
