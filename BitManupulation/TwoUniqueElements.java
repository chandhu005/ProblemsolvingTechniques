package BitManupulation;

import java.util.Scanner;

public class TwoUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		//int B=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
			//System.out.println(A[i]);
		}
		int[] res=twoUniqueElements(A); 
              for(int i=0;i<res.length;i++) {
            	  System.out.println(res[i]);
              }
                   
            System.out.println(twoUniqueElements(A));
	}//[1, 2, 3, 1, 2, 4]
	public static int[] twoUniqueElements(int[] A) {
		// Xor of all  all elements
		int val=0;
		for(int i=0;i<A.length;i++) {
			val=val^A[i];
		}
		//find set bit posisition of value 0 30 beacuse MSB always 0
		int pos=0;
		for(int i=0;i<30;i++) {
			if(CheckBit(val,pos)) {
				pos=i;
				break;
			}
		}
		/// using posistion refernece break array into two parts set and unset;
		int set=0; int unset=0;
		for(int i=0;i<A.length;i++) {
			if(CheckBit(A[i], pos)) {
				set=set^A[i];
			}
			else {
				unset=unset^A[i];
			}
		}
		int[] res=new int[2];
		res[0] = Math.min(set,unset);
        res[1] = Math.max(set,unset);
        return res;
		
		
		
	}
	public static boolean CheckBit(int N,int i) {
		 if(((N>>i)&1)==1) {
			 return true;
		 }
		 else {
			return false;
		 }
	}

}
