// Last updated: 02/09/2026, 09:13:18
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, -1);
5        int sum = 0;
6        for(int i = 0; i < nums.length; i++) {
7            sum = (sum + nums[i]) % k;
8            if(map.containsKey(sum)) {
9                if(i - map.get(sum) >= 2)
10                    return true;
11            }
12            else
13                map.put(sum, i);
14        }
15        return false;
16    }
17}