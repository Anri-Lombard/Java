import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are blue");
            writer.append("Anri Lombard");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
