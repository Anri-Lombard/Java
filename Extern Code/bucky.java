import java.util.*;

public class bucky {
    public static void main(String[] args) {
        String[] words = {"funk", "chunk", "furry", "baconator"};

        // Loop
        for (String w: words) {
            if (w.startsWith("fu")){
                System.out.println(w + " ends with unk or urry");
            }
        }

        // IndexOf 
        String s = "buckyrobersbuckyroberts";
        System.out.println(s.indexOf("rob"));

        // Strings
        String a = "Bacon";
        String b = " Monster";
        System.out.println(a + b);
        System.out.println(a.concat(b));

        System.out.println(a.replace("B", "F"));

        System.out.println(b.toUpperCase());
        System.out.println(b.trim());

        // Recursion
        System.out.println(fact(5));

        // Collections
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        for(String x: things)
            list1.add(x);

        String[] morethings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        for (String y: morethings)
            list2.add(y);

        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }

        editlist(list1, list2);
        System.out.println();

        for(int i = 0; i  <list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
    }

    public static void editlist (Collection<String> l1, Collection<String> l2) {
        Iterator<String> it = l1.iterator();
        while(it.hasNext()) {
            if(l2.contains(it.next())) {
                if (l2.contains(it.next()))
                    it.remove();
            }
        }
    }

    // Recursion
    public static long fact(long n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
