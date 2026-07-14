// Last updated: 14/07/2026, 15:15:04
class Solution {
    public int addDigits(int n) {
        int sum=0;
        if(n==0){
            return 0;
        }
        if(n%9==0){
            return 9;
        }
        else{
            return n%9;
        }
    }
}