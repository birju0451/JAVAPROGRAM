package FILE_HANDLINF;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        FileWriter writer = null;
        String data = "This is a sample text written using FileWriter with finally.";

        try {
            // Create a FileWriter object to write character data to a file
            writer = new FileWriter("output1.txt",true);//append mode

            // Write the string data to the file
            writer.write(data);

            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // The finally block is used to close the FileWriter, whether or not an exception occurred
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
