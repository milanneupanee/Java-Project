package FileReadWrite;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputExample {
    public static void main(String[] args) {
        try{
          FileOutputStream fos= new FileOutputStream("./input.txt");
          fos.write(45);
          fos.close();
        }
        catch (IOException e){
            System.err.println("Check the file");
        }
        try{
            FileInputStream fis=new FileInputStream("input.txt");
            int rf=fis.read();
            System.out.print(rf);
            fis.close();
        }
        catch (IOException e){
            System.out.println("Check the file"+e.getMessage());
        }
    }
}
