import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
	    // NOTE: Please do not modify this function	 
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int k = sc.nextInt();
	        int rotatedArr[] = cyclicRotation(n, arr, k);
	        for (int j : rotatedArr)
	            System.out.print(j + " ");

	    }
	    static int[] cyclicRotation(int n, int[] arr, int k) 
	    {
	         int[] a=new int[n];
	         int m=0;
	         k=n%k;
	         if(k==0)
	         {
	             return arr;
	         }
	         for(int i=n-k;i<n;i++)
	         {
	             a[m]=arr[i];
	             m++;
	         }
	         for(int i=n-k-1;i>=0;i++)
	      {
	        a[m]=arr[i];
	        m++;
	       }
	 return a;

	    }
	}