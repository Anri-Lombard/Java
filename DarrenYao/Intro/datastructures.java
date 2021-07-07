import java.io.*;
import java.util.*;

public class datastructures {
    // Datastructures are built in with functions such as (1) add, (2) remove, (3) size(), (4) isEmpty()
    static TreeMap<Integer, Integer> multiset = new TreeMap<Integer, Integer>();
    public static void main(String[] args) {
        // Arrays
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100); list.add(50); list.add(29);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        System.out.println();


        // Stacks (like pancakes)
        Stack<Integer> s = new Stack<Integer>();
        s.push(1); s.push(20); s.push(5);
        System.out.println(s.peek());
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println();


        // Queues
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1); q.add(23); q.add(234);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println();


        // Dequeue
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.addFirst(34); deque.addFirst(3); deque.addFirst(56);
        System.out.println(deque);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println();


        // Priority Queues
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(3); pq.add(2); pq.add(7); pq.add(10);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println();


        // Sets and Maps
        // Unordered set
        HashSet<Integer> set = new HashSet<>();
        set.add(1); set.add(5); set.add(34);
        System.out.println(set);
        set.remove(1);
        System.out.println(set.contains(5));
        System.out.println();

        // Ordered set
        TreeSet<Integer> oset = new TreeSet<>();
        oset.add(1); oset.add(5); oset.add(34);
        System.out.println(oset.higher(7));
        System.out.println(oset.lower(5));
        System.out.println(oset.first());
        System.out.println(oset.last());
        System.out.println();
        
        // Maps
        // Unordered map
        HashMap<Integer, Integer> umap = new HashMap<Integer, Integer>();
        umap.put(3, 5); umap.put(4, 18); umap.put(2, 7); umap.put(1, 9);
        System.out.println(umap);
        umap.remove(2);
        System.out.println(umap);
        System.out.println(umap.containsKey(4));
        System.out.println();

        // Ordered map
        TreeMap<Integer, Integer> omap = new TreeMap<Integer, Integer>();
        omap.put(3, 5);
        omap.put(4, 5);
        System.out.println(omap.lastEntry());
        System.out.println(omap.firstEntry());
        System.out.println(omap);
        System.out.println();

    }

    static void add(int x) {
        if (multiset.containsKey(x)) {
            multiset.put(x, multiset.get(x) + 1);
        } else {
            multiset.put(x, 1);
        }
    }

    static void remove(int x) {
        multiset.put(x, multiset.get(x) - 1);
        if (multiset.get(x) == 0) {
            multiset.remove(x);
        }
    }
}
