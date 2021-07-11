import java.util.*;

public class random_numbers {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(7); // Between 1 and 6
        // nextDouble, nextBoolean

        System.out.println(x);

        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
