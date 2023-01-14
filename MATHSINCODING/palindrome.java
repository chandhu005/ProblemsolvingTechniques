package maths;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(Palindrome(n));
		

	}
	public static boolean Palindrome(int N) {
		int rev=0;
		int temp=N;
		while(temp>0) {
			int digit =temp%10;
			rev=rev*10+digit;
			temp=temp/10;
		}
		if(N==rev) {
			return true;
		}
		else
			return false;
	}

}
