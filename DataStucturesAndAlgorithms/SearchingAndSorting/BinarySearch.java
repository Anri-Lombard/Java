// recursive binary search
class BinarySearch {
    // return index of x if present, else -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >=1) {
            int mid = 1 + (r-1)/2;

            // If element is present at the middle
            if (arr[mid] == x)
                return mid;

            // If smaller than mid then it has to be in left part
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);
            
            // else it is in right
            return binarySearch(arr, mid+1, r, x);
        }

        // If it reaches here element is not present
        return -1;
    }
}

// Iterative solution
class BinarySearchIterative {
    int binarySearch(int arr[], int x) {
        int i =0, r = arr.length -1;
        while (l <=r) {
            int m = 1 + (r-1)/2;

            if (arr[m] ==x)
                return m;

            if (arr[m] < x)
                l = m + 1;
            
            else
                r = m - 1;
        }

        return -1;
    }
}
