// lazy propiigation in segment tree
import java.util.*;
import java.lang.*;
import java.io.*;

// BITree is an array in which each node stores sum of some
// elements of a given array for which the BI Tree is made...

/* n --> No. of elements present in input array.
    BITree[0..n] --> Array that represents Binary
                    Indexed Tree.
    arr[0..n-1] --> Input array for which prefix sum
                    is evaluated. */

// Complexity: O(log(n))

/* 2 operations:
    (1) update()
    (2) getSum() */

class BinaryIndexedTree {
    // Mac tree size
    final static int MAX = 1000;

    static int BITree[] = new int[MAX];

    int getSum(int index) {
        int sum = 0;

        // index in BITree[] is 1 more than the index in arr[]
        index += 1;

        // Traverse ancestors of BITree[index]
        while(index>0) {
            // Add current element of BITree to sum
            sum += BITree[index];

            // Move index to parent node in getSum View
            index -= index & (-index);
        }
        return sum;
    }

    // Updates a node in Binary Index Tree (BITree) at a given index in BITree.
    public static void updateBIT(int n, int index, int val) {
        // index in BITree is +1 than index in Array
        index = index + 1;

        while(index < n) {
            // Add val to current node of BITree
            BITree[index] += val;

            // Update index to that of parent
            index += index & (-index);
        }
    }

    // Construct tree from given array
    void constructBITree(int arr[], int n) {
        for(int i=1; i<=n; i++)
            BITree[i] = 0;

        // Store actual values of BITree[] as 0
        for(int i = 0; i < n; i++)
            updateBIT(n, i, arr[i]);
    }

        // Main function
        public static void main(String args[])
        {
            int freq[] = {2, 1, 1, 3, 2, 3,
                        4, 5, 6, 7, 8, 9};
            int n = freq.length;
            BinaryIndexedTree tree = new BinaryIndexedTree();
     
            // Build fenwick tree from given array
            tree.constructBITree(freq, n);
     
            System.out.println("Sum of elements in arr[0..5]"+
                            " is "+ tree.getSum(5));
             
            // Let use test the update operation
            freq[3] += 6;
             
            // Update BIT for above change in arr[]
            updateBIT(n, 3, 6);
     
            // Find sum after the value is updated
            System.out.println("Sum of elements in arr[0..5]"+
                        " after update is " + tree.getSum(5));
        }
}