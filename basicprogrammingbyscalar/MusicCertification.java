package BasicProgramming;


import java.util.Scanner;

public class MusicCertification {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        if(n>=500000 && n<1000000)
        System.out.println("gold");
        else if(n>=1000000 &&n<10000000 )
        System.out.println("platinum");
        else if(n>=10000000)
        System.out.println("diamond");
        else
              System.out.println("None");

    }
}