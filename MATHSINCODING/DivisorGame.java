package maths;

import java.util.Scanner;

public class DivisorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner (System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		System.out.println(solve(A, B, C));

	}
/*
 * Scooby has 3 three integers A, B, and C.
    Scooby calls a positive integer special if it is divisible by B and it is divisible by C. 
    You need to tell the number of special integers less than or equal to A.
    The two integers divisible by 2 and 3 and less than or equal to 12 are 6,12.
 */
	public static  int solve(int A, int B, int C) {
        return A/lcm(B,C);
    }
	static int lcm(int A,int B){
        return (A*B)/gcd(A,B);
    }
    static  int   gcd(int A,int B){
        if(B==0){
            return A;
        }
        return gcd(B,A%B);
    }
}
