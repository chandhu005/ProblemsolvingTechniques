package BasicProgramming;

import java.util.Scanner;

public class Pacman {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int input1=scan.nextInt();
        int input2=scan.nextInt();
        if((input1==0&&input2==0))
        System.out.print(0);
        else if(input1==1&&input2==1)
        System.out.print(0);
        else if(input1==1 &&input2==0)
        System.out.print(0);
        else
        System.out.print(1);
        
    }
}
