import java.util.Scanner;

public class LeastAverage {
//	public static int solve(int[] A, int B) 
//	{
//        int Pf[]=new int[A.length];
//        Pf[0]=A[0];
//        for(int i=1;i<A.length;i++)
//        {
//            Pf[i]=Pf[i-1]+A[i];
//            System.out.println(Pf[i]+i);
//        }
//       
//        // pf sum=3 10 100 120 130 180 220
//        int left=0;
//        int Right=Pf.length;
//        int min=Pf[B-1];
//        int sum=0;
//        int res=0;
//        for(int i=B;i<Right;i++)
//        {
//        	
//            sum=Pf[i]-Pf[i-B];
//            System.out.println(sum);
//            if(sum<min)
//            {
//            
//            int val=(i-B);
//            res=val+1;
//            
//          }
//          
//        }
//		return res;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		  Scanner sc=new Scanner(System.in);
//	        int n =sc.nextInt();
//	        int[] output =new int[n];
//	        for(int i=0;i<n;i++)
//	        {
//	        	output[i]=sc.nextInt();
//	        }
//	        int k=sc.nextInt();
//          System.out.println(solve(output,k));
//	}
////	14
////	18, 11, 16, 19, 11, 9, 8, 15, 3,10, 9,20, 1,19
//	
//	
//}
	public static void main(String args[]) {  
        System.out.println(getValue(getValue(0)));
}

static int getValue()
{
 return 35;
}
private static int getValue(int num)
{
 return 30 + num;
}
}

