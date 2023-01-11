package BitManupulation;

import java.util.Scanner;

public class CountNuberofsetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		System.out.println(numSetBits(A));
		

	}
	/*2 0 1 0
	 *  0 0 1 
	 * 
	 */
	public static  int numSetBits(int A) {
		int cnt=0;int k=1;
		for(int i=0;i<32;i++) {
			if(((A&k))!=0) {
				//System.out.print(A&k);
				cnt++;
			}
			k=k<<1;
			
			
		}
		return cnt;	

}
}
