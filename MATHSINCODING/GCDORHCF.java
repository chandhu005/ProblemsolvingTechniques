package maths;

public class GCDORHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(81,153));

	}
	public static int GCD(int A,int B) {
		int res=Math.min(A, B);
		int val=0;
		for(int i=1;i<=res;i++) {
			if(A%i==0 && B%i==0) {
				val=i;
			}
		}
		return val;
	}
             
}
