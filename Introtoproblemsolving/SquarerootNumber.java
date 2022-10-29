package Introductiontoproblemsolving;


public class SquarerootNumber {
    public int solve(int A) {
        int rvalue=0;
    double sqrta=Math.sqrt(A);
        for(int i=0;i<=sqrta;i++){
            if(sqrta==i){
                rvalue=i;
                break;
            }
            else
            rvalue=-1;
        }
        return rvalue;
    }
}
