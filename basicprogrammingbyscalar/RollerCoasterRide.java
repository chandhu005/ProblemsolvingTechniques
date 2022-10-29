package BasicProgramming;
import java.util.Scanner;
public class RollerCoasterRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        int minage=scan.nextInt();
        if(minage>=13){
            System.out.print("You can ride the roller coaster!");
        }
        else{
            System.out.print("You can't ride the roller coaster.");
        }
	}

}
