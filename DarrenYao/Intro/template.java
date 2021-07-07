import java.io.*;
import java.util.*;

public class template {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokeneizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokeneizer = null;
        }

        String next() {
            while (tokeneizer == null || !tokeneizer.hasMoreTokens()) {
                try {
                    tokeneizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokeneizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public long NextLong() {
            return Long.parseLong(next());
        }

        public double NextDouble() {
            return Double.parseDouble(next());
        }
    }
    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new FileReader("template.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("template.out")));

        // StringTokenizer st = new StringTokenizer(r.readLine());
        // int n = Integer.parseInt(st.nextToken());

        r.close();
        pw.close();
    }
}