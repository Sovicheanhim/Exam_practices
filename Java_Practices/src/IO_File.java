import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO_File {
    public static void createFile(){
        try{
            File myObj = new File("text.txt");
            if(myObj.createNewFile()){
                System.out.println("File created " + myObj.getName());
            }else{
                System.out.println("File already existed");
            }
        }catch (IOException e){
            System.out.println("An error occurred " + e);
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
            FileWriter myWriter = new FileWriter("text.txt");
            myWriter.write("Hello World");
            System.out.println("File written");
            myWriter.close();
        }catch (IOException e){
            System.out.println("An error occurred " + e);
            e.printStackTrace();
        }
    }
    public static void readFile(){
        try{
            File myObj = new File("text.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (IOException e){
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
    }
    public static void filePath(){
        File myObj = new File("text.txt");
        if(myObj.exists()){
            System.out.println("File name : " + myObj.getName());
            System.out.println("Absolute path : " + myObj.getAbsolutePath());
            System.out.println("Writable : " + myObj.canWrite());
            System.out.println("Readable : " + myObj.canRead());
            System.out.println("File size : " + myObj.length());
        }else{
            System.out.println("The File doesn't exist");
        }
    }
    public static void main(String[] args) {
//        writeFile();
//        readFile();
        filePath();
    }
}
