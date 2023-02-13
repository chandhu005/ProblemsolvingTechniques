/*
Given n non-negative integers A[0], A[1], ..., A[n-1] , where each represents a point at coordinate (i, A[i]).

N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).

Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container
5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3. 
So total area = 3 * 2 = 6
*/



public class Solution {
    public int maxArea(int[] A) {
        int p1=0;
        int p2=A.length-1;
        int ans=0;

        while(p1<p2){
            int height=Math.min(A[p1],A[p2]);
            int w=p2-p1;
            int water= height* w;
             ans=Math.max(water,ans);
             if(A[p1]==height){
                 p1++;
             }
             else{
                 p2--;
             }
        }
        return ans;
    }
}
