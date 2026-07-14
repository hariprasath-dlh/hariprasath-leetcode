// Last updated: 14/07/2026, 15:14:29
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else{
            return n*2;
        }
    }
}