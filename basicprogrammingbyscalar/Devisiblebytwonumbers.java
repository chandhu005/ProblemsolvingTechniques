package BasicProgramming;

import java.util.Scanner;

public class Devisiblebytwonumbers {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        if(number/5==0 && number/11==0){
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }
    }
}
