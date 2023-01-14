package maths;

public class CounttrilingZeroesinfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //System.out.println(countofTrailingZeroes(10));
     System.out.println(Countoftrail(100));
	}
/*public static  int countofTrailingZeroes(int n) {
	
		int fact=1;
		for(int i=2;i<n;i++) {
			fact=fact*i;
	} 
		int count=1;
		while(fact%10==0) {
			count++;
			fact=fact/10;
			//fact--;
		}
		return count;
}
*/
public static int Countoftrail(int n) {
	int res=0;
	for(int i=5;i<=n;i=i*5) {
		res=res+n/i;
	}
	return res;
}
}
