
package JDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbsConnecctionExample {
    private Connection con;
    private Statement stm;
    JdbsConnecctionExample(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");//register driver

            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
        
        System.out.println("successful.....");
        
       /* String query="create database IF NOT EXISTS it_b_java";
        String t_query="create database IF NOT EXISTS it_b_tbl1(ID int(6) PRIMARY KEY NOT NULL AUTO INCREMENT,Name varchar(50),Email varchar(500))";
        stm=con.createStatement();
       /* stm.executeQuery(query);
  */

        }catch(Exception e){
        System.out.println(e);
    }
            }
    public static void main(String[] args) {
      new JdbsConnecctionExample();
    }
    
}
