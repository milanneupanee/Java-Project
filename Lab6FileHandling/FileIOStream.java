package Lab6FileHandling;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class FileIOStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("./SampleFile.txt");
            fos.write(59);
            String name="Hello from Milan Neupane";
            byte[] bt =name.getBytes();
            /*
            * We should make array to write a string in it.
            * */
            fos.write(bt);
            fos.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            FileInputStream fis=new FileInputStream("./SampleFile.txt");
            int a=fis.read();
            System.out.println(a);
            int b;
            while ((b= fis.read())!=-1){
                System.out.print((char)b);
            }
            fis.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
