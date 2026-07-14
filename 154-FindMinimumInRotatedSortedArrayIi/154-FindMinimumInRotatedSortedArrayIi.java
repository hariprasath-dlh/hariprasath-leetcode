// Last updated: 14/07/2026, 15:15:20
class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}