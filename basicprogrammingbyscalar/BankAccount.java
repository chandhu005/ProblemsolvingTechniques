package BasicProgramming;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int type=scan.nextInt();
        int amount=scan.nextInt();
        if(N>amount){
             if(type==1 )
        System.out.print(N+amount);
         else if(type==2)
        System.out.print(N-amount);
        }
        else 
        System.out.print("Insufficient Funds");
        
        
    }
}
