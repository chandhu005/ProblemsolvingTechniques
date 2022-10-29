package BasicProgramming;

import java.util.Scanner;

public class Profitorloss {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
      Scanner scan=new Scanner(System.in);
      int costprice=scan.nextInt();
      int sellingprice=scan.nextInt();
      if(costprice!=sellingprice){
          int profit=sellingprice-costprice;
          if(profit>1){
              
              System.out.println(1);
              System.out.println(profit);
          }
          else{
               System.out.println(-1);
               System.out.println(-(profit));
          }
      }
        
    }
}
