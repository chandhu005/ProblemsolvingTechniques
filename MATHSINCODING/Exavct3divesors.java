package maths;

import java.util.Scanner;

public class Exavct3divesors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A=scan.nextInt();
		System.out.println(exactly3Divisors(A));

	}
	public static  boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        
        return true ;
    }
    
    // method to check the numbers which has exactly 3 divisors
    public static  int exactly3Divisors(int N)
    {
        //Initializing counter to zero
        int counter=0; 
        N = (int)Math.sqrt(N);
        
        //Running a loop from 1 to sqrt(N)    
        for(int i=1;i<=N;i++) 
        {
           // A number N only has 3 divisors if it is a  
            // perfect square and its square  root is a prime number, 
            // and we know the number of perfect squares less than N which 
            // is sqrt(N), so just checking if i is prime or not
            if(isPrime(i)) 
                counter++;
        }
        return counter;
    }
}
