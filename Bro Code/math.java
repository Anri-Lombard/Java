import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        System.out.println(z);
        System.out.println(Math.round(x));
        System.out.println(Math.floor(x));

        // Hypoteneus
        double a, b, c;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        
        z = Math.sqrt(a*a + b*b);

        System.out.println(z);

        sc.close();
    }
}
