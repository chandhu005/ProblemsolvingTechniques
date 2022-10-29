package BasicProgramming;

import java.util.Scanner;

public class QuadrantNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int X=scan.nextInt();
        int Y=scan.nextInt();
        if( X> 0 && Y>0){
            System.out.print(X+","+" "+Y+" "+"belongs to First Quadrant");
        }
      else  if( X< 0 && Y>0){
            System.out.print(X+","+" "+Y+" "+"belongs to Second Quadrant");
        }
        else  if( X< 0 && Y<0){
            System.out.print(X+","+" "+Y+" "+"belongs to Third Quadrant");
        }
        else  if( X> 0 && Y<0){
            System.out.print(X+","+" "+Y+" "+"belongs to Fourth Quadrant");
        }
    }
    }
