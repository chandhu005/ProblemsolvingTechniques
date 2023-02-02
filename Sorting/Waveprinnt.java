package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Waveprinnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int res[]=wave(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.println(res[i]);   //res[i]
		}

	}
	 public static int[] wave(int[] A) {
	        Arrays.sort(A);
	        for(int i=0;i<A.length-1;i=i+2){
	            int temp=A[i];
	            A[i]=A[i+1];
	            A[i+1]=temp;
	        }
	        return A;
	    }
}
