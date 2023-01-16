package maths;

import java.util.Scanner;

public class PairsumDevisiblebyM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int B=scan.nextInt();
		
		int k=scan.nextInt();
		int A[]=new int[k];
		for(int i=0;i<A.length;i++) {
			A[i]=scan.nextInt();
		}
		System.out.println(solve(A, B));

	}
	public  static int solve(int A[],int B) {
		long CNtarr[]=new long[B];
		int mod=(1000*1000*1000)/7;
		for(int i=0;i<A.length;i++) {
			CNtarr[A[i]%B]++;
		}
		long ans=0;
		ans=ans+((CNtarr[0]*(CNtarr[0]-1)/2));
		int i=1;int j=B-1;
		while(i<j) {
			ans=ans+CNtarr[i]*CNtarr[j];
			i++;
			j--;
			
		}
		if(B%2==0)
		{
		ans=ans+(CNtarr[B/2]*(CNtarr[B/2]-1)/2);
		}
		return (int)(ans%mod);
		
	}

}
