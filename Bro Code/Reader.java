import java.util.*;
import java.io.*;

public class Reader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.println((char)data);
                data = reader.read();
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
