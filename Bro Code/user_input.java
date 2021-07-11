import java.util.*;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you name?");
        String name = scanner.nextLine();

        System.out.println("How old are you");
        int age = scanner.nextInt();

        scanner.close();
        System.out.println(name + " " + age);

        // nextLine
        // can read from files
    }
}
