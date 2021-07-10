import java.util.Scanner;
import java.io.*;
import java.util.*;

public class example1 {
    public static void main(String[] args) {
        int ax = 0; int ay = 0;
        int bx = r; int by = s;
        int t = 0;
    
        while (ax < bx && ay < by) {
            ax += m; ay += n;
            bx -= p; by -= q;
            t++;
        }
    
        if (ax == bx && ay == by) {
            out.println(t);
        } else {
            out.println(-1);
        }
    
        out.close();
    }
}
