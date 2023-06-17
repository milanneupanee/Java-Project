package Lab6FileHandling;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferIOStream {
    public static void main(String[] args) {
        try{
            File file=new File("./hello.txt");
            FileOutputStream f_out=new FileOutputStream(file);
            BufferedOutputStream b_out=new BufferedOutputStream(f_out);
            String str="Hello from Milan Neupane.";
            b_out.write(str.getBytes());
            b_out.write(60);
            //float floatValue= 3.14F;
           // b_out.write(floatValue);
            b_out.flush();
            b_out.close();
            f_out.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
