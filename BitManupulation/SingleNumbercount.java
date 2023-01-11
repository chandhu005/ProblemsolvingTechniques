package BitManupulation;

import java.util.Scanner;

public class SingleNumbercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		System.out.println(singlenumber(A));
		

	}
	public static int singlenumber(int[] A) {
		int res=0;
		for(int i=0;i<A.length;i++) {
			res=res^A[i];
		}
		return res;
	}

}
