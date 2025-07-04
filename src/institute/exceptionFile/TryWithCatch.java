package institute.exceptionFile;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.lang.NullPointerException;

public class TryWithCatch {
    public static void main(String[] args) {
        String filePath = "C:/Users/adith/IdeaProjects/NewFile.txt";
        BufferedReader reader = null;                      //ExceptionHandling(1)
        try {                                              //NewFile.txt
            reader = new BufferedReader(new FileReader(filePath));//
            String line;
            while ((line = reader.readLine()) == null) {
                System.out.println("Read Line :" + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+e.getMessage());
        } catch (IOException ioe) {
            System.out.println("I/O error: "+ioe.getMessage());
        } catch (java.lang.NullPointerException e) {
            System.out.println("Null value encountered"+e.getMessage());
        } finally {
            System.out.println("File handling Completed");

        }
    }
}


