import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";
}


public class JavaValidUsernameRegEx {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

// ^ represents that starting character of the string. [aA-zZ] makes sure that 
// the starting character is in the lowercase or uppercase alphabet. \\w{7,29} 
// represents a check to make sure that the remaining items are word items, 
// which includes the underscore, until it reaches the end and that is represented 
// with $. The {7,29} represents the 8-30 character constraint given to us minus 
// the predefined first character.