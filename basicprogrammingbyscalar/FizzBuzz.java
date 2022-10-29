package BasicProgramming;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int N =scan.nextInt();
        if(N%3==0 && N%5==0)
        System.out.print("FizzBuzz");
     else   if(N%3==0)
        System.out.print("Fizz");
       else
        System.out.print("Buzz");
        
    }
}