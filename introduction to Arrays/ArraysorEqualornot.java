package ArraysAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysorEqualornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int brr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			brr[i]=scan.nextInt();
		}
		System.out.println(check(arr, brr, n));

	}
	 public static boolean check(int[] arr,int[] brr,int N)
	    {
	        //Your code here
	        Arrays.sort(arr);
	        Arrays.sort(brr);
	        boolean b=false;
	        for(int i=0;i<N;i++){
	            if(arr[i]!=brr[i]){
	                return false;
	            }
	            
	        }
	        return true;
	    }
}
