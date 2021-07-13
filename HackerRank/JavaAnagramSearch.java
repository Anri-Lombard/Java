import java.util.HashMap;
import java.util.*;

public class JavaAnagramSearch {
        // static boolean isAnagram(String a, String b) {

        // // test for invalid input   
        // if( a == null || b == null || a.equals("") || b.equals("") )
        //     throw new IllegalArgumentException();
        
        // // initial quick test for non-anagrams
        // if ( a.length() != b.length() )
        //     return false;
        
        // a = a.toLowerCase();
        // b = b.toLowerCase();
        
        // // populate a map with letters and frequencies of String b
        // Map<Character, Integer> map = new HashMap<>();
        
        // for (int k = 0; k < b.length(); k++){
        //     char letter = b.charAt(k);    
        
        //     if( ! map.containsKey(letter)){
        //         map.put( letter, 1 );
        //     } else {
        //         Integer frequency = map.get( letter );
        //         map.put( letter, ++frequency );
        //     }
        // }
        
        // // test each letter in String a against data in the map
        // // return if letter is absent in the map or its  frequency is 0
        // // otherwise decrease the frequency by 1
        
        // for (int k = 0; k < a.length(); k++){
        //     char letter = a.charAt(k);
        
        //     if( ! map.containsKey( letter ) )
        //         return false;
        
 

    static boolean isAnagram(String s1, String s2) {
        // Complete the function
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())

        {
            int[] a = new int[256];
            int[] b = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                a[(int) s1.charAt(i)] += 1;
                b[(int) s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a[i] != b[i])
                    return false;

            }
            return true;
        }
        else
        {
            return false;
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
