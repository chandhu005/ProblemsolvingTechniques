package BasicProgramming;

import java.util.Scanner;

public class SituationOfNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        if(N>0 && N%2==0){
            System.out.println("Number is Positive and Even");
        }
        else if(N<0 && N%2==0){
            System.out.println("Number is Negative and Even");
        }
         if(N>0 && N%2!=0){
            System.out.println("Number is Positive and Odd");
        }
        else if(N<0 && N%2!=0){
            System.out.println("Number is Negative and Odd");
        }
        
    }
}