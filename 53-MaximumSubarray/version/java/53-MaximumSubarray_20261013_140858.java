// Last updated: 13/10/2026, 14:08:58
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int cursum = 0;
4        int max = Integer.MIN_VALUE;
5        for(int i=0; i<nums.length; i++){
6            int temp = cursum + nums[i];
7            if(temp < nums[i]){
8                cursum = nums[i];
9            }
10            else{
11                cursum = temp;
12            }
13            if(max < cursum){
14                max = cursum;
15            }
16        }
17        return max;
18    }
19}