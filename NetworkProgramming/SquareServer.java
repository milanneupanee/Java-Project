package NetworkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class SquareServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(6000);
            System.out.println("Server is running at port 6000");

            Socket s=ss.accept();
            System.out.println("Connection request accepted.");

            DataInputStream dis=new DataInputStream(s.getInputStream());

            DataOutputStream dos=new DataOutputStream(s.getOutputStream());

            int num= dis.readInt();
            int sq_num=num*num;
            dos.writeInt(sq_num);
            System.out.println("The request for square number is responded.");
            dis.close();
            dos.close();
            ss.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
