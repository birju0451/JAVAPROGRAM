package FILE_HANDLINF;
import java.io.*;
/*
 * FileOutputStream is a Java class used to write binary data to a file. It is part of the java.io package and can be used for writing bytes to a file. Here's a simple example of how to use FileOutputStream:
 */
public class fileinputstream1 {
    public static void main(String[] args) throws IOException {
        FileInputStream infile=null;//create an object for taking the input from file
        try{
            //file file path giving to the infile object 
            infile =new FileInputStream("input.txt");

            //create a varible to take a byte from the read() function 
            int content;
            while ((content=infile.read())!=-1) {
                System.out.print((char)content);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            infile.close();
        }
    }
}
/*
 * Key Points
File Creation: If the specified file doesn't exist, FileOutputStream creates a new file.
Writing Data: You can write data as bytes using the write() method.
Closing the Stream: Always close the stream after writing to ensure the data is properly saved and resources are released.
 */