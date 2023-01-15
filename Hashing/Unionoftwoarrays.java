package Hashmaps;

import java.util.HashSet;
import java.util.Scanner;

public class Unionoftwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<m;i++) {
			b[i]=scan.nextInt();
		}
		System.out.println(unionofTwoarrays(a, n, b, m));
		
		

	}
	public static int unionofTwoarrays(int[] a,int n,int[] b,int m) {
		HashSet<Integer> union=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			union.add(a[i]);
		}
		for(int i=0;i<m;i++) {
			union.add(b[i]);
		}
		return union.size();
	}

}
