// Last updated: 14/07/2026, 15:14:27
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int i=1; i<=a&i<=b; i++){
            if((a%i==0) && (b%i==0)){
                count++;
            }
        }
        return count;
    }
}