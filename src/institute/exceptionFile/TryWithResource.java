package institute.exceptionFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResource {
    public static void main(String[] args) {
        String filepath = "C:/Users/adith/IdeaProjects/ExceptionHandling (1).txt";
    try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
        String line;
        while((line=reader.readLine())!=null){
            System.out.println("Read line :"+line);
        }
        reader.close(); //optional
    }catch(IOException ioe){
        System.out.println(ioe);
    }
    }
}