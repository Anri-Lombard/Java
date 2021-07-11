public class wrapper {
    public static void main(String[] args) {
        // wrapper class = provides a way to use primitive data
        // types as reference data types. Reference data types
        // contain usefull methods

        // primitive   // wrapper
        // ---------   // ---------
        // boolean     // Boolean
        // char        // Char
        // int         // Int
        // double      // Double

        // autoboxing = the conversion that Java compiler makes
        // from primitive types to the wrapper class.
        // unboxing = reverse autoboxing.

        Boolean a = true;
        Character b = '@';
        Integer x = 123;
        Double d = 3.14;
        String e = "Bro";

        System.out.println(a);
    }
}
