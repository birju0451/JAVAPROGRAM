package FILE_HANDLINF;
import java.io.FileInputStream;
import java.io.IOException;

public class fileinputstream2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            //secify the file path 
            fis = new FileInputStream("input.txt");

            System.out.println("file content:");
            //read the file byte by byte 
            int content;
            while ((content = fis.read())!=-1) {
                //convert byte to char and display it
                System.err.print((char)content);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
