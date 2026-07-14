// Last updated: 14/07/2026, 15:15:22
class Solution {
    public int climbStairs(int n) {
         if (n <= 3) return n;  
        
        int n1 = 1, n2 = 2, n3 = 3, n4 = 0;
        
        while (n-- > 3) {  
            n4 = n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = n4;
   
        }
        
        return n4;
    }
}