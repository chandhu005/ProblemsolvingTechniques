package ArraysAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Add1tonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		*/
		//System.out.println(addPlusone(arr));
		ArrayList<Integer> ar=new ArrayList<>();
	            ar.add(0);
	            ar.add(0);
	            ar.add(8);
	            ar.add(2);
	            ar.add(7);
	            System.out.println(addone(ar));
		
	}
	/*
	public static int[] addonenumber(int[] A) {
		int size=A.length;
		//check from last basic mathematics
		//7,2,3 last number!=9 then ans 724;
		// if 999 last number is 0;
		//arr[0]=1;
		for(int i=size-1;i>=0;i++) {
			if(A[i]!=9) {
				A[i]++;
				return A;
			}
			else {
				A[i]=0;
			}
		}
		int arr[]=new int[size+1];
		arr[0]=1;
		return arr;
	}
	public static int[] addPlusone(int[] A) {
		int[] arr=addonenumber(A);
		int size=arr.length;
		int index=-1;
		//removing leading zeroes 
		for(int i=0;i<size;i++) {
			if(arr[i]!=0) {
				index=i;
				break;
			}
		}
		int res[]=new int[size-index];
		 for(int i = 0; i< size-index; i++){
	            res[i] = arr[index + i];
	        }
	        return res;
		
	}
*/
public static ArrayList<Integer> addone(ArrayList<Integer> A){
	int carry=1;
	int num;
	int size=A.size();
	// travesing the number in reverse order
	for(int i=size-1;i>=0;i--) {
		num=A.get(i);
		num=num+carry;
		carry=0;
		if(num==10) {
			num=0;
			carry=1;
		}
		A.set(i, num);
	}
	ArrayList<Integer> res = new ArrayList<Integer>();
    
    if (carry == 1)
        res.add(1);
    for (int x : A) {
        if (x == 0 && res.size() == 0)
            continue;
        res.add(x);
    }
    
    return res;
	
	
}

}



















