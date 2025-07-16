package institute.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pra1 {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "example.txt";

        // Create a File object
        File file = new File(fileName);

        try {
            boolean isCreated = file.createNewFile(); // creates new file if it doesn't exist
            System.out.println("File Created: " + isCreated);

            // Check if file exists

            boolean exists = file.exists();

            System.out.println("File Exists: " + exists);

            // Check read permission

            boolean canRead = file.canRead();

            System.out.println("Can Read: " + canRead);

            // Check write permission

            boolean canWrite = file.canWrite();

            System.out.println("Can Write: " + canWrite);
            // Get file name

            String name = file.getName();

            System.out.println("File Name: " + name);
            // Write to the file using FileOutputStream (Byte Stream)
            FileOutputStream fos = new FileOutputStream(file);
            String content = "Hello from Byte Stream!";
            fos.write(content.getBytes()); // Convert string to byte array
            fos.close();
            System.out.println("Write Complete ");

            // Read from the file using FileInputStream
            FileInputStream fis = new FileInputStream(file);
            int i;
            System.out.print("File Content: ");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i); // Convert byte to char
            }
            fis.close();
            System.out.println("\nRead Complete");

            boolean isDeleted = file.delete();
            System.out.println("File Deleted: " + isDeleted);

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
