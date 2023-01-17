package maths;

import java.util.Scanner;

public class EcludianAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int A=scan.nextInt();
int B=scan.nextInt();
System.out.println(gcd(A, B));

	}
	public static int gcd(int A,int B) {
		if(B==0) {
			return A;
		}
		return gcd(B,A%B);
	}

}
