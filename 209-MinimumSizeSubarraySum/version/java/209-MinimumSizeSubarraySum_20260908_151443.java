// Last updated: 08/09/2026, 15:14:43
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int start = 0;
4        int sum = 0;
5        int minLength = nums.length + 1;
6        for (int end = 0; end < nums.length; end++) {
7            sum = sum + nums[end];
8            while (sum >= target) {
9                int length = end - start + 1;
10                if (length < minLength) {
11                    minLength = length;
12                }
13                sum = sum - nums[start];
14                start++;
15            }
16        }
17        if (minLength == nums.length + 1) {
18            return 0;
19        }
20        return minLength;
21    }
22}