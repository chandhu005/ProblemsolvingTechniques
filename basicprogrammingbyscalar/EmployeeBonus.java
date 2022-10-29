package BasicProgramming;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        
        String s=scan.nextLine();
        int n=scan.nextInt();
         if(n>5){
             System.out.print("Yes"+" "+s+" " +"will recieve bonus.");
         }
        else{
            System.out.print("No"+" "+s+" " +"will not recieve bonus.");
        }
    }
}
