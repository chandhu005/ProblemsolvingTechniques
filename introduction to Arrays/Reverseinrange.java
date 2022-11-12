package Arrays;

public class Reverseinrange {
	public int[] solve(int[] A, int B, int C) {
        int i=B;
        int j=C;
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
