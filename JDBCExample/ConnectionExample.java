package JDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionExample {
    private Connection con;
    private Statement stm;
    ConnectionExample(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            System.out.println("Success");
            String query="Create database new_database";
            stm= con.createStatement();
            stm.executeUpdate(query);
            String t_query="create table if not exists table1(no int,name varchar(30));";
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new ConnectionExample();
    }
}
