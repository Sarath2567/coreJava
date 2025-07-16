package institute.fileIO;
import java.io.*;
public class ByteStream {
    public static void main(String[] args) {
//        if(file.exists()){
//            System.out.println(file.getName());
//            System.out.println(file.canRead());
//            System.out.println(file.canWrite());
//            System.out.println(file.getAbsolutePath());
//        }
        try{
            File file=new File("C:\\Users\\adith\\IdeaProjects\\NewFile.txt");
            System.out.println(file.createNewFile());
            boolean exist= file.exists();
            boolean isCreated=file.createNewFile();
            boolean canRead=file.canRead();
            boolean canWrite=file.canWrite();
            String name= file.getName();
            System.out.println("File Exists: "+exist);
            System.out.println("File Created: "+isCreated);
            System.out.println("Can Read: "+canRead);
            System.out.println("Can Write: "+canWrite);
            System.out.println("File Name: "+name);
            System.out.println("------------------");
//            FileOutputStream fo=new FileOutputStream(file);

            FileWriter fo=new FileWriter(file);
            fo.write("New Assignment :");
            fo.write(" File Assignment Practice");
            String content ="Writing String";
           // fo.write(content);
           // System.out.println(content.getBytes());
            fo.close();
            System.out.println("Write Completed");

            //FileInputStream fi=new FileInputStream(file);
            System.out.println("----------------------");
            FileReader fi=new FileReader(file);
            int byteDataFile;
            while((byteDataFile=fi.read())!=-1){
                System.out.print((char)byteDataFile);
            }fi.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


