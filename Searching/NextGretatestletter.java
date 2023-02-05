package BinarySearch;

public class NextGretatestletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static char nextGreatestLetter(char[] letters, char Target) {
		int start=0; int end=letters.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(letters[mid]>Target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return letters[start%letters.length];
	}

}
