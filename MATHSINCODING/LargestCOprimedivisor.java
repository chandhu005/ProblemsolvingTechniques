package maths;

import java.util.Scanner;

public class LargestCOprimedivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(largestCoprime(A, B));

	}
	/*
	 * You are given two positive numbers A and B . You need to find the maximum valued integer X such that:
         *   X divides A i.e. A % X = 0
         *  X and B are co-prime i.e. gcd(X, B) = 1
         *  Explonation:All divisors of A are (1, 2, 3, 5, 6, 10, 15, 30). 
            
            The maximum value is 5 such that A%5 == 0 and gcd(5,12) = 1
	 */
	public static int largestCoprime(int A,int B) {
		while(gcd(A,B)!=1) {
			A/=gcd(A,B);
		}
		return A;
	}
  public static int gcd(int A,int B) {
	  if(B==0) {
		  return A;
	  }
	  return gcd(B,A%B);
  }
}
