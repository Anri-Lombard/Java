import java.util.*;
class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        int s = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        boolean visited[] = new boolean[V+1];
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while(q.isEmpty() == false) {
            int u = q.poll();
            arr.add(u);
            for(int i: adj.get(u)) {
                if(visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        return arr;
    }
}