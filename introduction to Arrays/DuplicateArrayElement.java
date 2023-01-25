import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateArrayElement {
	public static List<Integer> duplicate(int[] arr,int n)
	{
		List<Integer> res=new ArrayList<Integer>();

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
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index+1)
			{  
				res.add(arr[index]); 
			}
		}
		return res;
	}
	public static void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		 arr[first]=arr[second];
		 arr[second]=temp;
		
	}
		public static void main(String[] args) {

		    Scanner sc=new Scanner(System.in);
	        int n =sc.nextInt();
	        int[] a=new int[n];
	        for(int i=0;i<n;i++)
	        {
	        	a[i]=sc.nextInt();
	        }
	        List<Integer> output = duplicate(a, n);
	      //  for(int i=0;i<n;i++)
	        System.out.println(output);

		}

	}
