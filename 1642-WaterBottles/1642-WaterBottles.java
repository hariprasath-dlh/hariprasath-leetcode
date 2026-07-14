// Last updated: 14/07/2026, 15:14:40
class Solution {
    public int numWaterBottles(int n1, int n2) {
        return n1+(n1-1)/(n2-1);
    }
}