package Arrays;

public class Arrayrotation {
	public int[] solve(int[] A, int B) {
	int startIndex=0;
    int endIndex=A.length-1;
    int N=A.length;
    while((B%N) >0){
        for(int i=startIndex;i<=endIndex;i++){
            int temp=A[i];
            A[i]=A[endIndex];
            A[endIndex]=temp;
        }
        B--;
    }
    return A;
	}
}
