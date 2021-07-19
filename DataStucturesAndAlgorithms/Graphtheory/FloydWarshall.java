// Program for Floyd Warshall All Pairs Shortest Path Algorithm
import java.util.*;
import java.lang.*;
import java.io.*;

class AllPairShortestPath {
    final static int INF = 99999999, V = 4;

    void floydWarshall(int graph[][]) {
        int dist[][] = new int[V][V];
        int i, j, k;

        // Initialize the solution matrix same as input graph matrix
        for (i = 0; i<V; i++)
            for (j=0; j<V; j++)
                dist[i][j] = graph[i][j];

        // Before itteration we only have set {0, 1, 2, ... , k-1}
        // During itteration we add k, so we have set {0, 1, 2, ... , k}

        for (k=0; k<V; k++) {
            // Pick all vertices as source one by one
            for(i=0; i<V; i++) {
                //Pick all vertices as destination for above mentioned source
                for (j=0; j<V; j++) {
                    // If vertex k is on the shortest path from i to j,
                    // then update the value of dist[i][j]
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        // Print the shortest distance matrix
        printSolution(dist);
    }

    void printSolution(int dist[][]) {
        System.out.println("The following matrix shows the shortest "+
                            "distance between every pair of vertices");
        for (int i=0; i<V; ++i){
            for(int j=0; j<V; ++j) {
                if (dist[i][j]==INF)
                    System.out.println("INF ");
                else
                    System.out.println(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }

    // Driver program to test above function
    public static void main (String[] args)
    {
        /* Let us create the following weighted graph
           10
        (0)------->(3)
         |         /|\
       5 |          |
         |          | 1
         \|/        |
        (1)------->(2)
           3           */
        int graph[][] = { {0,   5,  INF, 10},
                          {INF, 0,   3, INF},
                          {INF, INF, 0,   1},
                          {INF, INF, INF, 0}
                        };
        AllPairShortestPath a = new AllPairShortestPath();
 
        // Print the solution
        a.floydWarshall(graph);
    }
}
