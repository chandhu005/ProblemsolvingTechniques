package BinarySearch;

import java.util.Scanner;

public class FloorofNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(floor(arr,k));
	}
	/*
	 * smallest number in array greater or equal to target
	 */
	 public static int floor(int[] A, int B) {
	        int low=0; int high=A.length-1;
	        while(low<=high){
	            int mid=(low+high)/2;
	            if(A[mid]==B){
	           return mid;
	            }
	          else  if(A[mid]>B){
	                high=mid-1;
	            }
	            else{
	                low=mid+1;
	            }
	        }
	        return high;
	    }

}
