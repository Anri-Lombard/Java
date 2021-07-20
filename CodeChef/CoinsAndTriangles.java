import java.io.*;
import java.util.*;

class Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
    
        for (int i=0; i<testCases; i++) {
            int goldCoins = sc.nextInt();
            System.out.println(binarySearch(goldCoins));
        }
    }

    static int binarySearch(int n) {
        int layers = 0;
        int[] arr = new int[100];
        int i = 0;

        while (n>0) {
            arr[i] = i + 1;
            n -= arr[i];
            layers += 1;
            i += 1;
            if (n < 0)
                layers -= 1;
        }
        return layers;
    }
}