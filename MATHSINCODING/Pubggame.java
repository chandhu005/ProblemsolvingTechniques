package maths;

import java.util.Scanner;

public class Pubggame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		System.out.println(healthOFPlayer(A));

	}
	/*A = [2, 3, 4]
	 * There are N players, each with strength A[i]. 
	 * when player i attack player j, player j strength reduces to max(0, A[j]-A[i]). 
	 * When a player's strength reaches zero, it loses the game, and the game continues in the same manner among other players until only 1 survivor remains.

      *Can you tell the minimum health last surviving person can have?
	 * 
	 */
public static int healthOFPlayer(int[] A) {
	int ans=0;
	for(int i=0;i<A.length;i++) {
		ans=gcd(ans,A[i]);
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
