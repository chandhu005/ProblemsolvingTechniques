package maths;

import java.util.ArrayList;
import java.util.Scanner;

public class Countnoofprimes {

	//private static char[] solve(A);
	//private static final boolean[] P = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A=scan.nextInt();
		//countprimes(A);
		ArrayList<Integer> res=solve(A);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
		

	}
	 public  static int[] sieve(int n){
	        // sieve of eratosthenes
	        int[] prime = new int[n + 1];
	        for(int i = 2; i * i <= n; i++){
	            if(prime[i] == 0){
	                for(int j = i * i; j <= n; j += i){
	                    prime[j] = 1;
	                }
	            }
	        }
	        return prime;
	    }
	    public  static ArrayList<Integer> solve(int A) {
	        ArrayList<Integer> ans = new ArrayList<Integer>();
	        int[] prime = sieve(A);
	        for(int i = 2; i <= A; i++){
	            if(prime[i] == 0){
	                ans.add(i);
	            }
	        }
	        return ans;
	    }
	    ///
	    public ArrayList<Integer> newApproch(int A) {
	         ArrayList<Integer> result = new ArrayList<Integer>();
	        for (int i = 2; i <= A; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                result.add(i);
	            }
	        }
	        return result;
	    
	    }

}
