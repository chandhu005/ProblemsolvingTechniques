package Introductiontoproblemsolving;


public class Countoffactors {
public int solve(int A) {
        int cnt=0;
        int sq = (int) Math.sqrt(A);
        for(int i=1; i<=sq; i++) {
            if(A%i == 0) {
                if(i != A/i)
                    cnt += 2;
                else
                    cnt++;
            }
        }
        return cnt;
    }


}
