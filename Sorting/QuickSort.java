package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
System.out.println(solve(arr));

	}
	/*
	 * You are given an array A of N elements. 
	 * You have to make all elements unique. 
	 * To do so, in one step you can increase any number by one.

       Find the minimum number of steps.
       A=1 1 3
       We can increase the value of 1st element by 1 in 1 step and will get all unique elements
       . i.e [2, 1, 3].
	 */
	 public static int solve(int[] A) {
	        Arrays.sort(A);
	        int count=0;
	        for(int i=0;i<A.length-1;i++){
	            if(A[i]<A[i+1]){
	               continue;
	            }
	            else{
	            while(A[i+1]<=A[i]){
	              A[i+1]++;
	              count++;
	            }
	            }
	            
	        }
	            
	        
	        return count;
	    }
}
