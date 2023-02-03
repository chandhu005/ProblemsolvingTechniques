package Sorting;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		bubblesortp(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println((arr[i]));
		}

	}
	public static void bubblesortp(int A[]) {
		for(int i=0;i<A.length-1;i++) {
			for(int j=0;j<A.length-i-1;j++) {
				if(A[j]>A[j+1]) {
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
	}

}
