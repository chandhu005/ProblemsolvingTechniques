import java.util.ArrayList;
import java.util.Scanner;

public class longestCommonPrefix {

    public static String CommonPrefix(String[] A) 
    {
        String s=A[0];
        for(int i=1;i<A.length;i++)
        {
        	//System.out.println(s);
           
               s=check(s,A[i]);
               
        }
        return s;
    
    }
    public static String check(String s1,String s2){
        int n=0;
//        if(s1.length()>s2.length()){
//            n=s1.length();
//        }
//        else{
//            n=s2.length();
//        }
        String res="";
        for(int i=0;i<s1.length() && i<s2.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i)){
                
                res=res+s1.charAt(i);
            }
            else{
                break;
            }
        }
        return res;
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();

String[] arr= {"abcd","ab","abc","aa"};
//for(int i=0;i<n;i++)
//{
//	arr[i]=sc.nextLine();
//	
//}
String result=CommonPrefix(arr);
System.out.println(result);

	}

}
