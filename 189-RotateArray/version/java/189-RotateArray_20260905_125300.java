// Last updated: 05/09/2026, 12:53:00
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5        int[] result = new int[n];
6        for (int i = 0; i < n; i++) {
7            result[(i + k) % n] = nums[i];
8        }
9        for (int i = 0; i < n; i++) {
10            nums[i] = result[i];
11        }
12    }
13}