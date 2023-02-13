/*
Given a sorted array of integers (not necessarily distinct) A and an integer B, 
find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.

Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).
*/
//Brute force Approch 
public class Solution {
    public int solve(int[] A, int B) {
        int count=0;
        int p1=0;int p2=A.length-1;
        while(p1<p2){
            if(A[p1]+A[p2]==B){
                count++;
                return count;
            }
            else if(A[p1]+A[p2]>B){
                p2--;
            }
            else{
                p1++;
            }
        }
        return count;
    }
}
