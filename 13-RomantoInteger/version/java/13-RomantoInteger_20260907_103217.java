// Last updated: 07/09/2026, 10:32:17
1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0 || x == 1) {
4            return x;
5        }
6        int i = 1;
7        while ((long) i * i <= x) {
8            i++;
9        }
10        return i - 1;
11    }
12}