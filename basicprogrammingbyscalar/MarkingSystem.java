package BasicProgramming;


import java.util.Scanner;

public class MarkingSystem {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int marks=scan.nextInt();
        if(marks>=50){
            System.out.print("PASS");
            if(marks>=50  && marks<=80){
                System.out.print(" "+"B");
            }
            else{
                System.out.print(" "+"A");
            }
        }
        else{
            System.out.print("FAIL");
        }

        
    }
}