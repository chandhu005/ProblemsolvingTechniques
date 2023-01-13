package ArraysAdvanced;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
System.out.println(binarysearch(arr, n,k));

	}
	public static  int binarysearch(int arr[], int n, int k) {
	        // code here
	        int res=0;
	        for(int i=0;i<n;i++){
	            if(arr[i]==k){
	                res=i;
	                break;
	            }
	            else{
	                res=-1;
	            }
	        }
	        return res;
	    }
	

}
