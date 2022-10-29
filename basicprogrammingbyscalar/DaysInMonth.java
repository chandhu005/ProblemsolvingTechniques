package BasicProgramming;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        if(A==1)
        System.out.println(31);
       else if(A==2)
        System.out.println(28);
      else  if(A==3)
        System.out.println(31);
      else  if(A==4)
        System.out.println(30);
      else  if(A==5)
        System.out.println(31);
     else   if(A==6)
        System.out.println(30);
      else  if(A==7)
        System.out.println(31);
      else  if(A==8)
        System.out.println(31);
      else  if(A==9)
        System.out.println(30);
       else if(A==10)
        System.out.println(31);
       else if(A==11)
        System.out.println(30);
      else  if(A==12)
        System.out.println(31);


    }
}