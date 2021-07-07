import java.io.*;
import java.util.*;

public class datastructures {
    // Datastructures are built in with functions such as (1) add, (2) remove, (3) size(), (4) isEmpty()
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
    }
}
