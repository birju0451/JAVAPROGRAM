package FILE_HANDLINF;

import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 
FileOutputStream is a Java class used to write binary data to a file. It is part of the java.io package and can be used for writing bytes to a file. Here's a simple example of how to use FileOutputStream:
 */
public class fileoutputstream {
    public static void main(String[] args) {
        String data = "Hello, this is a sample text.";

        try {
            // Create a FileOutputStream object to write data to a file
            FileOutputStream fos = new FileOutputStream("output.txt");

            // Convert the string into bytes
            byte[] bytesArray = data.getBytes();

            // Write the bytes to the file
            fos.write(bytesArray);

            // Close the file output stream
            fos.close();

            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
/*
 * Key Points
File Creation: If the specified file doesn't exist, '''FileOutputStream''' creates a ne file.
Writing Data: You can write data as bytes using the ''write()'' method.
Closing the Stream: Always close the stream after writing to ensure the data is properly saved and resources are released.
 */