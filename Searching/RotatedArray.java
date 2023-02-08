package BinarySearch;

import java.util.Scanner;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Pivotbinarysearch(arr,k));

	}
	static int findPivot(int a[]) {
		int start=0; int end=a.length-1;
		while(start<=end) {
			// we are doing 4 cases
			int mid=(start+end)/2;
			if(mid<end&&a[mid]>a[mid+1]) {
				return mid;
			}
			if(mid>start && a[mid]<a[mid-1]) {
				return mid-1;
			}if(a[start]>=a[mid]) {
				end= mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
		 
	}
	public static int Pivotbinarysearch(int A[],int target) {
		int pivot=findPivot(A);
		//if didnot pivot presents,it means array is not rotated
		if(pivot==-1) {
			return BinarySearch(A, target, 0, A.length-1);
		}
	//if pivot is present we are doing binary search we have 2 ascending arrays
		if(A[pivot]==target) {
			return pivot;
		}
		if(target>=A[0]) {
			return BinarySearch(A, target, 0, pivot-1);
		}
		else {
			return BinarySearch(A, target, pivot+1, A.length-1);
		}
		
		
	}
	public static int BinarySearch(int A[],int target,int low,int high) {
		//int low=0; int high=A.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(A[mid]==target) {
				return mid;
			}
			else if(A[mid]>target) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		return -1;
	}

}
