package BinarySearch;

import java.util.Scanner;

public class SearchinInfinatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(findingrange(arr,k));

	}
	static int findingrange(int A[],int target) {
		//first find the range
		//first start the range in the box of 2 
		int start=0;
		int end=1;
		//condition for the target to lie in the range
		while(target>A[end] ){
			int newstart=end+1;
			//double the box value;
			//end=end+2*sizeof the box
		end=end+(end-start+1)*2;
		start=newstart; 
		}
		return BinarySearch(A, target);
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
