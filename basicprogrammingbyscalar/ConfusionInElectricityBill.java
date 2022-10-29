package BasicProgramming;


import java.util.Scanner;

public class ConfusionInElectricityBill {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
             int units =scan.nextInt();
            if(units<=50){
            double amount=(units*0.50);
          int billamount= (int)(amount+ (amount*0.2));
                System.out.print(billamount);
            }
            else if(units>50 && units<=150){
                double amount=(double)((50*0.5)+((units-50)*0.75));
                int billamount=(int)(amount+amount*0.2);
                System.out.print(billamount);
            }
            else if(units>150 && units<=250){
                double amount=(double)((50*0.5)+((100*0.75)+((units-150)*1.20)));
                int billamount=(int)(amount+amount*0.2);
                System.out.print(billamount);
            }
            else if(units>250){
                double amount=((50*0.5)+((100*0.75)+((100)*1.20)+(units-250)*1.50));
                int billamount=(int)(amount+amount*0.2);
                System.out.print(billamount);

            }
        
    }
}