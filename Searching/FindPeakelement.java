package BinarySearch;

import java.util.Scanner;

public class FindPeakelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(peakelement(arr));
	}
	public  static int peakelement(int[] A) {
	    // Try to think when will the unique answer exists, 
	    //Unique answer only exists when the elements first increases and then decreases.
	    // Check is first or last element is the answer.
	    int n = A.length;
	    //base cases
	    if (n == 1)
	      return A[0];
	    if (A[1] <= A[0])
	      return A[0];
	    if (A[n - 1] >= A[n - 2])
	      return A[n - 1];
	    int low = 1, high = n - 2;
	    while (low <= high) {
	      int mid = (high - low) / 2 + low;
	      if (A[mid] >= A[mid - 1] && A[mid] >= A[mid + 1])
	        return A[mid];
	      else if (A[mid] >= A[mid - 1])
	        low = mid + 1;
	      else
	        high = mid - 1;
	    }
	    return -1;
	  }
}
