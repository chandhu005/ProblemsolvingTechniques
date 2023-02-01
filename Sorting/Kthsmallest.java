package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Kthsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
//System.out.println(chunk(arr));
		Selectionsort(arr);
		System.out.println(Arrays.toString(arr));

	} 
	/*
	 * selectionm sort find the smallest element is exchanged with first element of the unsorted list of elements
	 */
	public static void Selectionsort(int A[]) {
		int n=A.length;
		for(int i=0;i<n-1;i++) {
			//find the maximum element in remaining array swap it to minumum index
			int min=A[i]; int index=i;
			for(int j=i;j<n;j++) {
				if(A[j]<min) {
					min=A[j];
					index=j;
				}
			}
			int temp=A[index];
			A[index]=A[i];
			A[i]=temp;
			
		}
		
		
	}
	public static void swap(int A[],int first,int second) {
		
			int temp= A[first];
			 A[first]=A[second];
			 A[second]=temp;
		
	}

}
