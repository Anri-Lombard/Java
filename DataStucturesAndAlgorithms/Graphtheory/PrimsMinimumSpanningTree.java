// Greedy algorithm (making the locally optimal choice at each stage)
// Spanning tree: all vertices must be connected -> connected
// by miinimum wight edge = Minimum spanning tree

// Prim's minimum spanning tree algorithm
class MST {
    // vetices
    private static final int V= 5;

    // find vetex with minimum key, vlaue, from set not yet included
    int minKey(int key[], Boolean mstSet[]) {
        // Initialize main value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if(mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
        
        return min_index;
    }

    // print constructed MST stored in parent[]
    void printMST(int parent[], int graph[][]) {
        System.out.println("Edge\tWeight");
        for (int i=1; i<V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }

    // Function to construct and print MST for a adjacency matrix graph
    void primMST(int graph[][]) {
        // Array to store constructed MST
        int parent[] = new int[V];

        // To pick minimum weight edge
        int key[] = new int[V];

        // To represent set of vertices included in MST
        Boolean mstSet[] = new Boolean[V];

        // Initialize all keys as INF
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        // include first vertex in MST. Initialize to 0 so it is picked
        key[0] = 0;
        // First node is always root of MST
        parent[0] = -1;

        // MST will have V vertices
        for (int count=0; count < V - 1; count++) {
            // Pick minimum key from set not yet included
            int u = minKey(key, mstSet);

            // Add it to the mstSet
            mstSet[u] = true;

            // Update key values for vertecis not yet included in MST
            for (int v = 0; v < V; v++)
                // Update the key only if graph[u][v] is smaller than key[v]
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }

        printMST(parent, graph);
    }

    public static void main(String[] args)
    {
        /* Let us create the following graph
        2 3
        (0)--(1)--(2)
        | / \ |
        6| 8/ \5 |7
        | /     \ |
        (3)-------(4)
            9         */
        MST t = new MST();
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                      { 2, 0, 3, 8, 5 },
                                      { 0, 3, 0, 0, 7 },
                                      { 6, 8, 0, 0, 9 },
                                      { 0, 5, 7, 9, 0 } };
  
        // Print the solution
        t.primMST(graph);
    }

}