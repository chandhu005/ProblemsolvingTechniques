import java.util.Scanner;

public class missingNumber {

	public static int missing(int[] arr,int n)
	{
		int i=0;
		while(i<n)
		{
			int correct=arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[correct])
			{
				swap(arr,i,correct);
			}
			else
			{
				i++;
			}
		}
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index)
			{   return index; 
			}
		}
		return arr.length;
	}
	public static  void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		 arr[first]=arr[second];
		 arr[second]=temp;		
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int[] arr=new int[n];
	     
	     for(int i=0;i<n;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     new missingNumber().missing(arr,n);
    	System.out.println(missing(arr,n));
	    
	}

}
