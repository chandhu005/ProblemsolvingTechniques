package BitManupulation;

import java.util.Scanner;

public class DevideInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		

	}
	public static  int divide(int A, int B) {
        int sign = (A < 0)^(B < 0)?-1:1;          
       if(B == 1){                     //Edge Case
           return A;
       }
       if(A == Integer.MIN_VALUE){     //Edge Case
           A = Integer.MAX_VALUE;
       }
       long x = Math.abs(A);
       long y = Math.abs(B);
       int quotient = 0;
       while(x >= y){
           x = x - y;
           quotient++;
       }
       return (int)quotient * sign;
   }
}
