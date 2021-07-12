package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;
            System.out.println(z);
        }
        catch(ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
        catch(InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            sc.close();
        }
    }
}
