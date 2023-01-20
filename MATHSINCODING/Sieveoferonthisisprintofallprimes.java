package maths;

import java.util.Arrays;
import java.util.Scanner;

public class Sieveoferonthisisprintofallprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		int n=name.nextInt();
		printallprimes(n);

	}
	public static void printallprimes(int n) {
		if(n<=1) {
			return;
		}
		boolean isprime[]=new boolean[n+1];
		Arrays.fill(isprime, true);
		for(int i=0;i*i<=n;i++) {
			if(isprime[i]) {
				for(int j = i*2; j <= n; j = j+i)
				{
					isprime[j] = false;
				}
				
			}
		}
		for(int i = 2; i<=n; i++)
		{
			if(isprime[i])
				System.out.print(i+" ");
		}
	}

}
