package NetworkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SquareClient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Socket s=new Socket("localhost",6000);
            System.out.println("Server Connected");
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            DataInputStream dis=new DataInputStream(s.getInputStream());
            System.out.println("Enter any number:");
            int num=sc.nextInt();
            dos.writeInt(num);
            int sn=dis.readInt();
            System.out.println("Square of given number is: "+sn);
            dos.close();
            dis.close();
            s.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
