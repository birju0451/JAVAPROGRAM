package FILE_HANDLINF;
import java.io.*;
public class fileoutputstream1 {
    public static void main(String[] args) throws IOException{
        //String data="hi am birju kumar and from bihar ,muzaffarput and here i am parsuing may degree Be Cse and that is my instruction that se";

        FileOutputStream ofile=null;
        byte[] bytesArray={'a','b','c'};
        try{
            //specify the file path
            ofile=new FileOutputStream("outpu.txt");

            ofile.write(bytesArray);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            ofile.close();
            System.out.println("file sucessfully close.");
        }
    }
}
