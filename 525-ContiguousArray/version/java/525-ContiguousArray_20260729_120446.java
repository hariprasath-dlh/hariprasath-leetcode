// Last updated: 29/07/2026, 12:04:46
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, -1);
5        int sum = 0;
6        int maxLength = 0;
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] == 0)
9                sum--;
10            else
11                sum++;
12            if (map.containsKey(sum)) {
13                int length = i - map.get(sum);
14                if (length > maxLength)
15                    maxLength = length;
16            } else {
17                map.put(sum, i);
18            }
19        }
20        return maxLength;
21    }
22}