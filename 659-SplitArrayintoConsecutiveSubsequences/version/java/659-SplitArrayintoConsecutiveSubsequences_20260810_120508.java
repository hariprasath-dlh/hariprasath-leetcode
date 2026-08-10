// Last updated: 10/08/2026, 12:05:08
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int n = nums.length;
4        int[] min = new int[n];
5        min[n - 1] = nums[n - 1];
6        for (int i = n - 2; i >= 0; i--){
7            min[i] = Math.min(nums[i], min[i + 1]);
8        }
9        int max = nums[0];
10        for (int i = 0; i < n - 1; i++) {
11            max = Math.max(max, nums[i]);
12            if (max <= min[i + 1]){
13                return i + 1;
14            }
15        }
16        return -1;
17    }
18}