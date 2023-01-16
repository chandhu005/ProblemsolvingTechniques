package maths;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrangeanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//int n=scan.nextInt();
		//int B=scan.nextInt();
		ArrayList<Integer> A=new ArrayList<>();
		A.add(3);
        A.add(1);
        A.add(4);
        A.add(6);
        A.add(5);
        A.add(0);
        A.add(2);
       
             ReArrangeArray(A);
	}
	
public static void ReArrangeArray(ArrayList<Integer> A) {
	int length=A.size();
	for(int i=0;i<length;i++) {
	int val=A.get(i)*length;
	A.set(i, val);
	}
	for(int i=0;i<A.size();i++) {
		int newindex=A.get(i)/length;
		int newval=A.get(newindex)/length+A.get(i);
		A.set(i, newval);
	}
	for(int i=0;i<A.size();i++) {
		int val=A.get(i)%length;
		A.set(i, val);
	}
	for(int i=0;i<A.size();i++) {
		System.out.print(A.get(i));
	}
	
}
}
