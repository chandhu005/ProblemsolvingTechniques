public class Solution {
    public int sqrt(int A) {
        long ans=0;
        long low =0;long high=A;
        while(low<=high){
            long  mid=(low+high)/2;
            if(mid*mid==A){
                return (int)Math.floor(mid);
            }
            else if(mid*mid>A){
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return (int)Math.floor(ans);
    }
}
