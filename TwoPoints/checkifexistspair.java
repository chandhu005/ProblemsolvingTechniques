class Solution{
  boolean check(int A[],int B){
    int p1=0; int p2=A.length-1;
    int N=A.length;
    while(p2<N){
      if(A[p2]-A[p1]==B){
        return true;
      }
      if(A[p2]-A[p1]>B){
        p1++;
      }
      else
        p2++;
    }
    return false;
  }
    
}
