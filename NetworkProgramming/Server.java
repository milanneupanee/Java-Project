package NetworkProgramming;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
* This program is for server site.
* */

public class Server {
    public static void main(String[] args) {
        try{
            int port=3307;
            ServerSocket ss=new ServerSocket(port);
            System.out.println("Server running at:"+port);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=dis.readUTF();
            System.out.println("Message"+str);
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
