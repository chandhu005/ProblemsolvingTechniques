package BitManupulation;

import java.util.Scanner;

public class DiffernetBetweenSumWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		System.out.println(cntBits(A));
		/*
		 *(1, 1) + f(1, 3) + f(1, 5) + f(3, 1) + f(3, 3) + f(3, 5) + f(5, 1) + f(5, 3) + f(5, 5) 
 = 0 + 1 + 1 + 1 + 0 + 2 + 1 + 2 + 0 = 8
 A= 1 3 5
 1- 0 0 1
 3- 0 1 1 
 5- 1 0 1 
 
 count number of zeroes and ones  in each set munltipe them 
 
		 */

	}
	 public static int cntBits(int[] A) {
	        int mod=1000000007;
	        long cnt=0;
	         long ans=0;
	        for(int i=0;i<32;i++){
	            cnt=0;
	            for(int j=0;j<A.length;j++){
	                if((A[j] & (1<<i))>0){/// need to check how many once are there
	                    cnt++;
	                }

	            }
	            ans=(ans+2* cnt*(A.length-cnt))%mod; /// 2 is for pair will in two times 
	            ans%=mod;
	        }
	        return (int)ans;
	    }

}
