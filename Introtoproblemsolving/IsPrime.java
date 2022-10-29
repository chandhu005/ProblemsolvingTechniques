package Introductiontoproblemsolving;


public class IsPrime {
    public int solve(long A) {
        int cnt=0;
        double sq=  Math.sqrt(A);
        if(A==0 || A==1){
            return 0;
        }
       
        for(int i=1;i<=sq;i++){
            if(A%i==0){
                if(i != A/i)
                    cnt += 2;
                else
                    cnt++;
            }
        }
        if(cnt>2)
        return 0;
        else
        return 1;
    
    }
}
