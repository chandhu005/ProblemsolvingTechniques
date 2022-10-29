package BasicProgramming;
import java.util.Scanner;

	public class Whichtriangle {
	    public static void main(String[] args) {
	        // YOUR CODE GOES HERE
	        // Please take input and print output to standard input/output (stdin/stdout)
	        // DO NOT USE ARGUMENTS FOR INPUTS
	        // E.g. 'Scanner' for input & 'System.out' for output
	        Scanner scan=new Scanner(System.in);
	          double A=scan.nextDouble();
	        double B=scan.nextDouble();
	        double C=scan.nextDouble();
	        if(A==B && B==C && A==C){
	            System.out.println("equilateral");
	        }
	       else if(A==B || B==C || A==C){
	            System.out.println("isosceles");
	        }
	        else{
	            System.out.println("scalene");
	        }
	    }
	}

