import java.util.Scanner;

public class cyclicSort {

	public static void Sort(int arr[], int n)
	{
		int i=0;
		while(i<n)
		{
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct])
			{
				swap(arr,i,correct);
			}
			else
			{
				i++;
			}
		}
	}
	public static void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		 arr[first]=arr[second];
		 arr[second]=temp;
		
	}
	
	public static void main(String[] args) 
	{
		  Scanner sc=new Scanner(System.in);
		     int n=sc.nextInt();
		     int[] arr=new int[n];
		     
		     for(int i=0;i<n;i++)
		     {
		    	 arr[i]=sc.nextInt();
		     }
		     new cyclicSort().Sort(arr,n);
		     
		     for(int i=0;i<n;i++)
		     {
		    	 System.out.println(arr[i]);
		     }
	}
}


