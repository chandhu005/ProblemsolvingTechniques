package maths;

import java.util.Scanner;

public class ISPRime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		System.out.println(isprimeornot(A));

	}
	// if an number is prime it wont have single number between 1 to A;
	public static boolean isprimeornot(int A) {
		if(A==1) {
			return false;
		}
		for(int i=2;i*i<=A;i++) {
			if(A%i==0) {
				return false;
			}
		}
		return  true;
	}

}
