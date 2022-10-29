package BasicProgramming;


import java.util.Scanner;


public class PercentageandGrade {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        double A=scan.nextDouble();
        double B=scan.nextDouble();
        double C=scan.nextDouble();
        double D=scan.nextDouble();
        double E=scan.nextDouble();
        int percentage=(int)(A+B+C+D+E)/5;
        System.out.println(percentage);
        if(percentage >= 90)
        System.out.println("A");
else if (percentage >= 80 && percentage<90 )
System.out.println("B");
else if(percentage >= 70&& percentage<80) 
System.out.println("C");
else if(percentage >= 60 && percentage<70) 
System.out.println("D");
else if(percentage >= 40 && percentage<60) 
System.out.println("E");
else
System.out.println("F");


    }
}