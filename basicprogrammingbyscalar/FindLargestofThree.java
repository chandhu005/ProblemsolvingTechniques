package BasicProgramming;


import java.util.Scanner;

public class FindLargestofThree {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int N1=scan.nextInt();
        int N2=scan.nextInt();
        int N3=scan.nextInt();
        if(N1>N2  &&  N1>N3){
            System.out.print(N1+" is largest number");
        }
       else  if(N2>N1  &&  N2>N3){
            System.out.print(N2+" is largest number");
        }
        else
        System.out.print(N3+" is largest number");
        
    }
}