import java.io.*;
import java.util.*;

class Graph {
    private int V; // No. of vertices

    // Arrat of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constuctro
    @SuppressWarnings("unchecked") Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // use addegde to add vertices
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // a function used recursively by DFS
    void DFSUtil(int v, boolean visited[]) {
        // Current node is visited
        visited[v] = true;

        // Recur for all the vertices adjacxent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        // Mark all vertices as not visited
        boolean visited[] = new boolean[V];

        // call recursive function
        DFSUtil(v, visited);
    }
}
