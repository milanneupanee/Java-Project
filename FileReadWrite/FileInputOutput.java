package FileReadWrite;
import java.io.FileInputStream;
import  java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {
    public static void main(String[] args) {
        try{
            FileOutputStream fos= new FileOutputStream("./Hello.txt");
            String str="Hello, My name is Milan Neupane.";
            byte bt[]=str.getBytes();
            fos.write(bt);
            fos.close();
        }
        catch (IOException e){
            System.err.println("Check the file");
        }
        try{
            FileInputStream fis =new FileInputStream("./Hello.txt");
            int rf=0;
            while((rf=fis.read())!=-1){
                System.out.print((char)rf);
            }
            fis.close();
        }
        catch (IOException e){
            System.out.println("File not found"+e.getMessage());
        }
    }
}
