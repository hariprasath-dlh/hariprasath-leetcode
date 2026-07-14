// Last updated: 14/07/2026, 15:14:54
class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        int move = 0;
        for(int i=0; i<nums.length; i++){
            move = move+(nums[i]-min);
        }
        return move;
    }
}