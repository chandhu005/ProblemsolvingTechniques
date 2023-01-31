package Sorting;

import java.util.Scanner;

public class Makesofchunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
System.out.println(chunk(arr));

	}
	public static int chunk(int[] A) {
        int countchunks=0;
        int n=A.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,A[i]);
            if(max<=i)
            countchunks++;
        }
        return countchunks;
    }

}
