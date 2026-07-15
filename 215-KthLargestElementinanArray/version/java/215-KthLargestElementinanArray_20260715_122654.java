// Last updated: 15/07/2026, 12:26:54
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int i=0;
4        while(i<nums.length-1){
5            if(nums[i] == nums[i+1]){
6                i = i+2;
7            }
8            else{
9                return nums[i];
10            }
11        }
12        return nums[nums.length-1];
13    }
14}