package FileReadWrite;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class PrimitiveDataToFile {
    public static void main(String[] args) {
        try{
            FileOutputStream f_out=new FileOutputStream("./primitive.txt");
            DataOutputStream d_out=new DataOutputStream(f_out);
            d_out.writeInt(33);
            d_out.writeUTF("Hello Developers...");
            d_out.close();
            f_out.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            FileInputStream f_in=new FileInputStream("./primitive.txt");
            DataInputStream d_in=new DataInputStream(f_in);
            int num=d_in.readInt();
            String str=d_in.readUTF();
            System.out.println(num+" "+str);
            d_in.close();
            f_in.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
