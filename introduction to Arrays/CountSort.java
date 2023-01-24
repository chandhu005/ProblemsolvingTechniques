import java.util.Scanner;

public class CountSort 
{
	public static void bubbleSort(int arr[], int n)
    {        
        int max=0;
        for(int i=0;i<n;i++)
        {
          max=Math.max(max,arr[i]);
        }
        int[] count=new int[max+1];
        int[] res=new int[n];
        for(int i=0;i<=max;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            ++count[arr[i]];
        }
        for(int i=1;i<=max;i++)
        {
            count[i]=count[i]+count[i-1];
        }     

        for(int i=n-1;i>=0;i--)
        {
            res[count[arr[i]]-1]=arr[i];
         --count[arr[i]];
        }
        
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }
        
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
     new CountSort().bubbleSort(arr,n);
     
     for(int i=0;i<n;i++)
     {
    	 System.out.println(arr[i]);
     }
	}

}
