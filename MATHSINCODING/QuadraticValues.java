package maths;

import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		ArrayList<Integer> ans=quadraticRoots(a, b, c);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
		

	}
//Given a quadratic equation in the form ax2 + bx + c. Find its roots.



//User function Template for Java


 public static  ArrayList<Integer> quadraticRoots(int a, int b, int c) {
     // code here
     ArrayList<Integer> ans=new ArrayList<Integer>();
     double d=((b*b)-(4*a*c));
     if(d<0){
         ans.add(-1);
     }
     if(d>=0){
         double Positive=((-b+Math.sqrt(d))/(2*a));
          double negetive=((-b-Math.sqrt(d))/(2*a));
     
     if(Positive>negetive){
     ans.add((int)Math.floor(Positive));
     ans.add((int)Math.floor(negetive));
     }
     else{
         ans.add((int)Math.floor(negetive));
         ans.add((int)Math.floor(Positive));
     }
     }
     return ans;
     }
}
