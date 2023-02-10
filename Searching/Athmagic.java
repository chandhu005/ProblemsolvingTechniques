public class Solution {
public int solve(int A, int B, int C) {
return calculateAthSmallestNumber(A,B,C);
}

public static int calculateAthSmallestNumber(int A, int B, int C){
long a = A;
long b = B;
long c = C;
int mod = 1000000007;
long left = 1;
long right = a * Math.min(B, C);
long ans = -1;
while(left<=right){
long mid = (left+right)/2;
if(totalMagicNumber(mid,b,c)>=a){
ans = mid;
right = mid-1;
}
else{
left = mid+1;
}
}
return (int)(ans%mod);
}

// for calculating total magical number till mid.
public static long totalMagicNumber(long mid, long b, long c){
long lcm = (b*c)/gcd(b,c); // LCM = (no1 * no2 / HCF(no1, no2))
return (((mid/b)+(mid/c))-(mid/lcm));
}

// for calculating GCD
public static long gcd(long a, long b)
{
if (a == 0)
return b;
return gcd(b % a, a);
}
}
