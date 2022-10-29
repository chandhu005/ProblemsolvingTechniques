package BasicProgramming;


import java.util.Scanner;

public class NestedIfelse {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        if(N>=10 && N<=20){
            int M=scan.nextInt();
            int sum=N+M;
            System.out.println(sum);
            if(sum>=100){
                System.out.println("That is a large sum!");
            }
        }
        else{
            System.out.println(-1);
        }

        
    }
}