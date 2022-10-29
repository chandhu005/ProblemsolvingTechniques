package BasicProgramming;

import java.util.Scanner;

public class Avaliedtrangle {
	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int C=scan.nextInt();
        if(A+B+C==180){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        
    }
}


