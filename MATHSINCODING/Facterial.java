package maths;

public class Facterial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(fact(6));
 System.out.println(Recfact(5));
	}
	public  static int fact(int n) {
		int fact=1;
		for(int i=1;i<n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static int Recfact(int n) {
		if(n==1)
			return 1;
		 return Recfact(n-1)*n;
	}

}
