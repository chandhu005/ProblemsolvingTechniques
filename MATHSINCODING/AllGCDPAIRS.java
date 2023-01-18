package maths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AllGCDPAIRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan=new Scanner(System.in);
           int n=scan.nextInt();
           int A[]=new int[n];
           for (int i = 0; i < A.length; i++) {
			A[i]=scan.nextInt();
			
		}
           int[] ans=allgcdpairs(A);
           for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}
	public static int[] allgcdpairs(int[] A) {
		 int n = A.length;
	        int interval = (int)Math.sqrt(n);
	        int[] res = new int[interval];
	        int max = 0;
	        int count = 0, k = 0;

	        for(int i=0; i<A.length; i++)
	        {
	            if(A[i]>max) max = A[i];
	            count++;
	            if(count == interval)
	            {
	                res[k++] = max;
	                max = 0;
	                count = 0;
	            }
	        }
	        return res;
	}
	public static ArrayList<Integer> allgcdpairsHash(ArrayList<Integer> A) {
	ArrayList<Integer> ans=new ArrayList<Integer>();
	Collections.sort(A,Collections.reverseOrder());
	HashMap<Integer, Integer> mp= new HashMap<Integer, Integer>();
	for (int i = 0; i < ans.size(); i++) {
		int x=A.get(i);
	if (mp.containsKey(x) && mp.get(x) > 0)
        mp.put(x, mp.get(x) - 1);
    else {
        for (int j = 0; j < ans.size(); j++) {
            int g = gcd(ans.get(j), x);

            if (mp.containsKey(g))
                mp.put(g, mp.get(g) + 2);
            else
                mp.put(g, 2);
                
            // we are adding 2 to the mp as there will 2 pairs gcd(ans[j],A[i]) and gcd(A[i],ans[j])
        }
        ans.add(x);
    }
}
return ans;
		
	}
	public static int gcd(int A,int B) {
		if(B==0) {
			return A;
		}
		return gcd(B,A%B);
		
	}

}
