/*
Given an one-dimensional integer array A of size N and an integer B.

Count all distinct pairs with difference equal to B.

Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B


There are 2 unique pairs with difference 3, the pairs are {1, 4} and {5, 2}
A = [1, 5, 3, 4, 2]
 B = 3
*/



public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int i = 0, j = 1;
        long ans = 0;
        while(j < A.size()) {
            if(j == i) {
                j++;
                continue;
            }
            int x = A.get(i), y = A.get(j);
            if(y - x == B) {
                // count the pair A[i], A[j] only once
                ans++;
                while(i < A.size() && A.get(i) == x) i++;
                while(j < A.size() && A.get(j) == y) j++;
            }
            else if(y - x > B){
                i++;
            }
            else j++;
        }
        return (int)ans;
    }
}
