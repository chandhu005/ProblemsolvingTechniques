package Arrays;

public class Goodpair {
	public int solve(int[] A, int B) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[i]+A[j]==B && i!=j){
                    return 1;
                }
            }
        }return 0;
    }
}
