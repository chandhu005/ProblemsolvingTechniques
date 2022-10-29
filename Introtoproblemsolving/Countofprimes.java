package Introductiontoproblemsolving;


public class Countofprimes {
    public int solve(int A) {
         int pmcount=0;    
       
        for(int i=1;i<=A;i++){
            int count=0;
            for(int j=1;j<=i/j;j++){
                if(i%j==0){
                    if(j==i/j)
                    count++;
                    else
                    count=count+2;
                }
            }
            if(count==2)
            pmcount++;

        }
        return pmcount;
        
    }
}
