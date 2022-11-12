package Arrays;

public class Countofelements {
	 public int solve(int[] A) {
	        int max=A[0];
	        int N=A.length;
	        for(int i=0;i<N;i++){
	            if(max<A[i]){
	                max=A[i];
	            } }
	        int count=0;
	        for(int i=0;i<N;i++){
	            if(A[i]==max){
	                count++;
	            }
	        }
	        return N-count;
	    }

}
