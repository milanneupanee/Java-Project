package FileReadWrite;
import java.io.*;
import java.nio.file.FileVisitResult;

public class BufferedIOStream {
    public static void main(String[] args) {
        File file= new File("./input.txt");
        try{
            FileOutputStream f_out=new FileOutputStream(file);
            BufferedOutputStream bout=new BufferedOutputStream(f_out);
            String str="Buffered Output stream is used with stream classes.";
            bout.write(str.getBytes());
            bout.flush();
            bout.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            FileReader fin=new FileReader("./input.txt");
            BufferedReader bin=new BufferedReader(fin);
            /*
            * Initially it allocate the size of 2^13=8192 byte=8kb byte of memory as a buffer memory.
            * It can be increase or decrease as a user choice.
            * */
            //System.out.println(bin.available());
            /*
            * read() will read in ascii value. So we need to change it into char.
            * */
            System.out.println(bin.read());
            System.out.println((char)bin.read());
            /*
            * Creating the loop to print all the character.
            * */
            String content;
            while(( content =bin.readLine()) != null){
               String[] abc= content.split(",");

                System.out.println((abc[0]));
            }
            /*
            * Here it will miss the first two char. As it is already printed in line 29 and 30.
            * */
            bin.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
