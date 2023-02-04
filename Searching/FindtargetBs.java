package BinarySearch;

import java.util.Scanner;

public class FindtargetBs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(BinarySearch(arr, k));

	}
	public static int BinarySearch(int A[],int target) {
		int low=0; int high=A.length-1;
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
