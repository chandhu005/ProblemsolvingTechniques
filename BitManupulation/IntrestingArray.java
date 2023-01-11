package BitManupulation;

import java.util.Scanner;

public class IntrestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		System.out.println(solve(A));
		

	}
	/*
	 * You have an array A with N elements. We have two types of operation available on this array :
       We can split an element B into two elements, C and D, such that B = C + D.
       We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
      You have to determine whether it is possible to convert array A to size 1, containing a single element equal to 0 after several splits and/or merge?
	 */
	  public static String solve(int[] A) {
	        int sum=0;
	        for(int i=0;i<A.length;i++){
	   
	        	sum=sum+A[i];
	        }
	        if(sum%2==0)
	        return "Yes";
	        else
	        return "No";
	    }

}
