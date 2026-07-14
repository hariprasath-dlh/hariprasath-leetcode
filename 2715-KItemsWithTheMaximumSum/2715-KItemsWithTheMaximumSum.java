// Last updated: 14/07/2026, 15:14:23
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        int ones=Math.min(k,numOnes);
        sum=sum+ones;
        k=k-ones;

        int zeros=Math.min(k,numZeros);
        k=k-zeros;

        sum=sum-k;
        return sum;
    }
}