package maths;

import java.util.Scanner;

public class DeleteOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		System.out.println(DeleteoneGcd(A));
	}
	public  static int DeleteoneGcd(int[] A) {
		int left=0;
		int n=A.length;
		int[] prefixGCD=new int[n];
		int[] suffixGCD=new int[n];
		/*
		 * create an prefix array 
		 */
		prefixGCD[0]=A[0];
		for(int i=1;i<n;i++) {
			prefixGCD[i]=gcd(prefixGCD[i-1], A[i]);
		}
		/*
		 * create suffix array 
		 */
		suffixGCD[n-1]=A[n-1];
		for(int i=n-2;i>=0;i--) {
			suffixGCD[i]=gcd(suffixGCD[i+1], A[i]);
		}
		int Zerothele=suffixGCD[1];
		int last_Element=prefixGCD[n-1];
		 int ans=Math.max(Zerothele,last_Element);

	        //if any of the element from index 1 to n-2 is removed
	        for(int i=1;i<n-1;i++){
	            int temp=gcd(prefixGCD[i-1],suffixGCD[i+1]);
	            ans=Math.max(temp,ans);
	        }

	        return ans;
	}
	public  static int gcd(int A,int B) {
		if(B==0) {
			return A;
		}
	return	gcd(B,A%B);
	}

}
