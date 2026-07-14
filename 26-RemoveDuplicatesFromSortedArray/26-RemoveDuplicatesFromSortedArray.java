// Last updated: 14/07/2026, 15:15:23
class Solution {
    public int removeDuplicates(int[] nums) {
        int store =0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] !=nums[store]){
                store++;
                nums[store] = nums[i];
            }
        }
        return store +1;
    }
}