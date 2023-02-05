package BinarySearch;

public class order_ofAgnosticBinarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int ordeeragnosticbs(int A[],int target) {
		int start=0;int end=A.length-1;
		int low=0; int high=A.length-1;
		boolean isAsc=A[low]<A[high];
		
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(A[mid]==target) {
				return mid;
			}
			if(isAsc) 
			{
				 if(A[mid]>target) 
				{
					high=mid-1;
				}
				else 
				{
					low=mid+1;
				}
				
			}
			else {
				 if(A[mid]<target) 
					{
						high=mid-1;
					}
					else 
					{
						low=mid+1;
					}
			}
			
		}
		return -1;
	}
	

}
