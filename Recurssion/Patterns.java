package Recusrion;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
traingle(4, 0);
	}
	static void traingle(int row,int col) {
		if(row==0) {
			return;
		}
		if(col<row) {
			System.out.print("*");
			traingle(row, col+1);
		}
		else {
			System.out.println();
			traingle(row-1, 0);
		}
	}

}
