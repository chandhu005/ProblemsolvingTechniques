package BitManupulation;

import java.util.Scanner;

public class SinglenumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		System.out.println(singlenumber3times(A));
		

	}
	/*
	 * count the total set bits(count of 1's and divide by 3)
	 * a 5 7 5 4 7 11 11 9 11 7 5 4 4 
	 * 5= 0 1 0 1 
	 * 7= 0 1 1 1
	 * 5= 0 1 0 1  
	 * 4= 0 1 0 0
	 * 7= 0 1 1 1
	 * 11=1 0 1 1
	 * 11=1 0 1 1
	 * 9= 1 0 0 1
	 * 11=1 0 1 1
	 * 7= 0 1 1 1
	 * 5= 0 1 0 1 
	 * 4= 0 1 0 0
	 * 4= 0 1 0 0
	 * ------------------------
	 *    4%3  9%3 6%3  10%3
	 *    1 0 0 1
	 *    2^3 +1=9 ans=9;

	 */
	public  static int singlenumber3times(int[] A) {
		int cnt=0; int ans=0;
		for(int i=0;i<32;i++) {
			cnt=0;
			for(int j=0;j<A.length;j++) {
				if(((A[j]>>i)&1)==1) {// to check ith bit is set or not;
					cnt++;
				}
			}
			if(cnt%3==1) {
				ans=ans+(1<<i);
			}
		}
		return ans;
		
	}

}
