package BasicProgramming;
import java.util.Scanner;
public class MaxOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        if(A>B){
            System.out.print(A);
        }
        else{
             System.out.print(B);
        }

	}

}
