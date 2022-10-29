package BasicProgramming;
import java.util.Scanner;
public class ClassPerformance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        int ClassA=scan.nextInt();
	        int  ClassASub=scan.nextInt();
	         int ClassB=scan.nextInt();
	        int  ClassBSub=scan.nextInt();
	        float avaerageA=(ClassA+ClassASub);
	        float averageB=(ClassB+ClassBSub);
	        if(avaerageA > averageB){
	            System.out.println("True");

	        }
	        else{
	            System.out.println("False");
	        }
	        
	}

}
