package Arrays;

public class ReverseComplete {
	public int[] solve(final int[] A) {
        int N=A.length;
         int i=0;
        int j=N-1;
       // int temp=0;
        while(i<j){
           int  temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
        return A;
    }

}
