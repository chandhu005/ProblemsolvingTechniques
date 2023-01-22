package ArraysAdvanced;

public class ContinousSumQuery {

		public int[] prefixSum(int[] A){
        int[] pref = A;
        for(int i = 1; i < A.length; i++){
            pref[i] += pref[i - 1];
        }
        return pref;
    }
    public int[] solve(int A, int[][] B) {
        int[] coins = new int[A];
        for (int i = 0; i < A; i++) coins[i] = 0;
        // coins is an array which denotes the number of coins that each beggar has. Initially each beggar has 0 coins.
        for (int i = 0; i < B.length; i++) {
            int leftIndex = B[i][0] - 1, rightIndex = B[i][1] - 1;
            int donationByDevotee = B[i][2];
            coins[leftIndex] += donationByDevotee;
            if ((rightIndex + 1) < A) coins[rightIndex + 1] -= donationByDevotee;
        }
        int[] ans = prefixSum(coins);
        return ans;
    }

}
