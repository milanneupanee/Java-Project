package FileReadWrite;
import java.io.*;

class UserDetails implements Serializable{
    int uid;
    String user_name,user_address;
    /*
    *Only instance variable can be written in the file.
    **/
    UserDetails(int uid,String user_name,String user_address){
        this.uid=uid;
        this.user_name=user_name;
        this.user_address=user_address;
    }
}
public class ObjectStream {
    public static void main(String[] args) {
        UserDetails ud=new UserDetails(1, "Milan", "Kathmandu");
        String FileName="./UserRegistration.txt";
        try{
            OutputStream io=new FileOutputStream(FileName);
            ObjectOutputStream oos=new ObjectOutputStream(io);
            oos.writeObject(ud);
            oos.flush();
            oos.close();
            io.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            FileInputStream is= new FileInputStream("./UserRegistration.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(is);
                UserDetails readUser=(UserDetails)objectInputStream.readObject();
                System.out.println("Uid\tName\tAddress");
                System.out.println(readUser.uid+"\t"+readUser.user_name+"\t"+readUser.user_address);
                is.close();


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
