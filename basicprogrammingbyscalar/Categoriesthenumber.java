package BasicProgramming;


import java.util.Scanner;

public class Categoriesthenumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int  A=scan.nextInt();
        if(A>1)
        System.out.print(1);
        else if(A<0)
        System.out.print(-1);
        else
        System.out.print(0);
    }
}
