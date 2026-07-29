// Last updated: 29/07/2026, 12:36:59
1class Solution {
2    public int minMoves(int[] nums) {
3        int min = nums[0];
4        for(int i=0; i<nums.length; i++){
5            if(nums[i] < min){
6                min = nums[i];
7            }
8        }
9        int move = 0;
10        for(int i=0; i<nums.length; i++){
11            move = move+(nums[i]-min);
12        }
13        return move;
14    }
15}