import java.io.*;
import java.util.*;

// Directed graph with adjacency list
class Graph
{
    private int V;  // Veritices
    private LinkedList<Integer> adj[];

    // constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s){
        // s is the source
        // Mark all vertices as not visited
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // dequw vertex
            s = queue.poll();
            System.out.println(s+ " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjecent has not been visited, then mark it so
            // and engqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    // Driver method to
    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }
}