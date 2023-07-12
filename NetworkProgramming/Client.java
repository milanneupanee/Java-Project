package NetworkProgramming;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("127.0.1.1",3307);
            System.out.println("Connected Successfully.");
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Message from Milan.");
            dout.flush();
            dout.close();
            s.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
