package Patternmatching;

public class RabinKarpAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String text="";
  String pattern="";
  //search(pattern,text);
	}
	 public int solve(String T, String W) {
	        long mode=1000*1000*1000+7;
	        long N=T.length();
	        long K=W.length();
	        int functionT=0;
	        int functionW=0;
	        int primeno=31;
	        int count=0;
	        for(int i=0;i<K;i++){
	            int powno=(int)Math.pow(primeno,i);
	            functionW=(int) ((functionW+W.charAt(i)*powno)%mode);
	            functionT=(int) ((functionT+T.charAt(i)*powno)%mode);
	        }
	        if(functionT==functionW){
	            count++;
	        }
	        int start=1;int end=(int) K;
	        while(end<N){
	            int startpow=(int)Math.pow(primeno,start-1);
	            int endpow=(int)Math.pow(primeno,end);
	            functionT=(int) (((functionT-T.charAt(start-1)*startpow)+(T.charAt(end)*endpow*mode))%mode);
	            functionW=(int) ((functionW*primeno)%mode);
	            if(functionT==functionW){
	                count++;
	            }
	            start++;
	            end++;
	        }
	        return count;
	    }

}
