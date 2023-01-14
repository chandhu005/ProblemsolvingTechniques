package maths;

import java.util.Scanner;

public class Countofdigits {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(countdigits(n));
		
		
	}
	public static int countdigits(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
