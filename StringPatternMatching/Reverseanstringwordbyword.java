package Patternmatching;

public class Reverseanstringwordbyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="Scaler is coding school";
          System.out.println(reverseanword(s));
           
	}
	public static String reverseanword(String A) {
		String b=A.trim();// will removes all trailing spaces 
		String[] words=b.split("\\s");
		StringBuilder sb=  new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]+" ");
		}
		return sb.toString().trim();
	}

}
