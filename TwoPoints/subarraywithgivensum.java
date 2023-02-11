public int[] solve(int[] A, int B) {
        int N = A.length;
        int p1 = 0, p2 = 0; // p1 is left sub-array, p2 is right of sub-array.
// both pointers start at 0 first.
        long sum = A[0];
        while (p2 < N && p1 < N) {
            if (sum < B) {
// increase the sub-array window. Incr p2. Add new element to sum.
                p2++;
                if (p2 < N) sum += A[p2];
            } else if (sum > B) {  
// decrease the sub-array window. Remove the prev element sum and move p1 to next element.
                if (p1 < N) sum -= A[p1];
                p1++;                
            } else {
// we got the window whose sum = B. Build the response array and return.
                int len = p2-p1+1;
                int arr[] = new int[len];
                int j = 0;
                for (int i = p1; i <= p2; i++) {
                    arr[j++] = A[i];
                }                
                return arr;
            }
        }
        return new int[] {-1};
    }
