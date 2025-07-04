package institute.exceptionFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class throwsBlock {
    static void readFile(String filename)throws IOException,FileNotFoundException,Exception{
        BufferedReader reader =new BufferedReader(new FileReader(filename));
        String line;
        while((line=reader.readLine())!=null){
            System.out.println("Read Line: "+line);
        }reader.close();
    }
    public static void main(String[] args) throws FileNotFoundException{
        String filepath="C:/Users/adith/IdeaProjects/ExceptionHandling (1).txt";
        try{
            readFile(filepath);
        }catch(Exception e){
            e.printStackTrace();
        }
       // FileReader fr=new FileReader("ExceptionHandling (1).txt");
    }
}
